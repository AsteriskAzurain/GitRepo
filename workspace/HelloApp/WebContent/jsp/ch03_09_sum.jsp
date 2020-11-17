<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>计算值</title>
</head>
<body>
	数据1：<%=request.getParameter("shuju1") %>
	<br>
	数据2：<%=request.getParameter("shuju2") %>
	<br>
	合计： <%=Integer.valueOf(request.getParameter("shuju1"))+Integer.valueOf(request.getParameter("shuju2")) %>
	
</body>
</html>