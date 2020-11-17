package com.javaweb.action;


import com.javaweb.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	//产品ID
	private String id;
	//业务逻辑组件
	private ProductService ps;
	
	//设置业务逻辑组件
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
		//通过调用业务逻辑组件删除该ID产品
		ps.deleteProduct(getId());
		return SUCCESS;
	}
	
}
