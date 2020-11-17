<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>沪上择校信息平台</title>
<link href="../CSS/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
<table><tr>
<td>
	<div class="top">
		<img src="../project/logo.jpg">
	</div></td>
		<td><s:property value="msg"/>
			<s:property value="#session.username" /></td></tr>
	</table>
	
	<div class="container">
		<ul class="menu">
			<li><a href="index.jsp">网站首页</a></li>
			<li><a href="university.jsp">高校信息</a></li>
			<li><a href="introduce.jsp">政策解读</a></li>
			<li><a href="scoresearch.jsp">分数查询</a></li>
			<li><a href="evaluation.jsp">选科评测</a></li>
			<li><a href="vip.jsp">VIP服务</a></li>
				<li><a href="login.jsp">登录界面</a></li>
				<li><a href="register.jsp">注册界面</a></li>
				
			
		</ul>
	</div>
	<div class="slidershow main">
		<div class="slides">
			<input type="radio" name="r" id="r1" checked> <input
				type="radio" name="r" id="r2"> <input type="radio" name="r"
				id="r3"> <input type="radio" name="r" id="r4"> <input
				type="radio" name="r" id="r5"> <input type="radio" name="r"
				id="r6"> <input type="radio" name="r" id="r7"> <input
				type="radio" name="r" id="r8"> <input type="radio" name="r"
				id="r9"> <input type="radio" name="r" id="r10">
			<div class="slide s1">
				<img src="../project/Figure_1.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_2.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_3.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_4.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_5.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_6.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_7.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_8.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_9.jpeg" alt="">
			</div>
			<div class="slide">
				<img src="../project/Figure_10.jpeg" alt="">
			</div>
		</div>
		<div class="nav">
			<label for="r1" class="bar"></label> <label for="r2" class="bar"></label>
			<label for="r3" class="bar"></label> <label for="r4" class="bar"></label>
			<label for="r5" class="bar"></label><label for="r6" class="bar"></label>
			<label for="r7" class="bar"></label><label for="r8" class="bar"></label>
			<label for="r9" class="bar"></label><label for="r10" class="bar"></label>
		</div>
	</div>
	<div class="bottom">
		<div class="item1">
			<h2>常见问题</h2>
			<span><a href="#">产品说明</a></span> <span><a href="#">VIP充值</a></span>
		</div>
		<div class="item2">
			<h2>开发团队</h2>
			<span><a href="#">成员介绍</a></span> <span><a href="#">联系我们</a></span>
		</div>
		<div class="item3">
			<h2>开发意向</h2>
			<span><a href="#">平台优势</a></span> <span><a href="#">诚邀合作</a></span>
		</div>
	</div>
</body>
</html>