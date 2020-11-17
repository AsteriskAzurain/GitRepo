package com.javaweb.action;

import java.util.List;


import org.apache.struts2.ServletActionContext;

import com.javaweb.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllAction extends ActionSupport {
	//业务逻辑组件
	private ProductService ps;

	//设置业务逻辑组件
	public void setPs(ProductService ps) {
		this.ps = ps;
	}

	public String execute() throws Exception {
		//通过调用业务逻辑组件获得所有的产品
		List all = ps.queryAllProduct();
		//将所有产品List储存在request范围中
		ServletActionContext.getRequest().setAttribute("all", all);
		return SUCCESS;
	}

}
