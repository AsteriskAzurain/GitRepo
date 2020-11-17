package ch06;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch06.dao.impl.UserDaoImpl;
import ch06.entity.UserBean;
import ch06.dao.UserDao;

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
		
		UserDaoImpl impl=new UserDaoImpl();
		
		UserBean user=new UserBean();
		user.setRname(name);
		user.setRsex(sex);
		user.setRyear(Integer.parseInt(bir_year));
		user.setRmonth(Integer.parseInt(bir_month));
		user.setRrace(race);
		user.setRintro(intro);
		impl.Insert(user);
		
		List<UserBean> list = new ArrayList<>();
		list=impl.SearchByEntity(user);
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("ch06/output.jsp").forward(request, response);
	}
}
