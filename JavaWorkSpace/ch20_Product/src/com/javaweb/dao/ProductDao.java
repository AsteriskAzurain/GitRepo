package com.javaweb.dao;

import java.util.List;

import com.javaweb.po.Product;


public interface ProductDao {
	//��Ӳ�Ʒ
	public void save(Product p);
	
	//ɾ����Ʒ
	public void delete(String id);
	
	//���²�Ʒ
	public void update(Product p);
	
	//��ѯ���в�Ʒ
	public List queryAll();
	
	//��id��ѯ��Ʒ
	public Product queryByID(String id);
}
