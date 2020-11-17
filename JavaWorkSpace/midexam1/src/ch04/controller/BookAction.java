package ch04.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch04.entity.BookBean;
import ch04.service.impl.BookservicesImpl;

public class BookAction extends HttpServlet {
	
	static BookservicesImpl service=new BookservicesImpl();
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//处理中文乱码
		response.setContentType("text/html;charset=UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		//通过页面传来的flag判断action
		String flag = request.getParameter("flag");
		switch(flag) {
		case "insert":{
			this.insert(request, response);
			break;
			}
		case "delete":{
			this.delete(request, response);
			break;
			}
		case "modify":{
			this.modify(request, response);
			break;
			}
		case "showall":{
			this.showall(request, response);
			break;
			}
		case "findbyid":{
			this.findbyid(request, response);
			break;
			}
		case "findlike":{
			this.findlike(request, response);
			break;
			}
		default:{break;}
	}
}
	
	public void insert(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookBean book=new BookBean();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		String price=request.getParameter("price");
		String notes=request.getParameter("notes");
		if(!(id.equals(null)||name.equals(null)||price.equals(null))){
			book.setBookid(Integer.valueOf(id));
			book.setBookname(name);
			book.setAuthor(author);
			book.setPrice(Float.valueOf(price));
			book.setNotes(notes);
			boolean rstn=service.save(book);
			if(rstn)showall(request, response);
			else {
				request.setAttribute("msg", "插入失败");
				request.getRequestDispatcher("ch04/insert.jsp").forward(request, response);
			}
		}else{
		request.setAttribute("msg", "书码、书名和价格为必填项");
		request.getRequestDispatcher("ch04/insert.jsp").forward(request, response);}
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookBean book=new BookBean();
		String id = request.getParameter("id");
		boolean rstn=service.delete(Integer.valueOf(id));
		if(rstn)showall(request, response);
		else {
			request.setAttribute("msg", "删除失败");
			request.getRequestDispatcher("ch04/delete.jsp").forward(request, response);
		}
	}
	
	public void modify(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookBean book=new BookBean();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		String price=request.getParameter("price");
		String notes=request.getParameter("notes");
		if(!(id.equals(null)||name.equals(null)||price.equals(null))){
			book.setBookid(Integer.valueOf(id));
			book.setBookname(name);
			book.setAuthor(author);
			book.setPrice(Float.valueOf(price));
			book.setNotes(notes);
			boolean rstn=service.update(book);
			if(rstn)showall(request, response);
			else {
				request.setAttribute("msg", "修改失败");
				request.getRequestDispatcher("ch04/modify.jsp").forward(request, response);
			}
		}else{
		request.setAttribute("msg", "书码、书名和价格为必填项");
		request.getRequestDispatcher("ch04/modify.jsp").forward(request, response);}
	}
	
	public void showall(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookBean book=new BookBean();
		List<BookBean> list = new ArrayList<>();
		list=service.findByAll();
		System.out.println(list);
		request.setAttribute("list", list);
		request.getRequestDispatcher("ch04/showall.jsp").forward(request, response);
	}
	
	public void findbyid(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookBean book=new BookBean();
		String id = request.getParameter("id");
		System.out.println(id);
		book=service.findById(Integer.valueOf(id));
		System.out.println(book);
		request.setAttribute("book", book);
		List<BookBean> list = new ArrayList<>();
		list=null;
		request.setAttribute("list", list);
		request.getRequestDispatcher("ch04/manage.jsp").forward(request, response);
		
	}
	
	public void findlike(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		BookBean book=new BookBean();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		if(id.isEmpty()) {book.setBookid(-1);}
		else {book.setBookid(Integer.valueOf(id));}
		book.setBookname(name);
		book.setAuthor(author);
		book.setPrice(0);
		List<BookBean> list = new ArrayList<>();
		list=service.findByEntity(book);
		request.setAttribute("list", list);
		request.getRequestDispatcher("ch04/manage.jsp").forward(request, response);
	}
}
