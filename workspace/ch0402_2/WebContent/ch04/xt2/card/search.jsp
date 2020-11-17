<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String uname=new String((request.getParameter("owner")).getBytes("ISO-8859-1"),"GBK"); %>
<h5>欢迎【<%=uname %>】</h5>
</body>
</html>