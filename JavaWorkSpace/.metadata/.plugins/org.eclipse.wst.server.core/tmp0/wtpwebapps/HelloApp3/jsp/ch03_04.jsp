<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
    <head><title>include指令实例</title></head>
    <body>
      <center>
                   现在的日期和时间是：<%=new Date()%>
           <hr>
           <%@ include  file="ch03_04_include.jsp" %>
      </center>
   </body>
</html>
