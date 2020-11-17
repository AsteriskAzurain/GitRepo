<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>分数查询</title>
<link href="../CSS/scoresearch.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../JS/jquery-3.4.1.js"></script>
<script>
function sendbyAjax(name){
		$.ajax({
			url : "../queryPartCollegeStudent1.action",
			type : "post",
	        dataType : "json", 
	        data : "name="+name,
			success : function(dataa) {
				alert("成功进入success");
				var k=dataa.remap.result.length;
				alert("FBI WARNING!!!!"+k);
				var str = "";
				for (var i = 0; i < k; i++) {
					var str1 = dataa.remap.result[i].id;
					var str2 = dataa.remap.result[i].name;
					var str3 = dataa.remap.result[i].command;
					var str4 = dataa.remap.result[i].major;
					var str5 = dataa.remap.result[i].score;
					str = "<tr><td>" + str1 + "</td>" + "<td>" + str2
					+ "</td><td>" + str3 + "</td><td>" + str4
					+ "</td><td>" + str5 + "</td></tr>";
					$("#shift").append(str);
				} 
			/* 	$("#tab").append("<tr><td>aaa</td></tr>"); */
			},
			error : function() {
				alert("错啦~");
			}
		});
	}
function show(){
	alert("测试有效");
}
	

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
		<center>
	</div>
	<div class="row">
		<div class="left">
			<div class="box">
			<form name="college">
				<input type="text" id="name" name="name" placeholder="请输入大学名称">
				</form>
				<button onclick="sendbyAjax(college.name.value)">此处搜索（测试）</button>
				<button onclick="show()">aaa</button>
			</div>
			</div>
			</div>
			</center>
			<center>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<table border="1" id="shift" bgcolor="blue">
	         <tr>
	           <td>id</td>
	           <td>name</td>
	           <td>command</td>
	           <td>major</td>
	           <td>score</td></tr>
	           </table>
          </center>
</body>
</html>
