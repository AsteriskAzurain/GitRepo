<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>接收并验证</title>
</head>
<body>
<% 
String uname= request.getParameter("username");//访问请求参数
String upswd =request.getParameter("userpswd");
if(uname.equals("abc")&&upswd.equals("123")){
%>
<jsp:forward page="Third.jsp"></jsp:forward>
<% 
}else{
	//request.getParameter("result").inner="用户名或密码错误";
	request.getSession().setAttribute("info","用户名或密码错误");
	//PrintWriter pout=response.getWriter();
	//out.print("用户名或密码错误");
response.sendRedirect("First.jsp");//sendRedirect()函数的作用是重定向网页

}
%>

</body>
</html>