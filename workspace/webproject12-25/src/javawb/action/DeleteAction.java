package javawb.action;


import com.opensymphony.xwork2.ActionSupport;

import javawb.service.LoginService;

public class DeleteAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//产品ID
	private int id;
	//业务逻辑组件
	private LoginService loginService;
	
	
	
	

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute() throws Exception {
		//通过调用业务逻辑组件删除该ID用户
		if(loginService.deleteUser(id)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}
