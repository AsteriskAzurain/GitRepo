<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
<%
String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=test";
String userName="sa";
String userPwd="";

try {
	Class.forName(driverName);
	System.out.println("加载驱动成功！");
}
catch(Exception e) {
	e.printStackTrace();
}
%>
<%
Connection conn=DriverManager.getConnection("desktop-5ln0gqb","qysx3","");
String sql="SELECT * FROM Book";
PreparedStatement pstmt =conn.prepareStatement(sql);
ResultSet rs= pstmt.executeQuery();
rs.last();
%>
<table>
<tr>
	<td>BID</td>
	<td>BName</td>
	<td>BAuthor</td>
	<td>BPrice</td>
	<td>Bnotes</td>
</tr>

</table>
</div>
</body>
</html>