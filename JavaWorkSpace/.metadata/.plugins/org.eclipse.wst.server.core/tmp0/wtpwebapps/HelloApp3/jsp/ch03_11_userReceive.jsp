<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接收验证</title>
</head>
<body>
	<% String name = request.getParameter("userName");
	   String password  = request.getParameter("userPwd");	
	   if(name.equals("abc") && password.equals("123456")){
		   
	 
	%>
	<jsp:forward page="ch03_11_loginCorrect.jsp"></jsp:forward>
	<%   } else {
		
		response.sendRedirect("http://www.baidu.com");
	}%>
</body>
</html>