package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ProductDao;
import com.javaweb.po.Product;


public class ProductServiceImpl implements ProductService{
	//DAO�������
	private ProductDao dao;

	//����DAO���
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	// ��Ӳ�Ʒ
	public void addProduct(Product p) {
		//�ж��Ƿ������ͬID�Ĳ�Ʒ
		if (dao.queryByID(p.getId()) == null) {
			//��������ڣ�������DAO������б���
			dao.save(p);
		} else {
			//������ʾ������Ϣ
			System.out.println("id�Ѿ�����");
		}
	}

	// ɾ����Ʒ
	public void deleteProduct(String id) {
		//�ж��Ƿ������ͬID�Ĳ�Ʒ
		if (dao.queryByID(id) != null) {
			//������ڣ�������DAO�������ɾ��
			dao.delete(id);
		} else {
			//������ʾ������Ϣ
			System.out.println("id������");
		}
	}

	// ���²�Ʒ
	public void updateProduct(Product p) {
		//�ж��Ƿ������ͬID�Ĳ�Ʒ
		if (dao.queryByID(p.getId()) != null) {
			//������ڣ�������DAO������и���
			dao.update(p);
		} else {
			//������ʾ������Ϣ
			System.out.println("id������");
		}
	}

	// ��ѯ���в�Ʒ
	public List queryAllProduct() {
		//����DAO������в�ѯ
		return dao.queryAll();
	}

	// ��id��ѯ��Ʒ
	public Product queryProductByID(String id) {
		//����DAO������в�ѯ
		return dao.queryByID(id);
	}
}
