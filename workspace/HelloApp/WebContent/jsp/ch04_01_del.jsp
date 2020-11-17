<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set scope="page" var="url"  value="${pageContext.request.contextPath }"></c:set>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加任意学生的提交页面</title>
<script type="text/javascript" src="../js/ajax.js"></script>
<!-- <script type="text/javascript">
	function save(){
		var url="../saveStudent";
		var id = document.getElementsByName("id")[0];
		var name = document.getElementsByName("name")[0];
		var sex = document.getElementsByName("sex")[0];
		var age = document.getElementsByName("age")[0];
		var weight = document.getElementsByName("weight")[0];
		var hight = document.getElementsByName("hight")[0];
		var params="id="+id.value+"&name="+name.value+"&sex="+sex.value+"&age="+age.value+"&weight="+weight.value+"&hight="+hight.value;
		sendRequest(url,params,'POST',showresult);	
	}
</script> -->
</head>
<body>
	<form action="${url}/student?flag=del" method="post">
		<table border="0" width="238" height="252">
			<tr><td>学号</td><td><input type="text" name="id"></td></tr>			 
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="删除">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset" value="取 消">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>