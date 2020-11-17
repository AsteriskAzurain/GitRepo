<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
    <head><title>include指令实例</title></head>
    <body>
      <h4> 该页面传递一个参数QQ，直线下是接受参数页面的内容</h4>
       <hr>
      <jsp:include page="ch03_05_output.jsp">
            <jsp:param name= "userName" value="QQ" />
      </jsp:include>
   </body>
</html>
