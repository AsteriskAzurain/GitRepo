<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>异步校验用户名、密码</title>
</head>
<body>
<form action="Second.jsp" method="post" name="userlogin">
登录名：<input type="text" name="username" /><br>
密码：<input type="password" name="userpswd" /><br>
<input type="submit" value="登陆" />
<div id="result">
<%
String str=(String)request.getSession().getAttribute("info");
if(str!=null)out.print(str);

/*
参照博客：初识jsp之登录—登录成功—登录失败页面
网址：https://blog.csdn.net/qq_37854641/article/details/61417357
*/
%>
</div> 
</form>
</body>
</html>