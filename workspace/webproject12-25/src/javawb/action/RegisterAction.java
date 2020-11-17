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
//			super.addActionError("用户名不能为空！");
//			
//		}
//		if("".equals(password)) {
//			super.addActionError("密码不能为空！");
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
			addActionError("用户名不能为空！");
		}
		else if("".equals(password)) {
			addActionError("密码不能为空！");
	
		}
		else if(password.length()<6 | password.length()>14)
			addActionError("密码必须在6-14位之内");
		else if(username.length()>14 | username.length()<6) {
			addActionError("用户名必须在6-14位之内");
		
		}
	else if(!loginService.userRegister(user)) {
			addActionError("注册失败,该用户名已存在！");
			return "error";
		}	
	else {
		    addActionError("注册成功"); 
			return "success";
		}
	return "success";	
	}
	
	}
