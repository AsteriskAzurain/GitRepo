<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>���²�Ʒ</title>
</head>
<body>
<center>
	<h2>���²�Ʒ</h2>
	<s:form action="update">
		<s:set name="id" value="#parameters.id[0]"></s:set>
		<s:textfield label="��ƷID" name="id"></s:textfield>
		<s:textfield label="��Ʒ��" name="name"></s:textfield>
		<s:textfield label="��Ʒ�۸�" name="price"></s:textfield>
		<s:submit value="����"></s:submit>
		<s:reset value="����"></s:reset>
	</s:form>	
	
</center>
</body>
</html>