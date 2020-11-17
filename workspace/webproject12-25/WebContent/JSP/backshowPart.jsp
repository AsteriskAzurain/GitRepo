<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="../JS/jquery-3.4.1.js"></script>
<script>
	function sendInfoByAjax1(username){
		$.ajax({
			url : "../queryPartStudent.action",
			type : "post",
	        dataType : "json", 
	        data : "username="+username,
			success : function(dataa) {
				var k=dataa.remap.resultlist.length;
				alert("FBI WARNING!!!!总共输出"+k+"条信息");
				var str = "";
				for (var i = 0; i < k; i++) {
					var str1 = dataa.remap.resultlist[i].username;
					var str2 = dataa.remap.resultlist[i].password;
					var str3 = dataa.remap.resultlist[i].sex;
					var str4 = dataa.remap.resultlist[i].birthday;
					var str5 = dataa.remap.resultlist[i].school;
					var getid = dataa.remap.resultlist[i].id;
					str = "<tr><td>" + str1 + "</td>" + "<td>" + str2
					+ "</td><td>" + str3 + "</td><td>" + str4
					+ "</td><td>" + str5 + "</td><td>"+"<button onclick='backupdate()'>更新</button>"+"</td><td>"
				+'<button onclick="backdelete('+getid+')">删除</button>'+"</td></tr>";
					$("#tab").append(str);
				} 
			/* 	$("#tab").append("<tr><td>aaa</td></tr>"); */
			},
			error : function() {
				alert("错啦~");
			}
		});
	}
	function backupdate(){
		location.href = "backupdate.jsp";
	}
	function backdelete(getid){
		var str=confirm("确认要删除吗？");
		if(str==true){
			window.location.replace("../backdelete.action?id="+getid);
		alert("已删除！");
		}else{
		alert("取消了删除操作！");
		}
	}
	function show(){alert("测试");}
</script>

<title>用户列表</title>
</head>
<body>

	<h2>用户列表</h2>
<form name="part">
	<input type="text" name="username" placeholder="请输入要查找的用户名">
	</form>
	<button onclick="sendInfoByAjax1(part.username.value)">查找</button>
	<table border="1" id="tab">
         <tr>
			<td>用户ID</td>
			<td>密码</td>
			<td>性别</td>
			<td>生日</td>
			<td>学校</td>
			<td>更新操作</td>
			<td>删除操作</td>
		</tr>
	</table>
	<a href="backinsert.jsp">添加新用户</a>
	<a href="backshowAll.jsp">显示全部用户</a>
	<a href="backshowPart.jsp">通过关键词搜索</a>
	<a href="back.jsp">返回主页</a>
</body>
</html>