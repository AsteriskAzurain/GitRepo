package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllAction extends ActionSupport {
	//ҵ���߼����
	private ProductService ps;

	//����ҵ���߼����
	public void setPs(ProductService ps) {
		this.ps = ps;
	}

	public String execute() throws Exception {
		//ͨ������ҵ���߼����������еĲ�Ʒ
		List all = ps.queryAllProduct();
		//�����в�ƷList������request��Χ��
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
