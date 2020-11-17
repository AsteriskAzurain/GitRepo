package com.ishang.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ishang.utils.Department;

import net.sf.json.JSONArray;

public class SY3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1=new Department();
		Department d2=new Department();
		Department d3=new Department();
		Department d4=new Department();
		Department d5=new Department();
		Department d6=new Department();
		
		d1.setAll(1, "科研中心", 0);
		d2.setAll(2, "行政中心", 0);
		d3.setAll(3, "宣传部", 2);
		d4.setAll(4, "人事部", 2);
		d5.setAll(5, "招聘组", 4);
		d6.setAll(6,"研发部",1);
		
		List<Map<String, Object>> l=new ArrayList();
		l.add(putMap(d1));
		l.add(putMap(d2));
		l.add(putMap(d3));
		l.add(putMap(d4));
		l.add(putMap(d5));
		l.add(putMap(d6));
		
//		System.out.println(tree(l));
//		System.out.println("-----------");
//		System.out.println("递归方法");
//		System.out.println(RecursionTree(l, 0));
//		List2Str(RecursionTree(l, 0));
		List<Map<String, Object>> list = RecursionTree(l, 0);
		JSONArray json = JSONArray.fromObject(list);
		 System.out.println(json);
	}
	public static Map<String, Object> putMap(Department d) {
		Map<String, Object> m=new HashMap();
		m.put("ID", d.getID());
		m.put("Name", d.getName());
		m.put("ParentID", d.getParentid());
		return m;
	}
	
	public static String tree(List<Map<String, Object>> list) {
		String rst="非递归方法：\n";
		for(Map<String, Object> dept:list) {
			String str="";
			String start=dept.get("Name").toString()+"下属有";
			str+=start;
			for(Map<String, Object> child:list) {
				if(child.get("ParentID").equals(dept.get("ID")))
					str+=child.get("Name").toString();
			}
			if(!(start.equalsIgnoreCase(str))) {rst+=(str+"\n");}
//			if(dept.get("ID").equals(0)) continue;
//			dept.put("c_node", value);
			
		}
		return rst;
	}
	public static List<Map<String, Object>> RecursionTree(List<Map<String, Object>> list,int parentid) {
		List<Map<String, Object>> childList=new ArrayList<Map<String,Object>>();
		for(Map<String, Object> dept:list) {
			int id=(int) dept.get("ID");
			int pid=(int)dept.get("ParentID");
			
			if(pid==parentid) {
				List<Map<String, Object>> childnode=RecursionTree(list, id);
				dept.put("下级部门", childnode);
				childList.add(dept);
			}
		}
		return childList;
	}
	
	public static void List2Str(List<Map<String, Object>> src) {
		for(Map<String,Object> s:src) {
			System.out.println(s.get("Name").toString());
			if(((List<Map<String, Object>>) s.get("ChildDept")).size()>0) {
				System.out.println(s.get("Name").toString()+"下属有：");
				List2Str((List<Map<String, Object>>) s.get("ChildDept"));
			}
		}
		
	}

}
