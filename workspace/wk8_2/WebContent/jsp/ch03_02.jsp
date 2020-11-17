<%@page contentType="text/html"  import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP脚本段应用示例</title>
</head>
<body>
	<h3>以直角三角形的形式显示数字</h3>
       <%
          for(int i=1;i<10;i++) {
             for(int j=1;j<=i;j++) {
                out.print(j+"  ");    //out是JSP的内置对象，在这里用于输出信息
             }
            out.println("<br/>");//实现换行控制
         }
      %>
      <hr>
      <h3>根据随机产生的数据的不同，显示不同的问候</h3>
      <% if (Math.random()<0.5) { %>
             Have a <B>nice</B> day!
           <% }
        else { %>
             Have a <B>lousy</B> day!
        <%}%>
         
</body>
</html>