package javawb.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import javawb.pojo.LoginUser;
import javawb.service.LoginService;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginService loginService;
	private String username;
	private String password;
	private String sex;
	private String birthday;
	private String school;
	
//	private String password2;
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String getUsername() {
		return username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	public void validate() {
//		super.clearErrorsAndMessages();
//		if("".equals(username)) {
//			super.addActionError("�û�������Ϊ�գ�");
//			
//		}
//		if("".equals(password)) {
//			super.addActionError("���벻��Ϊ�գ�");
//	
//		}
//	}
	

	public String execute() {	
	LoginUser user=new LoginUser();
	user.setUsername(username);
	user.setBirthday(birthday);
	user.setPassword(password);
	user.setSex(sex);
	user.setSchool(school);
		if("".equals(username)) {
			addActionError("�û�������Ϊ�գ�");
		}
		else if("".equals(password)) {
			addActionError("���벻��Ϊ�գ�");
	
		}
		else if(password.length()<6 | password.length()>14)
			addActionError("���������6-14λ֮��");
		else if(username.length()>14 | username.length()<6) {
			addActionError("�û���������6-14λ֮��");
		
		}
	else if(!loginService.userRegister(user)) {
			addActionError("ע��ʧ��,���û����Ѵ��ڣ�");
			return "error";
		}	
	else {
		    addActionError("ע��ɹ�"); 
			return "success";
		}
	return "success";	
	}
	
	}