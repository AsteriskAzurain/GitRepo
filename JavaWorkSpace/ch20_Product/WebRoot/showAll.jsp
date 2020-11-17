<%@page contentType="text/html;charset=gb2312"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>产品列表</title>
</head>
<body>
<center>
	<h2>产品列表</h2>
	<table border="1">
		
		<tr>
			<td>产品ID</td>
			<td>产品名称</td>	
			<td>产品价格</td>
			<td>是否删除</td>
			<td>是否更新</td>		
		</tr>
		<s:iterator value="#request.all" id="product">
		<tr>
			<td><s:property value="#product.id"/></td>
			<td><s:property value="#product.name"/></td>	
			<td><s:property value="#product.price"/></td>
			<td><a href="delete.action?id=<s:property value='#product.id'/>">删除</a></td>
			<td><a href="update.jsp?id=<s:property value='#product.id'/>">更新</a></td>	
		</tr>
		</s:iterator>	
	</table>
	<a href="add.jsp">添加产品</a>		
</center>
</body>
</html>