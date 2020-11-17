package ssh.controller;

import com.opensymphony.xwork2.ActionSupport;

import ssh.pojo.User;
import ssh.service.LoginCheck;

public class UserAction  extends ActionSupport{
	private int id;
	private String username;
	private String password;
	
	private LoginCheck service;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LoginCheck getService() {
		return service;
	}

	public void setService(LoginCheck service) {
		this.service = service;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		User u= new User();
		u.setUsername(username);
		u.setPassword(password);
		
		if(service.loginCheck(u)) return SUCCESS;
		else return ERROR;
	}
}
