<%@page contentType="text/html;charset=gb2312"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>��Ӳ�Ʒ</title>
</head>
<body>
<center>
	<h2>��Ӳ�Ʒ</h2>
	<s:form action="add">
		<s:textfield label="��ƷID" name="id"></s:textfield>
		<s:textfield label="��Ʒ��" name="name"></s:textfield>
		<s:textfield label="��Ʒ�۸�" name="price"></s:textfield>
		<s:submit value="�ύ"></s:submit>
		<s:reset value="����"></s:reset>
	</s:form>	
</center>
</body>
</html>