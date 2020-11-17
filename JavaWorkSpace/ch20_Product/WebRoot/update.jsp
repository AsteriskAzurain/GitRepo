<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>更新产品</title>
</head>
<body>
<center>
	<h2>更新产品</h2>
	<s:form action="update">
		<s:set name="id" value="#parameters.id[0]"></s:set>
		<s:textfield label="产品ID" name="id"></s:textfield>
		<s:textfield label="产品名" name="name"></s:textfield>
		<s:textfield label="产品价格" name="price"></s:textfield>
		<s:submit value="更新"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>	
	
</center>
</body>
</html>