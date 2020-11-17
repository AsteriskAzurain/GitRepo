package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Product;


public interface ProductService {
	//��Ӳ�Ʒ
	public void addProduct(Product p);
	
	//ɾ����Ʒ
	public void deleteProduct(String id);
	
	//���²�Ʒ
	public void updateProduct(Product p);
	
	//��ѯ���в�Ʒ
	public List queryAllProduct();
	
	//��id��ѯ��Ʒ
	public Product queryProductByID(String id);
}
