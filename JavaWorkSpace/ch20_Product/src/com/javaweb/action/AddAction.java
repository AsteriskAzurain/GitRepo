package com.javaweb.action;


import com.javaweb.po.Product;
import com.javaweb.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{
	//产品ID
	private String id;
	//产品名
	private String name;
	//产品价格
	private double price;
	//业务逻辑组件
	private ProductService ps;

	//设置业务逻辑组件
	public void setPs(ProductService ps) {
		this.ps = ps;
	}
	

	//各属性的setter和getter方法
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String execute() throws Exception {
		//将接受的参数设置到Product实例中
		Product p = new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		
		//调用业务逻辑组件保存该产品
		ps.addProduct(p);
		
		return SUCCESS;
	}
	
}
