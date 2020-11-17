package com.javaweb.action;


import com.javaweb.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	//��ƷID
	private String id;
	//ҵ���߼����
	private ProductService ps;
	
	//����ҵ���߼����
	public void setPs(ProductService ps) {
		this.ps = ps;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String execute() throws Exception {
		//ͨ������ҵ���߼����ɾ����ID��Ʒ
		ps.deleteProduct(getId());
		return SUCCESS;
	}
	
}
