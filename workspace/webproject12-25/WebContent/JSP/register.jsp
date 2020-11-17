<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link href="../CSS/register.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
<title>注册新用户</title>
<script type="text/javascript">
	function verify() {
		var userName = $("#username").val();
		var userPassword = $("#password").val();
		var userPassword2 = $("#password2").val();
		var re = /^(\(\d{3,4}\)|\d{3,4}-|\s)?\d{7,14}$/;
		if (!re.test(userName)) {
			alert("不是有效的手机号!");
			return false;
		} else if (userPassword.length == 0) {
			alert("密码不能为空!");
			return false;
		} else if (userPassword.length < 6) {
			alert("密码至少6位!");
			return false;
		} else if (userPassword != userPassword2) {
			alert("密码输入不相同!");
			return false;
		} else {
			window.location.href = "register.jsp"
		}
	}
</script>
</head>
<body>
	<div class="container">
		<div class="register">
	
				<form action="registercheck.action" method="post">
				<s:actionmessage/>
  	<span style="color:red"><s:actionerror/></span>

					<h1>注册用户</h1>
				    	<div class="input username">
						   <input type="text" id="username" name="username" placeholder="输入用户名">
					    </div>
				    	<div class="input password">
						   <input type="password" id="password" name="password" placeholder="请输入密码（至少6位）">
			     		</div>
				    	<div class="input password2">
						   <input type="password" id="password2" name="password2"placeholder="请重新输入密码">
						</div>
						<div class="input sex">
						   <input type="text" id="sex" name="sex"placeholder="请输入性别">
						</div>
						<div class="input birthday">
						   <input type="text" id="birthday" name="birthday"placeholder="请输入生日">
						</div>
						<div class="input school">
						   <input type="text" id="school" name="school"placeholder="请输入学校">
						</div>
						<div class="info">
						<a href="login.jsp">用户登录</a> 
					
					</div>
                       <div class="button">
                           <input type="submit" value="注册">
                       
                       </div>
                    
                      </form>
</div>
</div>

</body>
</html>