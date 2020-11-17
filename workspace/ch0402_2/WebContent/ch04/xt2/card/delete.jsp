<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名片管理系统 - 删除</title>
<link rel="stylesheet" href="../css/Style.css" type="text/css" />
</head>
<body>
<%String uname=new String((request.getParameter("owner")).getBytes("ISO-8859-1"),"GBK"); %>
<h5>欢迎【<%=uname %>】</h5>
	<h2>删除名片</h2>


	<form action="" method="post" class="loaddiv">
		<h5>查找名片</h5>
		请输入名片id：<input type="text" name=cardid /><br>
		<br> <input type="submit" value="加载" />
		<p>
	</form>
<p>
	<div name="result">此处应有返回结果</div>

</body>
</html>