package com.ishang.javatest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoTest {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(1);
		list.add(2);
		System.out.println(list.toString());
		
		List list1 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		System.out.println(list1.toString());
		
		List<List> list2 = new ArrayList<>();
		list2.add(list);	
		list2.add(list1);
		System.out.println(list2.toString());
		
		List<List> list3 = new ArrayList<>();
		list3.addAll(list)	;
		list3.addAll(list1)	;
		System.out.println(list3.toString());
		
		
		
		Map<String,Object> a = new HashMap<String,Object>();
		a.put("id", 1);
		a.put("name", "张三");
		a.put("pid", 0);
		
		int id = (int)a.get("id");
		String name = String.valueOf(a.get("name"));
	
		
		List<Map<String,Object>> list4 = new ArrayList<>();
		list4.add(a);
		
	}

}
