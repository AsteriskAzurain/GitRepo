
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../jar/ajax.js"></script>
<title>Show all information</title>
</head>
<body>
	<form action="${url}../book?flag=showall" method="post">
		<input type="submit" value="查询所有的数据" />
		<p />
		<table border="1" cellspacing="0">
			<thead>
				<tr align="center">
					<td width="80px">书码</td>
					<td width="80px">书名</td>
					<td width="80px">作者</td>
					<td width="80px">价格</td>
					<td width="120px">备注</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="l">
					<!-- items:要被循环的集合对象
						 var:迭代变量名称 -->
					<tr>
						<td>${l.bookid }</td>
						<td>${l.bookname }</td>
						<td>${l.author }</td>
						<td>${l.price }</td>
						<td>${l.notes }</td>
						<%-- <td><a href= "${url}/student?flag=update&id=${list.id}" style='text-decoration:none' onclick='update(this)'>修改&nbsp;</a> 
				                    <a href= "${url}/student?flag=del&id=${list.id}" style='text-decoration:none'>删除</a></td>  --%>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>