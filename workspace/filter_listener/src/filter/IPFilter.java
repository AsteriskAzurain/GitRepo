package filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class IPFilter implements Filter {

	String filterIP;

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		filterIP = fConfig.getInitParameter("IPvalue");
		System.out.println(split2Str(filterIP));
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		String remoteIP = request.getRemoteAddr();
		System.out.println(remoteIP);
//		String testIP="219.218.0.1";
		String testIP="127.0.0.1";
		remoteIP=testIP;
//		if (xt1(remoteIP)) {
//			chain.doFilter(request, response);// 放行
//		} else {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
//			dispatcher.forward(request, response);
//		}
		if(compare(remoteIP,split2Str(filterIP))){
			chain.doFilter(request, response);// 放行
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
//			dispatcher.forward(request, response);
		}
	}

	public Boolean xt1(String ipstr) {
		String[] ips = ipstr.split("\\.");
		for (String s : ips) {
			System.out.println(s + '_');
		}
		if (ips[0].equals("219") && ips[1].equals("218")) {
			return true;
		}
		return false;
	}

	public ArrayList<String> split2Str(String str) {
		String[] ips = str.split("\\.");
		StringBuffer fromIP = new StringBuffer();
		StringBuffer endIP = new StringBuffer();
		ArrayList<String> rst=new ArrayList<String>();
		if (str.indexOf("*") > -1) {
			for (int i = 0; i < 4; i++) {
				String[] from = new String[] { "0", "0", "0", "0" };
				String[] end = new String[] { "255", "255", "255", "255" };
				if (ips[i].indexOf("*") > -1) {
					fromIP.append(from[i]);
					endIP.append(end[i]);
				} else {
					fromIP.append(ips[i]);
					endIP.append(ips[i]);
				}
				if(i<3) {
					fromIP.append(".");
					endIP.append(".");
				}
			}
			rst.add(fromIP.toString());
			rst.add(endIP.toString());
		}
		else {rst.add(str);}
		return rst;
	}
	
	public static Boolean compare(String str,ArrayList<String> strlist) {
//		System.out.println(str.compareTo(cp[0]));
//		System.out.println(str.compareTo(cp[1]));
//		if(str.compareTo(cp[0])>0&&str.compareTo(cp[1])<0) {System.out.println("passed");}
//		else {System.out.println("failed");}
		String[] cp= {strlist.get(0),strlist.get(1)};
		int[] iparr=new int[4]; iparr=str2int(str);
		int[] from=new int[4]; from=str2int(cp[0]);
		int[] end=new int[4]; end=str2int(cp[1]);
		if(cpArr(iparr, from)>0&&cpArr(iparr, end)<0) {System.out.println("passed");return true;}
		else {System.out.println("failed");return false;}
	}
	
	public static int[] str2int(String str) {
		String[] strarr=str.split("\\.");
		int[] intarr=new int[4];
		for(int i=0;i<4;i++) {
			intarr[i]=Integer.parseInt(strarr[i]);
		}
		return intarr;
	}
	public static int cpArr(int[] a,int[] b) {
		for(int i=0;i<4;i++) {
			int cp=cpInt(a[i],b[i]);
			if(cp>0) return 1;
			else if(cp<0) return -1;
		}
		return 0;
		}
	
	public static int cpInt(int a,int b) {
		if(a>b)return 1;
		else if(a==b)return 0;
		else return -1;
	}
	
}
