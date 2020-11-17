package com.ishang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		List<Map<String,Object>> list = new ArrayList<>(6);

        Map<String,Object> department1 = new HashMap<>();
        department1.put("id","1");
        department1.put("parentId","0");
        department1.put("name","科研中心");

        Map<String,Object> department2 = new HashMap<>();
        department2.put("id","2");
        department2.put("parentId","0");
        department2.put("name","行政中心");

        Map<String,Object> department3 = new HashMap<>();
        department3.put("id","3");
        department3.put("parentId","2");
        department3.put("name","宣传�?");

        Map<String,Object> department4 = new HashMap<>();
        department4.put("id","4");
        department4.put("parentId","2");
        department4.put("name","人事�?");

        Map<String,Object> department5 = new HashMap<>();
        department5.put("id","5");
        department5.put("parentId","4");
        department5.put("name","招聘�?");

        Map<String,Object> department6 = new HashMap<>();
        department6.put("id","6");
        department6.put("parentId","1");
        department6.put("name","研发�?");

        list.add(department1);
        list.add(department2);
        list.add(department3);
        list.add(department4);
        list.add(department5);
        list.add(department6);

        list = treeMenuList(list,0);
        //打印
        System.out.println(list.toString());
        System.out.println(tree(list));

	}
	
	public static String tree(List<Map<String, Object>> list) {
		String rst="";
		for(Map<String, Object> dept:list) {
			rst+=dept.get("name").toString()+"下属�?";
			for(Map<String, Object> child:list) {
				if(child.get("parentId").equals(dept.get("id")))
					rst+=child.get("name").toString();
			} 			
		}
		return rst;
	}


	
	public static List<Map<String,Object>> treeMenuList(List<Map<String,Object>> menuList, int parentId) {
        List<Map<String,Object>> childMenu = new ArrayList<>();
        for (Map<String,Object> map : menuList) {

            int menuId = Integer.valueOf(map.get("id").toString());
            int pid = Integer.valueOf(map.get("parentId").toString());
            if (parentId == pid) {
                List<Map<String,Object>> c_node = treeMenuList(menuList, menuId);
                map.put("childNode", c_node);
                childMenu.add(map);
            }
        }
        return childMenu;
	}

	//2+22+222=246
	public static String test1(int a, int b) {
		int sum = 0;
		String rs = "";
		int total = 0;
		for (int i = 1; i <= b; i++) {
			sum += a;
			rs += String.valueOf(sum) + "+";
			total = total + sum;
			a = a * 10;
		}
		return rs.substring(0, rs.length() - 1) + "=" + total;
	}

	/**
	 * 输入�?100�?,3次， 经过次数�?3.0反弹高度�?12.5，经过距离：250.0
	 */
	public static String test2(double h, double n) {
		double sum = h;
		h = h / 2;
		for (int i = 2; i <= n; i++) {
			sum += 2 * h;
			h = h / 2;
			System.out.println("反弹高度�?" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum));
		}
		return "经过次数�?" + String.valueOf(n) + "反弹高度�?" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum);
	}
	
	public static String test22(double h, double n) {
		double sum = h; 
		for (int i = 0; i < n; i++) { 
			h = h / 2;
			sum += 2 * h; 
			System.out.println("反弹高度�?" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum));
		}
		return "经过次数�?" + String.valueOf(n) + "反弹高度�?" + String.valueOf(h) + "，经过距离：" + String.valueOf(sum);
	}
	
	

}
