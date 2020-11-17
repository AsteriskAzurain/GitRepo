package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Product;


public interface ProductDao {
	//添加产品
	public void save(Product p);
	
	//删除产品
	public void delete(String id);
	
	//更新产品
	public void update(Product p);
	
	//查询所有产品
	public List queryAll();
	
	//按id查询产品
	public Product queryByID(String id);
}
