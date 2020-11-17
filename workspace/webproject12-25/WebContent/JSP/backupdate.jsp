<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<script>
function show(){
	var storage = window.sessionStorage;
	var getid = storage.getItem("id");
	eid.value=getid;
}
	
	</script>
	<title>用户列表</title>
</head>
<body onload="show()">

<h2>更新用户</h2>
	<form action="backupdate.action">
	请输入用户id<input type="text" name="eid" id="eid"><br>
	请输入用户名<input type="text" name="username"><br>
	请输入密码<input type="password" name="password"><br>
	请输入性别<input type="text" name="sex"><br>
	请输入生日<input type="text" name="birthday"><br>
	请输入学校<input type="text" name="school"><br>
	<input type="submit" value="提交">
	<input type="reset" value="重置">
	
	
	</form>
	<a href="back.jsp">返回主页</a>
	<a href="backshowAll.jsp">返回显示用户界面</a>

</body>
</html>