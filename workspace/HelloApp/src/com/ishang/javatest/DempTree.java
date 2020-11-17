package com.ishang.javatest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class DempTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DempTree demo = new DempTree();
        List<Department> jsonArray = new ArrayList<>();
        Department menu1 = new Department();
        menu1.setId(1);
        menu1.setName("科研中心");
        menu1.setParentId(0);
        menu1.setLevel(0);
        Department menu2 = new Department();
        menu2.setId(2);
        menu2.setName("行政中心");
        menu2.setParentId(0);
        menu2.setLevel(0);
        Department menu3 = new Department();
        menu3.setId(3);
        menu3.setName("宣传部");
        menu3.setParentId(2);
        menu3.setLevel(1);
        Department menu4 = new Department();
        menu4.setId(4);
        menu4.setName("人事部");
        menu4.setParentId(2);
        menu4.setLevel(1);
        Department menu5 = new Department();
        menu5.setId(5);
        menu5.setName("招聘组");
        menu5.setParentId(4);
        menu5.setLevel(2);
        Department menu6 = new Department();
        menu6.setId(6);
        menu6.setName("研发部");
        menu6.setParentId(1);
        menu6.setLevel(1);
 
        jsonArray.add(menu1);
        jsonArray.add(menu2);
        jsonArray.add(menu3);
        jsonArray.add(menu4);
        jsonArray.add(menu5);
        jsonArray.add(menu6);
 
        for(Department demp:jsonArray) {
        	System.out.println(demp.getName());
        }
        

	}
	
	public List<Department> treeMenuList(JSONArray menuList, int parentId) {
        JSONArray childMenu = new JSONArray();
        for (Object object : menuList) {
            JSONObject jsonMenu = JSONObject.fromObject(object);
            int menuId = jsonMenu.getInt("id");
            int pid = jsonMenu.getInt("parentId");
            if (parentId == pid) {
            	List<Department> c_node = treeMenuList(menuList, menuId);
                jsonMenu.put("childNode", c_node);
                childMenu.add(jsonMenu);
            }
        }
        return childMenu;
    }


}
