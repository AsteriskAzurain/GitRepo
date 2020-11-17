<%@page import="com.sun.java.swing.plaf.windows.resources.windows"%>
<%@page import="javax.swing.text.Document"%>
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
	<%
String name= request.getParameter("name");
String id= request.getParameter("id");
String author= request.getParameter("author");
String p= request.getParameter("price");
Float price= 0.0f;
if(p!=null){price=Float.parseFloat(p);}
String notes= request.getParameter("notes");
%>
<%
try {
	Connection conn=DriverManager.getConnection("desktop-5ln0gqb","qysx3","");
	StringBuffer sbSql=new StringBuffer();
	sbSql.append("insert into dbo.Book(BID,BName,BAuthor,BPrice,Bnotes) values(?,?,?,?,?)");
	//String sql="insert into student values(?,?,?)";
	PreparedStatement pstmt =conn.prepareStatement(sbSql.toString());
	pstmt.setInt(1, 123);
	pstmt.setNString(2, "123");
	pstmt.setNString(3, "123");
	pstmt.setFloat(4,12);
	pstmt.setNString(5,"123");
	int n=pstmt.executeUpdate();
	if(n==1){System.out.println("insert succeed");}
	else{System.out.println("insert failed");}
	pstmt.close();
	conn.close();

	}catch(Exception e) {
		//todo something 
		} %>
</body>
</html>