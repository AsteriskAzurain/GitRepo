<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>��Ʒ�б�</title>
</head>
<body>
<center>
	<h2>��Ʒ�б�</h2>
	<table border="1">
		
		<tr>
			<td>��ƷID</td>
			<td>��Ʒ����</td>	
			<td>��Ʒ�۸�</td>
			<td>�Ƿ�ɾ��</td>
			<td>�Ƿ����</td>		
		</tr>
		<s:iterator value="#request.all" id="product">
		<tr>
			<td><s:property value="#product.id"/></td>
			<td><s:property value="#product.name"/></td>	
			<td><s:property value="#product.price"/></td>
			<td><a href="delete.action?id=<s:property value='#product.id'/>">ɾ��</a></td>
			<td><a href="update.jsp?id=<s:property value='#product.id'/>">����</a></td>	
		</tr>
		</s:iterator>	
	</table>
	<a href="add.jsp">��Ӳ�Ʒ</a>		
</center>
</body>
</html>