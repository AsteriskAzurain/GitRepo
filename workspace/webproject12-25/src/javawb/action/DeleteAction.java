package javawb.action;


import com.opensymphony.xwork2.ActionSupport;

import javawb.service.LoginService;

public class DeleteAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//��ƷID
	private int id;
	//ҵ���߼����
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
		//ͨ������ҵ���߼����ɾ����ID�û�
		if(loginService.deleteUser(id)){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}



}
