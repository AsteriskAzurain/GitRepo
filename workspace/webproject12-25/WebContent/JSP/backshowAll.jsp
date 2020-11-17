<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="../JS/jquery-3.4.1.js"></script>
<script>
	function sendInfoByAjax() {
		$.ajax({
			url : "../queryAllStudent.action",
			type : "post",
			dataType : "json",
			success : function(data) {
				console.info(data);

				var str = "";
				var k = data.remap.resultlist.length;
				for (var i = 0; i < k; i++) {
					var str1 = data.remap.resultlist[i].username;
					var str2 = data.remap.resultlist[i].password;
					var str3 = data.remap.resultlist[i].sex;
					var str4 = data.remap.resultlist[i].birthday;
					var str5 = data.remap.resultlist[i].school;
					var getid = data.remap.resultlist[i].id;
					str = "<tr><td>" + getid +"</td><td>"+str1+ "</td>" + "<td>" + str2
							+ "</td><td>" + str3 + "</td><td>" + str4
							+ "</td><td>" + str5 + "</td><td>"+'<button onclick="backupdate('+getid+')">更新</button>'+"</td><td>"
						+'<button onclick="backdelete('+getid+')">删除</button>'+"</td></tr>";
					/* 	'<button onclick="pay(\''+regiId+'\')" >按钮</button>' */
					$("#tab").append(str);
				}
			},
			error : function() {
				alert("错误");
			}
		});
	}
	/* function sendInfoByAjax1(){
		$.ajax({
			url : "../queryPartStudent.action",
			type : "post",
	        dataType : "json", 
			success : function(data) {
				console.info(data);
				var str = "";
				for (var i = 0; i < k; i++) {
					var str1 = data.remap.resultlist[i].username;
					var str2 = data.remap.resultlist[i].password;
					var str3 = data.remap.resultlist[i].sex;
					var str4 = data.remap.resultlist[i].birthday;
					var str5 = data.remap.resultlist[i].school;
					var getid = data.remap.resultlist[i].id;
					str = "<tr><td>" + str1 + "</td>" + "<td>" + str2
					+ "</td><td>" + str3 + "</td><td>" + str4
					+ "</td><td>" + str5 + "</td><td>"+"<button onclick='backupdate()'>更新</button>"+"</td><td>"
				+'<button onclick="backdelete('+getid+')">删除</button>'+"</td></tr>";
					/* 	'<button onclick="pay(\''+regiId+'\')" >按钮</button>' */
					//$("#tab").append(str);
		/* 		}
			},
			error : function() {
				alert("HTTP404: 找不到 - 服务器尚未找到与请求的 URI (统一资源标识符)匹配的任何内容。")
			}
		});
	} */
	function backupdate(getid){
		var storage = window.sessionStorage;  
		storage.setItem("id",getid);
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


	//function showData(data){
	//	var str="";
	//	var str1=data.remap.resultlist[i].username;
	//	var str2=data.remap.resultlist[i].password;
	//	var str3=data.remap.resultlist[i].sex;
	//	var str4=data.remap.resultlist[i].birthday;
	//	var str5=data.remap.resultlist[i].school;
	//	var k=data.remap.resultlist.length;
	//	for(var i=0;i<data.length;i++){
	//		str="<tr><td>"+str1+"</td>"+"<td>"+str2+"</td><td>"+str3+"</td><td>"
	//		+str4+"</td><td>"+str5+"</td></tr>";
	//		 $("#tab").append(str);
	//		 }
	//	}	
	function show() {
		alert("zzzzzz");

	}
</script>

<title>用户列表</title>
</head>
<body onload="sendInfoByAjax()">

	<h2>用户列表</h2>
<!-- <form>
	<input type="text" name="username" placeholder="请输入要查找的用户名">
	<input type="submit" value="查找" onclick="sendInfoByAjax1()">
	</form> -->
	<table border="1" id="tab">
<tr>
			<td>用户ID</td>
			<td>用户名</td>
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