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
		String[] users= {"����","����","����","����"};
		
		String uname=request.getParameter("uname");
		String upd1=request.getParameter("upswd1");
		String upd2=request.getParameter("upswd2");
		if(!Arrays.asList(users).contains(uname)) {
			if(uname.charAt(0)>'A'&&uname.charAt(0)<'z') {
				if(uname.length()>=6) {
				if(upd1.length()>=6 && upd1.length()<=10) {
					if(isDigit(upd1)) {
						if(upd1.equals(upd2) ) {out.print("ע��ɹ���");}
						else {out.print("�������벻ͬ�����������롣");}
					}else {out.print("����ֻ�ܰ������֡�");}
				}else {out.print("����λ����Ϊ6~10λ��");}
			}else {out.print("�û���������ĸ��ͷ��");}
			}else {out.print("�û�����������6λ��");}
		}else {out.print("�û����ظ���");}
}
	// �ж�һ���ַ����Ƿ�Ϊ����  
	public boolean isDigit(String strNum) {  
	    return strNum.matches("[0-9]{1,}");  
	}  
}
