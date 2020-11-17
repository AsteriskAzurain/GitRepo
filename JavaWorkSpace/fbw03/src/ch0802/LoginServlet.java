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
				//�û����ظ�
				msg = "ѧ��["+usercode+"]�Ѿ�����";  				 
			} else if(userpsw.equals("") ) {
				msg = "�������û�����";   
			} else if(checkuserpsw.equals("")) {
				msg = "������ȷ������";    
			} else if(!userpsw.equals(checkuserpsw)) {
				msg = "������������벻һ��";     
			} else if(!CheckUtil.check_str(usercode.substring(1))) {
				//�û������ַ�У��
				msg = "�û������ַ���������ĸ";     
			} else if(!CheckUtil.isLetterDigit(usercode)) {
				//�û���ֻ������ĸ������
				msg = "�û���ֻ������ĸ������";     
			} else if(usercode.length()<6) {
				//�û�������У��
				msg = "�û������Ȳ�������6λ";     
			} else if(userpsw.length()<6 || userpsw.length()>10) {
				//���볤��У��
				msg = "���볤����6λ��10λ";     
			} else if(!CheckUtil.check_num(userpsw)) {
				//�������������
				msg = "�������ȫ��������";     
			}
			out.print(msg); 
		}catch(Exception e) { 
			out.print(e.getMessage());  
		}
		
		
	}

}
