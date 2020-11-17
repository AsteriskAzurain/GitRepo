<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% 
       String un=request.getParameter("username");//获取用户名
       if(un!=null){//不对用户名和密码进行检查
         Cookie c=new Cookie("username",un);//创建Cookie对象，名称为username
         c.setMaxAge(30*24*3600);//设置Cookie有效期为30天
         response.addCookie(c);//将Cookie对象保存到客户端
         session.setAttribute("username",un);//将用户名存到session范围内用于权限检查
         response.sendRedirect("main.jsp");//重定向到主页面
       } 
     %>
</body>
</html>