package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import base.pojo.User;
import base.service.LoginCheck;
import net.sf.json.JSONObject;

public class UserAction extends ActionSupport {
	private LoginCheck service;

	private String username;
	private String password;
	private User result;
	private String currentUser;
	private HttpSession session;

	public User getResult() {
		return result;
	}

	public void setResult(User result) {
		this.result = result;
	}

	public String getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(String currentUser) {
		this.currentUser = currentUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
		System.out.println("用户名" + username);
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
		System.out.println("密码" + password);
	}
	
	public String initpage() {
		return SUCCESS;
	}

	public String logincheckaction() throws Exception {
//		HttpServletRequest request, HttpServletResponse response
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);

		List<User> rs=service.loginCheck(u);
			if(rs.size()>0) {
				System.out.println("success");
//				request.setAttribute("currentUser", rs.get(0));
				this.result=rs.get(0);
				currentUser=JSONObject.fromObject(result).toString();
				System.out.println(currentUser);
				HttpServletRequest request=(HttpServletRequest)ServletActionContext.getRequest();
				session=request.getSession(true);
				request.setAttribute("currentUser",currentUser);
				System.out.println(session.getAttribute("currentUser"));
				return SUCCESS;
			}
			else return ERROR;
	}
	}
