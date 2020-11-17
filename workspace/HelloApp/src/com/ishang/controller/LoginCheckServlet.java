package com.ishang.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckServlet extends HttpServlet { 
	public void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException{
		String username = request.getParameter("username");
		String userpsw = request.getParameter("userpsw");
		String info = "";
		if(username.equals("abc") && userpsw.equals("123")) { 
			info = "欢迎您 ["+username+"]!!";			
		}else { 
			info = "用户名或密码不正确！";
		}
		request.setAttribute("outputMessage", info);
		request.getRequestDispatcher("/jsp/info.jsp").forward(request, response);
	}
}
