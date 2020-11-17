package xt3;

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
		if(username.equals("fangbingwei") && userpsw.equals("18102040208")) { 
			request.setAttribute("username", username);			
			request.getRequestDispatcher("xt3/success.jsp").forward(request, response);
		}else { 
			request.getRequestDispatcher("xt3/error.jsp").forward(request, response);
		}
	}

}
