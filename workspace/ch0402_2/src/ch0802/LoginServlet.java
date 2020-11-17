package ch0802;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ch0802.dao.impl.StudentDaoImpl;
import ch0802.service.StudentService;
import ch0802.service.impl.StudentServiceImpl;
import ch0802.utils.CheckUtil;

public class LoginServlet extends HttpServlet{
 
	private static final long serialVersionUID = 1L;
	StudentService studentService = new StudentServiceImpl(); 
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException  {
		PrintWriter out = response.getWriter();	
		response.setCharacterEncoding("UTF-8");
		try { 	
			String msg = "";
			String username = request.getParameter("userId");
			String userpsw = request.getParameter("userpsw");
			String checkuserpsw = request.getParameter("checkuserpsw"); 
			
			if(studentService.checkUser(username)) {
				//用户名重复
				msg = "username ["+username+"] has existed";
			} else if(userpsw.equals("") ) {
				msg = "no password";   
			} else if(checkuserpsw.equals("")) {
				msg = "no check password";
			} else if(!userpsw.equals(checkuserpsw)) {
				msg = "check failed"; 
			} else if(!CheckUtil.check_str(username.substring(0))) {
				//用户名首字符校验
				msg = "username must be letters"; 
			} else if(!CheckUtil.isLetterDigit(username)) {
				//用户名只能是字母或数字
				msg = "username should be letters or number"; 
			} else if(username.length()<6) {
				//用户名长度校验
				msg = "username length > 6";
			} else if(userpsw.length()<6 || userpsw.length()>10) {
				//密码长度校验
				msg = "6 < password < 10";
			} else if(!CheckUtil.check_num(userpsw)) {
				//密码必须是数字
				msg = "password must be number"; 
			}
			else {
				msg+=username+" passed";

				if(StudentDaoImpl.InsertName(username)>0) {msg+="\ninsert succeed.";}
				else {msg+="\ninsert failed.";}
			}
			out.print(msg); 
		}catch(Exception e) { 
			out.print("exception:");
			out.print(e.getMessage());  
			
		}
		
		
	}

}
