package com.javaweb.action;


import com.javaweb.po.Product;
import com.javaweb.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport{
	//��ƷID
	private String id;
	//��Ʒ��
	private String name;
	//��Ʒ�۸�
	private double price;
	//ҵ���߼����
	private ProductService ps;

	//����ҵ���߼����
	public void setPs(ProductService ps) {
		this.ps = ps;
	}
	

	//�����Ե�setter��getter����
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
		//�����ܵĲ������õ�Productʵ����
		Product p = new Product();
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		
		//����ҵ���߼��������ò�Ʒ
		ps.addProduct(p);
		
		return SUCCESS;
	}
	
}
