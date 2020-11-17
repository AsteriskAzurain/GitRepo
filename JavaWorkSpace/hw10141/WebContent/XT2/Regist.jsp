<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册+验证</title>
<script type="text/javascript" src="js/ajax.js"></script>
<script type="text/javascript">
function registcheck(){
	var url="/check";
	var params="uname="+uname.value+"&upswd1="+upswd1.value+"&upswd2="+wpswd2.value;
	sendRequest(url,params,'POST',showresult);
}
function showresult(){
	if(httpRequest.readyState==4){
		if(httpRequest.status==200){
			var info=httpRequest.responseText;
			result.innerText=info;
		}
	}
}
</script>
</head>
<body>
<form onsubmit="registcheck()">
用户名：<input type="text" name="uname" onblur="registcheck()"/><br> 
<!-- 用户名要求：不能重复，字母开头，至少6位-->
设置密码：<input type="password" name="upswd1"/><br>
确认密码：<input type="password" name="upswd2" onblur="registcheck()" /><br>
<!-- 密码要求：全是数字，6-10位 -->
<input type="submit" value="注册" />
</form>
<div id="result"></div>
</body>
</html>