package com.ishang.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ishang.entity.Student;

@SuppressWarnings("serial")
public class StudentController extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> studentlist = new ArrayList<Student>();// 查询结果
		studentlist.add(new Student("001", "张三", "男"));
		studentlist.add(new Student("002", "李四", "女"));
		studentlist.add(new Student("003", "王五", "男"));
		request.setAttribute("result", studentlist);// 将查询结果保存到request对象中
		//转发到show.jsp显示查询结果
		request.getRequestDispatcher("jsp/ch08_09.jsp").forward(request, response);
	}
}
