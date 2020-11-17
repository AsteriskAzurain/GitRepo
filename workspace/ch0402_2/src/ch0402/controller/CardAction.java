package ch0402.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch0402.dao.UserDao;
import ch0402.entity.UserBean;

public class CardAction extends HttpServlet {
	//1、get owner
	//2、get CardBean
	//3、通过flag判断action
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//处理中文乱码问题
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String owner = request.getParameter("owner");
		String flag = request.getParameter("flag");
		System.out.println(owner+"/t"+flag);
		int ownerid=this.getOwnerId(owner);
		
		switch(flag) {
		case "insert": {
			this.Insert(ownerid,request, response);
			break;
		}
		case "delete": {
			this.Delete(ownerid,request, response);
			break;
		}
		case "modify": {
			this.Modify(ownerid,request, response);
			break;
		}
		case "search": {
			this.Search(ownerid,request, response);
			break;
		}
		default:break;
		}
	}

	public int getOwnerId(String uname) {
		int id=-1;
		UserBean owner =new UserBean();
		UserDao userdao=new UserDao();
		owner.setUname(uname);
		List<UserBean> list=new ArrayList<UserBean>();
		list=userdao.find(owner);
		for(UserBean rst:list) {
			owner=rst;
		}
		id=owner.getUid();
		
		return id;
	}
	
	public void Insert(int ownerid,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	public void Delete(int ownerid,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	public void Modify(int ownerid,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	public void Search(int ownerid,HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	
	
}
