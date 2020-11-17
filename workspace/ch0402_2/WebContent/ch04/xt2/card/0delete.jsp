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

	<h2>删除名片</h2>

	<div name="result">此处应有返回结果</div>
	<form action="" method="post" class="loaddiv">
		<h5>查找名片</h5>
		请输入名片id：<input type="text" name=cardid /><br>
		<br> <input type="submit" value="加载" />
		<p>
	</form>

	<c:forEach items=${list } var="card"}>
		<form action="" method="post">
		<div class="card">
		
		<div class="company">Company&emsp;${card.ccompany }</div>
		<div class="name">姓名&emsp;${card.cname} }</div>
		<div class="position">职位&emsp;${card.cposition }</div>
		<div class="info">
		<span class="halfline">手机&emsp;${card.cphone }</span>
		<span class="halfline" style="margin-left:40px;">微信&emsp;${card.cwechat }</span>
		<br>
		<span class="halfline">电话&emsp;${card.ctel }</span>
		<span class="halfline" style="margin-left:40px;">邮箱&emsp;${card.cmail }</span>
		<br>
		<span class="wholeline">地址&emsp;${card.caddress }</span>
		
		</div>
		</div>
		<div class="notes">
		备注<input type="submit" value="确认删除">
		<br><textarea rows="3" cols="50">${card.cnotes }</textarea>
		</div>
		</form>
</c:forEach>
	<form action="" method="post">
		<div class="card">

			<div class="company">Company&emsp;</div>
			<div class="name">姓名&emsp;</div>
			<div class="position">职位&emsp;</div>
			<div class="info">
				<span class="halfline">手机&emsp;</span> <span class="halfline"
					style="margin-left: 40px;">微信&emsp;</span> <br> <span
					class="halfline">电话&emsp;</span> <span class="halfline"
					style="margin-left: 40px;">邮箱&emsp;</span> <br> <span
					class="wholeline">地址&emsp;</span>

			</div>
		</div>
		<div class="notes">
			备注<input type="submit" value="确认删除"> <br>
			<textarea rows="3" cols="50"></textarea>
		</div>
	</form>

</body>
</html>