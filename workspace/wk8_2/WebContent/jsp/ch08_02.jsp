<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
  <head><title>访问集合中的元素</title></head>  
  <body>
   <% String[] firstNames = {"龙","萍","杨"};  //定义数组
    ArrayList<String> lastNames = new ArrayList<String>();  //定义List
    lastNames.add("陈"); lastNames.add("邓"); lastNames.add("于");
    HashMap<String,String> roleNames = new HashMap<String,String>(); //定义Map
    roleNames.put("volunteer","志愿者");
    roleNames.put("missionary","工作人员");
    roleNames.put("athlete", "运动员");
    //使用request对象保留上面的定义
    request.setAttribute("first",firstNames);
    request.setAttribute("last",lastNames);
    request.setAttribute("role",roleNames);
   %>
    <h2>EL访问集合</h2>
    <ul>
       <li>${last[0]}${first[0]}:${role["volunteer"]}
       <li>${last[1]}${first[1]}:${role["athlete"]}
       <li>${last[2]}${first[2]}:${role["missionary"]}
   </ul>
  </body>
</html>
