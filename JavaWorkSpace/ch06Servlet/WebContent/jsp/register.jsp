<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body style="line-height:40px;">
<form action="../RegistCheck" method="post">
姓名：<input type="text" name="uname" id="uname"><br>
性别：<input type="radio" name="sex" value="male" checked="checked">男    <input type="radio" name="sex" value="female">女<br>
出生年月：<input type=text" name="bir_year" style="width:50px">年<input type=text" name="bir_month" style="width:50px">月<br>
民族：<input type="text" name="race"><br>
个人介绍：<br><textarea rows="5" cols="50" name="intro" style="margin-left:50px"></textarea>
<br><br>
<input type="submit" value="提交">
</form>
</body>
</html>