package com.javaweb.service;

import java.util.List;

import com.javaweb.po.Product;


public interface ProductService {
	//添加产品
	public void addProduct(Product p);
	
	//删除产品
	public void deleteProduct(String id);
	
	//更新产品
	public void updateProduct(Product p);
	
	//查询所有产品
	public List queryAllProduct();
	
	//按id查询产品
	public Product queryProductByID(String id);
}
