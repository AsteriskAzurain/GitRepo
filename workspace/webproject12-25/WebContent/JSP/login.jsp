<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>登录界面</title>
<link href="../CSS/login.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<script>
</script>
</head>
<body>
	<div class="container">
		<video controls muted class="vid" loop autoplay>
			<source src="../project/sky.mp4" type="video/mp4">
		</video>
		<div>
		<div class="login">
				<form action="logincheck.action" method="post">
				<a class="msg"><s:property value="msg"/></a>
			
					<h1>登录</h1>
					<div class="input username">
						<input type="text" id="username" placeholder="用户名" name="username">
					</div>
					<div class="input password">
						<input type="password" id="password" placeholder="密码" name="password">
					</div>
					<div class="info">
						<a href="register.jsp">用户注册</a> <span>|</span> 
					
						<a href="modify.jsp">忘记密码</a>
					</div>
					<input type="submit" class="button"  value="登录">
				</form>
			</div>
		</div>
	</div>

</body>
</html>