<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理图书信息</title>
<script type="text/javascript" >
function divfind(){
	document.getElementById("findid").style.visibility="hidden";
}
</script>
</head>
<body>
	<h2>管理图书信息</h2>
	<div style="maigin: 20px; width: 40%; float: left"><div>
		<form method="post" style="border: dotted black 2px; padding: 20px; line-height: 40px">
			按书码管理：<br> 
			<input type="submit" formaction="${url}../book?flag=delete" value="删除"></input>&emsp; 
			<input type="submit" formaction="${url}../book?flag=findbyid" value="查找" ></input><br> 
			书码：<input name="id" type="text"></input>
		</form>
	</div>
	<br>
	<div style="margin-top:30px">
		<form method="post" style="border: dotted black 2px; padding: 20px; line-height: 40px">
			按书籍详情管理：<br> 
			<input type="submit" formaction="${url}../book?flag=findlike" value="查找""></input> <br>
			<div style="line-height: 35px">
				书码：<input name="id" type="text"></input><br> 
				书名：<input name="name" type="text"></input><br> 
				作者：<input name="author" type="text"></input><br>
			</div>
		</form>
	</div></div>
	<div style="margin-left: 50px; padding: 20px; border: black double 1px; width: 40%; min-height: 400px; float: left">
		<h3>显示查找结果</h3>
		<div id="findid" style="line-height: 35px">
			&emsp;书码：${book.bookid}<br>
			&emsp;书名：${book.bookname }<br>
			&emsp;作者：${book.author }<br> 
			&emsp;价格：${book.price }<br>
			&emsp;备注：${book.notes}<br>
		</div>
		<div style="line-height: 35px;position:relative;top:-170px">
		<%int i=1; %>
		<c:forEach items="${list}" var="l">
		<script>
		divfind();
		</script>
		<%=i %>
		<%i++; %>
			&nbsp;书码：${l.bookid }<br>
			&emsp;书名：${l.bookname }<br>
			&emsp;作者：${l.author }<br> 
			&emsp;价格：${l.price }<br>
			&emsp;备注：${l.notes }<br>
		</c:forEach>
		</div>
	</div>

</body>
</html>