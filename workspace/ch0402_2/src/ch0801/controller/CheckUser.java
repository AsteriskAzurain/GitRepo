package ch0801.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUser extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String userpsw = request.getParameter("userpsw");
		if(username.equals("abc") && userpsw.equals("123")) { 
			request.setAttribute("username", username);			
			request.getRequestDispatcher("ch08/xt1/jsp/third.jsp").forward(request, response);
		}else { 
			request.getRequestDispatcher("ch08/xt1/jsp/second.jsp").forward(request, response);
		}
	}

}
