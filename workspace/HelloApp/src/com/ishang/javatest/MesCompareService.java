package com.ishang.javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MesCompareService {
	public static void main(String[] args) {
		MesCompareService s = new MesCompareService();
		String[] mesLoctArr ={"111","222","333","4444"};
		String[] ebsLoctArr ={"111","222","333","5555"};
		List msg = s.mesLocation(mesLoctArr, ebsLoctArr);
		System.out.println(msg.toString());
		
	}
	
	//反馈信息
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
 
	
	public List mesLocation(String[] mesLoctArr, String[] ebsLoctArr){ 
		String msg = "";
		List list =new ArrayList<>();
		list.add(1); 
		list.add("操作完成");
		if(mesLoctArr==null) { 
			msg +="点位["+ebsLoctArr.toString()+"]不在EBS中;";
			list.add(msg);
			return list;
		}
		
		if(ebsLoctArr==null) { 
			msg +="点位["+mesLoctArr.toString()+"]不在MES中;";
			list.add(msg);
			return list;
		}
//		for(int i=0;i<=mesLoctArr.length;i++) {
//			String mesLoct = mesLoctArr[i];
//		}
		
		for(String mesLoct : mesLoctArr) {
			//mesLoctArr 1,2,3
			boolean compare = true;
			for(String ebsLoct : ebsLoctArr) {
				//ebsLoctArr 1,2,4
				if(mesLoct.trim().equals(ebsLoct.trim())) {
					compare =  false;
				}
			}
			if(compare) {
				//mes中的点位不在EBS中 
				msg +="点位["+mesLoct+"]不在EBS中;";
			}
		}
		
		for(String ebsLoct : ebsLoctArr) {
			//ebsLoctArr 1,2,4
			boolean compare = true;
			for(String mesLoct : mesLoctArr) {
				//mesLoctArr 1,2,3
				if(mesLoct.trim().equals(ebsLoct.trim())) {
					compare =  false;
				}
			}
			if(compare) {
				//mes中的点位不在EBS中 
				msg +="点位["+ebsLoct+"]不在MES中;";
			}
		}
		list.add(msg); 
		return list;
	}

}
