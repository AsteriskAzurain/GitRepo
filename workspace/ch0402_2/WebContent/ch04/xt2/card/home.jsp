<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>名片管理系统</title>
</head>
<body>
<%String uname=new String((request.getParameter("uname")).getBytes("ISO-8859-1"),"GBK"); %>
<h3>欢迎您，【<%=uname %><!-- ${uname} -->】</h3>

<h1>名片管理系统</h1>
<div style="float:left">

<p><a href="insert.jsp?owner=<%= uname %>" target="right">添加名片信息</a></p>
<p><a href="modify.jsp?owner=<%= uname %>" target="right">修改名片信息</a></p>
<p><a href="delete.jsp?owner=<%= uname %>" target="right">删除名片信息</a></p>
<p><a href="search.jsp?owner=<%= uname %>" target="right">查询名片信息</a></p>

</div>

<iframe name="right" style="margin-left:50px;height:600px;width:1000px"></iframe>
</body>
</html>