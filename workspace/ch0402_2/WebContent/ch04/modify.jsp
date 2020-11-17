<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改图书信息</title>
</head>
<body>
<h3>修改图书信息</h3>
<form action="${url}../book?flag=modify" method="post">

书码：<input type="text" name="id"></input><font style="color:red;">&emsp;*</font><br>
书名：<input type="text" name="name"></input><font style="color:red;">&emsp;*</font><br>
作者：<input type="text" name="author"></input><br>
价格：<input type="text" name="price"></input><font style="color:red;">&emsp;*</font><br>
备注：<input type="text" name="notes"></input><br>
<br>
<input type="submit" value="提交"></input> 

</form>
</body>
</html>