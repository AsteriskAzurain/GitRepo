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
<title>显示所有的学生页面</title>
</head>
<body>
	<form action="${url}/student?flag=showAll" method="post"> 
		<input type="submit" value="查询所有的数据"/> <br/>
            <table border="1"  cellspacing="0"> 
                 <thead>
                 	<tr align="center"><td width="120px">学号</td><td width="80px">姓名</td><td width="80px">性别</td><td width="80px">年龄</td><td width="80px">身高</td><td width="80px">体重</td></tr>
                 </thead>
                 <tbody>
			         <c:forEach items="${list}" var="list">
				         <tr>
				                <td>${list.id }</td>
				                <td>${list.name }</td>
				                <td>${list.sex }</td>
				                <td>${list.age }</td> 
				                <td>${list.hight }</td> 
				                <td>${list.weight }</td>  
				           <%-- <td><a href= "${url}/student?flag=update&id=${list.id}" style='text-decoration:none' onclick='update(this)'>修改&nbsp;</a> 
				                    <a href= "${url}/student?flag=del&id=${list.id}" style='text-decoration:none'>删除</a></td>  --%>
				         </tr>
			         </c:forEach>
                 </tbody>
            </table>
          </form>
</body>
</html>