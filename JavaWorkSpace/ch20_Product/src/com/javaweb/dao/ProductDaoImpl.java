package com.javaweb.dao;

import java.util.List;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.javaweb.po.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	// ��Ӳ�Ʒ
	public void save(Product p) {
		this.getHibernateTemplate().save(p);
	}

	// ɾ����Ʒ
	public void delete(String id) {
		this.getHibernateTemplate().delete(
				this.getHibernateTemplate().get(Product.class, id));
	}

	//���²�Ʒ
	public void update(Product p) {
		this.getHibernateTemplate().saveOrUpdate(p);
	}

	//��ѯ���в�Ʒ
	public List queryAll() {
		return this.getHibernateTemplate().find("from Product");
	}

	//��id��ѯ��Ʒ
	public Product queryByID(String id) {
		return (Product) this.getHibernateTemplate().get(Product.class, id);
	}

}
