<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>分数查询</title>
<link href="../CSS/scoresearch.css" rel="stylesheet" type="text/css" />
<script src="../JS/scoresearch.js">
</script>
</head>

<body>
	<div class="top">
		<img src="../project/logo.jpg">
	</div>
	<div class="container">
		<ul class="menu">
			<li><a href="index.jsp">网站首页</a></li>
			<li><a href="university.jsp">高校信息</a></li>
			<li><a href="introduce.jsp">政策解读</a></li>
			<li><a href="scoresearch.jsp">分数查询</a></li>
			<li><a href="evaluation.jsp">选科评测</a></li>
			<li><a href="vip.jsp">VIP服务</a></li>
				<li><a href="login.jsp">登录界面</a></li>
		</ul>
	</div>
	<div class="row">
		<div class="left">
			<div class="box">
				<input type="text" id="mySearch" placeholder="请输入大学名称">
				<input type="button" onclick="myFunction()" value="进入2017分数线查询界面">
				<input type="button" onclick="myFunction1()" value="进入2018分数线查询界面">
			</div>
			<ul id="myMenu">
				<li><a href="#">东华大学</a></li>
				<li><a href="#">复旦大学医学院</a></li>
				<li><a href="#">华东理工大学</a></li>
				<li><a href="#">上海电力学院</a></li>
				<li><a href="#">上海电机学院</a></li>
				<li><a href="#">上海对外经贸大学</a></li>
				<li><a href="#">复旦大学</a></li>
				<li><a href="#">上海交通大学</a></li>
				<li><a href="#">上海大学</a></li>
				<li><a href="#">上海商学院</a></li>
				<li><a href="#">上海海洋大学</a></li>
				<li><a href="#">上海海事大学</a></li>
				<li><a href="#">同济大学</a></li>
				<li><a href="#">华东师范大学</a></li>
				<li><a href="#">上海财经大学</a></li>
				<li><a href="#">上海师范大学</a></li>
				<li><a href="#">上海理工大学</a></li>
				<li><a href="#">上海外国语大学</a></li>
				<li><a href="#">华东政法大学</a></li>
				<li><a href="#">上海中医药大学</a></li>
				<li><a href="#">上海工程技术大学</a></li>
				<li><a href="#">上海应用技术大学</a></li>
				<li><a href="#">上海体育学院</a></li>
				<li><a href="#">上海第二工业大学</a></li>
				<li><a href="#">上海戏剧学院</a></li>
				<li><a href="#">上海科技大学</a></li>
				<li><a href="#">上海纽约大学</a></li>
				<li><a href="#">上海视觉艺术学院</a></li>
				<li><a href="#">上海海关学院</a></li>
				<li><a href="#">上海建桥学院</a></li>
				<li><a href="#">上海交通大学医学院</a></li>
				<li><a href="#">上海立信会计金融学院</a></li>
				<li><a href="#">上海杉达学院</a></li>
				<li><a href="#">上海师范大学天华学院</a></li>
				<li><a href="#">上海兴伟学院</a></li>
				<li><a href="#">上海外国语大学贤达经济人文学院</a></li>
				<li><a href="#">上海健康医学院</a></li>
				<li><a href="#">上海音乐学院</a></li>
				<li><a href="#">上海政法学院</a></li>
				<li><a href="#">海军军医大学</a></li>
			</ul>
		</div>
		<div class="right"></div>
	</div>
	<table><tr><td>id</td>
	           <td>name</td>
	           <td>command</td>
	           <td>score</td>
	           <td>major</td></tr></table>
</body>
</html>
