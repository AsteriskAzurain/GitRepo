<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆系统</title>
</head>
<body style="line-height:40px">
<form action="../../../carduser?flag=check" method="post">
<h2>登陆系统</h2>
用户名：<input type="text" name="uname" /><br>
密码：&emsp;<input type="password" name="upasswd" /><br>
<input type="submit" value="提交" />
</form>
</body>
</html>