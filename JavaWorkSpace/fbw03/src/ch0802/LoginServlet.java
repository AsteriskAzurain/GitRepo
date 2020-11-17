package ch0802;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			String usercode = request.getParameter("usercode");
			String userpsw = request.getParameter("userpsw");
			String checkuserpsw = request.getParameter("checkuserpsw"); 
			
			if(studentService.checkUser(usercode)) {
				//用户名重复
				msg = "学号["+usercode+"]已经存在";  				 
			} else if(userpsw.equals("") ) {
				msg = "请输入用户密码";   
			} else if(checkuserpsw.equals("")) {
				msg = "请输入确认密码";    
			} else if(!userpsw.equals(checkuserpsw)) {
				msg = "两次输入的密码不一致";     
			} else if(!CheckUtil.check_str(usercode.substring(1))) {
				//用户名首字符校验
				msg = "用户名首字符必须是字母";     
			} else if(!CheckUtil.isLetterDigit(usercode)) {
				//用户名只能是字母或数字
				msg = "用户名只能是字母或数字";     
			} else if(usercode.length()<6) {
				//用户名长度校验
				msg = "用户名长度不能少于6位";     
			} else if(userpsw.length()<6 || userpsw.length()>10) {
				//密码长度校验
				msg = "密码长度是6位至10位";     
			} else if(!CheckUtil.check_num(userpsw)) {
				//密码必须是数字
				msg = "密码必须全部是数字";     
			}
			out.print(msg); 
		}catch(Exception e) { 
			out.print(e.getMessage());  
		}
		
		
	}

}
