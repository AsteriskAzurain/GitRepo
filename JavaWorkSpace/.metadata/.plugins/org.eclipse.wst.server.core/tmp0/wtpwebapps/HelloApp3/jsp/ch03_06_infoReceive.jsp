<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>获取表单信息</title>
</head>
<body>
    <%  
         request.setCharacterEncoding("utf-8");
    	 String str1=request.getParameter("rdName");
         String str2=request.getParameter("phName");
   %>
   <font face="楷体" size=4 color=blue> 
        您输入的信息为：<br> 
        姓名：<%=str1%> <br>
        电话：<%=str2%><br> 
  </font>
</body>
</html>