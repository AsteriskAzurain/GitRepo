package testpkg;

import java.util.HashMap;
import java.util.Map;

public class EbsMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EbsMes s = new EbsMes();
		String[] mesLoctArr = { "111", "222", "333", "4444" };
		String[] ebsLoctArr = { "111", "222", "333", "5555" };
		Map<String, Object> reMap = s.mesLocation(mesLoctArr, ebsLoctArr);
		System.out.println(reMap);
	}

	public Map<String, Object> reMap(int reInt, String strMsg, Map<String, Object> reMap) {
		Map<String, Object> m = new HashMap<>();
		try {
			m.put("reInt", reInt);
			m.put("strMsg", strMsg);
			m.put("reMap", reMap);
		} catch (Exception e) {
			m.put("reInt", 0);
		}
		return m;
	}

	public Map<String, Object> mesLocation(String[] mesLoctArr, String[] ebsLoctArr) {
		String msg = "";
		if (mesLoctArr == null) {
			msg += "��λ[" + ebsLoctArr.toString() + "]����EBS��;";
			return this.reMap(1, msg, null);
		}
		if (ebsLoctArr == null) {
			msg += "��λ[" + mesLoctArr.toString() + "]����MES��;";
			return this.reMap(1, msg, null);
		}
		for (String mesLoct : mesLoctArr) {
			boolean compare = true;
			for (String ebsLoct : ebsLoctArr) {
				if (mesLoct.trim().equals(ebsLoct)) {
					compare = false;
				}
			}
			if (compare) { // mes�еĵ�λ����EBS��
				msg += "��λ[" + mesLoct + "]����EBS��;";
			}
		}

		for (String ebsLoct : ebsLoctArr) {
			boolean compare = true;
			for (String mesLoct : mesLoctArr) {
				if (mesLoct.trim().equals(ebsLoct.trim())) {
					compare = false;
				}
			}
			if (compare) { // mes�еĵ�λ����EBS��
				msg += "��λ[" + ebsLoct + "]����MES��;";
			}
		}
		return this.reMap(1, msg, null);
	}

}
