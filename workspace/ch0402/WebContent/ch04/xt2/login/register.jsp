<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
   <script type="text/javascript" src="../../../js/ajax.js"></script>
<script type="text/javascript">

function userinsert(){
	var url="../../../carduser?flag=register"
	var rname = document.getElementsByName("rname")[0]
	var rpasswd = document.getElementsByName("rpasswd")[0]
	var rcheckpasswd = document.getElementsByName("rcheckpasswd")[0]
	var params="rname="+rname.value+"&rpasswd="+rpasswd.value+"&rcheckpasswd="+rcheckpasswd.value
	sendRequest(url,params,'POST',showresult)		
}
function showresult(){
	if (xmlHttpRequest.readyState == 4) { 
		if (xmlHttpRequest.status == 200) {
			var info=xmlHttpRequest.responseText;
			result.innerHTML=info;
		}
	}
}
</script>

</head>
<body style="line-height:40px">

<div style="margin:20px;"><h5>${msg}</h5></div>

<form action="" method="post">
<h2>注册成为用户</h2>
用户名：&emsp;<input type="text" name="rname" /><br>
密码：&emsp;&emsp;<input type="password" name="rpasswd" /><br>
重复密码：<input type="password" name="rcheckpasswd" /><br>
<input type="button" value="提交" onclick="userinsert()" />
</form>
<div id="result"></div>
</body>
</html>