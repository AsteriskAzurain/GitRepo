<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示界面</title>
</head>
<body style="line-height: 40px;">
	<c:forEach items="${list}" var="l">
			&emsp;您的姓名：${l.rname}<br>
			&emsp;您的性别：${l.rsex}<br>
			&emsp;您的出生年月：${l.ryear }年${l.rmonth }月<br>
			&emsp;您的民族：${l.rrace }<br>
			&emsp;您的自我介绍：${l.rintro }<br>
	</c:forEach>

</body>
</html>