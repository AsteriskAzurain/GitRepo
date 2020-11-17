package ch06;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistServlet extends HttpServlet  {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String name=request.getParameter("uname");
		String sex=request.getParameter("sex");
		String bir_year=request.getParameter("bir_year");
		String bir_month=request.getParameter("bir_month");
		String race=request.getParameter("race");
		String intro=request.getParameter("intro");
		
		request.setAttribute("oname", name);
		request.setAttribute("osex", sex);
		request.setAttribute("oyear", bir_year);
		request.setAttribute("omonth", bir_month);
		request.setAttribute("orace", race);
		request.setAttribute("ointro", intro);
		
		request.getRequestDispatcher("ch06/output.jsp").forward(request, response);
	}
}
