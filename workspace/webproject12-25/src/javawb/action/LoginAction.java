package javawb.action;


import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import javawb.pojo.LoginUser;
import javawb.service.LoginService;

public class LoginAction extends ActionSupport implements SessionAware {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	private LoginUser loginuser;
	private int id;
	private	String username;
	private	String password;
	private String sex;
	private String birthday;
	private String school;
	
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



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

private LoginService loginservice;


public static long getSerialversionuid() {
	return serialVersionUID;
}



public LoginUser getLoginuser() {
	return loginuser;
}
public void setLoginuser(LoginUser loginuser) {
	this.loginuser = loginuser;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public LoginService getLoginservice() {
	return loginservice;
}
public void setLoginservice(LoginService loginservice) {
	this.loginservice = loginservice;
}
public String getUsername() {
	return username;
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

public String execute() {
//	LoginUser user=new LoginUser();
//	
//	user.setUsername(username);
//	user.setPassword(password);
//	List<Object> list= new ArrayList();
//	HttpServletRequest request=ServletActionContext.getRequest();
	//判断输出boolean 值true or false，进而success or error
//	LoginUser user=new LoginUser();
//	if(loginservice.loginCheck(user)) {
//		user.setUsername(username);
//		user.setPassword(password);
//Session.put("user",user);
//	return "success";
//	}
//	else { 
////aaa="用户名或密码错误";
////list.add(aaa);
////	request.setAttribute("list", list);
////	System.out.println(list);
//		super.addActionError("用户名或密码错误");
//	return "error";
//	}
//}
//@Override
//public void setSession(java.util.Map arg0) {
//	// TODO 自动生成的方法存根
//	
//}
	
//if(username.equals("")||password.equals("")) {
//msg="用户名或密码不能为空";
//return "error";
//}else {
	LoginUser u=loginservice.loginCheck(username,password);

	
if(u!=null) {
	System.out.println("u的值为"+u);
		
		LoginUser user=new LoginUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setSex(sex);
		user.setBirthday(birthday);
		user.setSchool(school);
		if(username.equals("admin")) {
			if(password.equals("admin")) {
				msg="欢迎进入管理员系统";
				return "back";
		                                  }
			                          }
		msg="欢迎登录";
		return "success";
	}
	else {
		System.out.println("u的值为"+u);
		msg="用户名或密码不正确";
		return "error";
		
	}

}

@Override
public void setSession(Map arg0) {
	// TODO 自动生成的方法存根
	
}



}
	
