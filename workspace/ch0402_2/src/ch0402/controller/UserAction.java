package ch0402.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch0402.entity.UserBean;
import ch0402.service.UserService;

public class UserAction extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws IOException, ServletException  {
		//处理中文乱码问题
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String flag=request.getParameter("flag");
		switch (flag) {
		case "check": {
			this.userCheck(request, response);
			break;
		}
		case "register": {
			this.insertUser(request, response);
			break;
		}

		default:
			break;
		}
	
	}
	
	public void userCheck(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String uname=request.getParameter("uname");
			String upasswd=request.getParameter("upasswd");
			
			UserBean user =new UserBean();
			user.setUname(uname);
			user.setUpasswd(upasswd);
			
			UserService service =new UserService();
			if(service.UserCheck(user)) {
				//request.setAttribute("uname", user.getUname());
				response.sendRedirect("ch04/xt2/card/home.jsp?uname="+java.net.URLEncoder.encode(user.getUname()));
				//request.getRequestDispatcher("ch04/xt2/card/home.jsp").forward(request, response);
			}else {
				request.setAttribute("msg", "You havenot registered yet. Please register first.\n");
				response.sendRedirect("ch04/xt2/login/register.jsp");
			}
		}catch(Exception e) {
			System.out.println("check exception");
			e.printStackTrace();
		}
	}
	
	public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String rname=request.getParameter("rname");
		String rpasswd=request.getParameter("rpasswd");
		String rcheckpasswd = request.getParameter("rcheckpasswd");
		String msg="";
		boolean rst=false;
		if(rname.isEmpty()||rpasswd.isEmpty()||rcheckpasswd.isEmpty()) {
			System.out.println("register: empty");
			msg= "用户名和密码不能为空";
		}
		else if(!rpasswd.equals(rcheckpasswd)) {
			System.out.println("register: passwd check failed");
			msg="两次密码必须一致";
		}
		else {
			System.out.println("register: get user");
			UserBean user= new UserBean();
			user.setUname(rname);
			user.setUpasswd(rpasswd);
			System.out.println(user.toString());
			UserService service =new UserService();
			rst=service.UserInsert(user);
		}
		if(rst)msg="insert succeed";
		else msg+="<br>insert failed";
		
		PrintWriter out = response.getWriter();		
		out.print(msg);
	}
}
