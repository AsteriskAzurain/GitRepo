package com.ishang;

import java.util.HashMap;
import java.util.Map;

public class MesCompareService {
	public static void main(String[] args) {
		MesCompareService s = new MesCompareService();
		String[] mesLoctArr ={"111","222","333","4444"};
		String[] ebsLoctArr ={"111","222","333","5555"};
		Map<String,Object> reMap = s.mesLocation(mesLoctArr, ebsLoctArr);
		System.out.println(reMap);
	}
	
	public Map<String, Object> reMap(int reInt, String strMsg, Map<String, Object> reMap) {
		Map<String, Object> m = new HashMap<>();
		try{
			m.put("reInt", reInt);
			m.put("strMsg", strMsg);
			m.put("reMap", reMap);
		}catch(Exception e){
			m.put("reInt", 0);
		}
		return m;
	}

	
	public Map<String,Object> mesLocation(String[] mesLoctArr, String[] ebsLoctArr){ 
		String msg = "";		
		if(mesLoctArr==null) { 
			msg +="点位["+ebsLoctArr.toString()+"]不在EBS中;";
			return this.reMap(1, msg, null);
		}
		
		if(ebsLoctArr==null) { 
			msg +="点位["+mesLoctArr.toString()+"]不在MES中;";
			return this.reMap(1, msg, null);
		}
		
		for(String mesLoct : mesLoctArr) {
			boolean compare = true;
			for(String ebsLoct : ebsLoctArr) {
				if(mesLoct.trim().equals(ebsLoct)) {
					compare =  false;
				}
			}
			if(compare) {
				//mes中的点位不在EBS中 
				msg +="点位["+mesLoct+"]不在EBS中;";
			}
		}
		
		for(String ebsLoct : ebsLoctArr) {
			boolean compare = true;
			for(String mesLoct : mesLoctArr) {
				if(mesLoct.trim().equals(ebsLoct.trim())) {
					compare =  false;
				}
			}
			if(compare) {
				//mes中的点位不在EBS中 
				msg +="点位["+ebsLoct+"]不在MES中;";
			}
		}
		return this.reMap(1, msg, null);
	}
}
