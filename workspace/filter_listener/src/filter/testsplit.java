package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class testsplit {

	List<String> ipList=new ArrayList<>();
	private Pattern pattern = Pattern
			.compile("(1\\d{1,2}|2[0-4]\\d|25[0-5]|\\d{1,2})\\."
					+ "(1\\d{1,2}|2[0-4]\\d|25[0-5]|\\d{1,2})\\."
					+ "(1\\d{1,2}|2[0-4]\\d|25[0-5]|\\d{1,2})\\."
					+ "(1\\d{1,2}|2[0-4]\\d|25[0-5]|\\d{1,2})");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "219.218.*.*";
		testsplit t=new testsplit();
		t.split2Str(str);
		for(String s: t.ipList) {
			System.out.println(s);
		}
		
	}

	public void split2Str(String str) {
		for (String ipstr : str.replaceAll("\\s", "").split(";")) { // \s == space
			if (ipstr.indexOf("*") > -1) { // 如果ipstr中有*号
				String[] ips = ipstr.split("\\.");
				String[] from = new String[] { "0", "0", "0", "0" };
				String[] end = new String[] { "255", "255", "255", "255" };
				List<String> tem = new ArrayList<String>();
				for (int i = 0; i < ips.length; i++) {
					if (ips[i].indexOf("*") > -1) {  //拆分出的子列中有*的话
						tem = complete(ips[i]);
						from[i] = null;
						end[i] = null;
					} else {
						from[i] = ips[i];
						end[i] = ips[i];
					}
				}
				StringBuffer fromIP = new StringBuffer();
				StringBuffer endIP = new StringBuffer();
				for (int i = 0; i < 4; i++)
					if (from[i] != null) {
						fromIP.append(from[i]).append(".");
						endIP.append(end[i]).append(".");
					} else {
						fromIP.append("[*].");
						endIP.append("[*].");
					}
				fromIP.deleteCharAt(fromIP.length() - 1);
				endIP.deleteCharAt(endIP.length() - 1);

				for (String s : tem) {
					String ip = fromIP.toString().replace("[*]",
							s.split(";")[0])
							+ "-"
							+ endIP.toString().replace("[*]", s.split(";")[1]);
					if (validate(ip))
						ipList.add(ip);
				}
			} else {
				if (validate(str))
					ipList.add(str);
			}
			
		}
	}

	private List<String> complete(String arg) {
		List<String> com = new ArrayList<String>();
		if (arg.length() == 1) {
			com.add("0;255");
		} else if (arg.length() == 2) {
			String s1 = complete(arg, 1);
			if (s1 != null)
				com.add(s1);
			String s2 = complete(arg, 2);
			if (s2 != null)
				com.add(s2);
		} else {
			String s1 = complete(arg, 1);
			if (s1 != null)
				com.add(s1);
		}
		return com;
	}

	private String complete(String arg, int length) {
		String from = "";
		String end = "";
		if (length == 1) {
			from = arg.replace("*", "0");
			end = arg.replace("*", "9");
		} else {
			from = arg.replace("*", "00");
			end = arg.replace("*", "99");
		}
		if (Integer.valueOf(from) > 255)
			return null;
		if (Integer.valueOf(end) > 255)
			end = "255";
		return from + ";" + end;
	}
	private boolean validate(String ip) {
		for (String s : ip.split("-"))
			if (!pattern.matcher(s).matches()) {
				return false;
			}
		return true;
	}

}
