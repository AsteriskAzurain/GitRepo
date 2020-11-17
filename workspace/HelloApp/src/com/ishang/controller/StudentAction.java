package com.ishang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ishang.entity.StudentsInfo;
import com.ishang.service.StudentService;
import com.ishang.service.imp.StudentServiceImpl;

public class StudentAction extends HttpServlet {

	private static final long serialVersionUID = 2993663921233415492L;

	StudentService studentService = new StudentServiceImpl();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String flag = request.getParameter("flag");
		if (flag.equals("save")) {
			// 保存
			this.save(request, response);
		} else if (flag.equals("del")) {
			// 删除
			this.del(request, response);
		} else if (flag.equals("update")) {
			// 修改
			this.update(request, response);
		} else if (flag.equals("showAll")) {
			// 显示
			this.showAll(request, response);

		}else if (flag.equals("find")) {
			//条件查询
			this.find(request, response);
		} 

	}
 
	/**
	 * 保存
	 * 
	 * @param request
	 * @param response
	 */
	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentsInfo student = new StudentsInfo();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String weight = request.getParameter("weight");
		String hight = request.getParameter("hight");
		student.setId(Integer.valueOf(id));
		student.setName(name);
		student.setSex(sex);
		student.setAge(Integer.valueOf(age));
		student.setWeight(Double.valueOf(weight));
		student.setHight(Double.valueOf(hight));
		boolean result = studentService.save(student);
		if (result) {
			showAll(request, response);
		} else {
			request.setAttribute("msg", "保存失败!!");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	/**
	 * 修改
	 * 
	 * @param request
	 * @param response
	 */
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentsInfo student = new StudentsInfo();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex");
		String age = request.getParameter("age");
		String weight = request.getParameter("weight");
		String hight = request.getParameter("hight");
		student.setId(Integer.valueOf(id));
		student.setName(name);
		student.setSex(sex);
		student.setAge(Integer.valueOf(age));
		student.setWeight(Double.valueOf(weight));
		student.setHight(Double.valueOf(hight));
		boolean result = studentService.update(student);
		if (result) {
			showAll(request, response);
		} else {
			request.setAttribute("msg", "更新失败!!");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	/**
	 * 删除
	 * 
	 * @param request
	 * @param response
	 */
	public void del(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		boolean result = studentService.delete(Integer.valueOf(id));
		if (result) {
			showAll(request, response);
		} else {
			request.setAttribute("msg", "删除失败!!");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	/**
	 * 显示
	 * 
	 * @param request
	 * @param response
	 */
	public void showAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<StudentsInfo> list = studentService.findByAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/ch04_01_show.jsp").forward(request, response);
	}
	
	public void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentsInfo student = new StudentsInfo();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sex = request.getParameter("sex"); 
		if(!id.isEmpty()) {
			student.setId(Integer.valueOf(id));
		}
		if(name!=null && !name.isEmpty()  ) {
			student.setName(name);
		}
		if(name!=null && !sex.isEmpty()) {
			student.setSex(sex);
		} 
		List<StudentsInfo> list = studentService.findByEntity(student);
		request.setAttribute("list", list);
		request.getRequestDispatcher("/jsp/ch04_01_show.jsp").forward(request, response);
	}

}
