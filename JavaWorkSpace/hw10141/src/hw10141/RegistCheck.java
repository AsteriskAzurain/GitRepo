package hw10141;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Arrays;

public class RegistCheck extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String[] users= {"张三","李四","王五","赵六"};
		
		String uname=request.getParameter("uname");
		String upd1=request.getParameter("upswd1");
		String upd2=request.getParameter("upswd2");
		if(!Arrays.asList(users).contains(uname)) {
			if(uname.charAt(0)>'A'&&uname.charAt(0)<'z') {
				if(uname.length()>=6) {
				if(upd1.length()>=6 && upd1.length()<=10) {
					if(isDigit(upd1)) {
						if(upd1.equals(upd2) ) {out.print("注册成功！");}
						else {out.print("两次密码不同，请重新输入。");}
					}else {out.print("密码只能包含数字。");}
				}else {out.print("密码位数须为6~10位。");}
			}else {out.print("用户名须以字母开头。");}
			}else {out.print("用户名不得少于6位。");}
		}else {out.print("用户名重复。");}
}
	// 判断一个字符串是否都为数字  
	public boolean isDigit(String strNum) {  
	    return strNum.matches("[0-9]{1,}");  
	}  
}
