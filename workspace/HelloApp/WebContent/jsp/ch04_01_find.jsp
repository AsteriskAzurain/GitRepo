<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set scope="page" var="url" value="${pageContext.request.contextPath }"></c:set>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<script type="text/javascript" src="../js/ajax.js"></script>
<title>显示所有的学生页面</title>
</head>
<body>
	<form action="${url}/student?flag=find" method="post"> 
	 		<table>
	 			<tr>
	 				<td>学号</td><td><input type="text" name="id">&nbsp;&nbsp;</td>
	 				<td>姓名</td><td><input type="text" name="name">&nbsp;&nbsp;</td>
	 				<td>性别</td>
	 				<td>
	 					<select name="sex" >
	 						<option value="">--请选择--</option>
	 						<option value="男">男</option>
	 						<option value="女">女</option>
	 					</select>&nbsp;&nbsp;	 				
	 				</td>
	 				<td><input type="submit" value="查询">&nbsp;&nbsp;</td>
	 				<td><input type="reset" value="清空">&nbsp;&nbsp;</td>
	 			</tr>
	 		</table> 
	 </form>
</body>
</html>