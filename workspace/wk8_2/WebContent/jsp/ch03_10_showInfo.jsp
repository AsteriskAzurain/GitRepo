<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>获取当前服务信息</title>
</head>
<body> 
	<% request.setCharacterEncoding("utf-8");  %>
	<font color="blue">表单提交的信息：</font><br>
        输入的第1个数据是：<%=request.getParameter("shuju1") %><br>
        输入的第2个数据是：<%=request.getParameter("shuju2") %><br><br>
    <font  color="red">客户端信息：</font><br>
        客户端协议名和版本号： <%=request.getProtocol() %><br> 
        客户机名： <%=request.getRemoteHost() %><br>
        客户机的IP地址： <%= request.getRemoteAddr() %><br>
        客户提交信息的长度： <%= request.getContentLength() %><br>
        客户提交信息的方式： <%= request.getMethod() %><br>
    HTTP头文件中Host值： <%= request.getHeader("Host") %><br>
        服务器名： <%= request.getServerName() %><br>
        服务器端口号： <%= request.getServerPort() %><br>
        接受客户提交信息的页面： <%= request.getServletPath() %><br>
	
</body>
</html>