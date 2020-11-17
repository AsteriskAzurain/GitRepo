package javawb.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import javawb.pojo.LoginUser;
import javawb.service.LoginService;

public class UpdateAction extends ActionSupport{
	//�û�ID
public void setLoginService(LoginService loginService) {
	this.loginService = loginService;
}

	//ҵ���߼����
	private LoginService loginService;

	//����ҵ���߼����
	


	public String execute() throws Exception {
		
		
		LoginUser user=new LoginUser();
		HttpServletRequest request=(HttpServletRequest) ServletActionContext.getRequest();
        int id=Integer.parseInt(request.getParameter("eid"));
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sex=request.getParameter("sex");
        String birthday=request.getParameter("birthday");
        String school=request.getParameter("school");
        
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        user.setBirthday(birthday);
        user.setSex(sex);
        user.setSchool(school);
        
		//����ҵ���߼����������û�
		loginService.updateUser(user);
		return "success";
	}
	
}
