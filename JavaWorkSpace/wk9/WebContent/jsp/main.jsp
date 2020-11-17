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
      String username=(String)session.getAttribute("username") ;
      if(username==null){//session中用户名为空说明用户没有登录
         Cookie[] cs=request.getCookies();
         String v=null;
         if(cs!=null){
            for(int i=0;i<cs.length;i++){//获取名称为username的Cookie对象值
               if(cs[i].getName().equals("username")){
                  v=cs[i].getValue();
               }
            }
         } 
         if(v!=null){//Cookie值不空，自动登录成功
           session.setAttribute("username",v);
           out.println(v+",您好");
         }
         else{ //自动登录失败，转到登录页面
            out.print("您还没注册，2秒后转到注册页面");
            response.setHeader("Refresh","2;url=login.jsp");         
         }
    }
    else{//session中用户名不空说明用户已经登录
       out.println(username+",您好");
    }
  %>
</body>
</html>