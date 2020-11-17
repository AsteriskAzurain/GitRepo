package com.javaweb.service;

import java.util.List;

import com.javaweb.dao.ProductDao;
import com.javaweb.po.Product;


public class ProductServiceImpl implements ProductService{
	//DAO组件引用
	private ProductDao dao;

	//设置DAO组件
	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	// 添加产品
	public void addProduct(Product p) {
		//判断是否存在相同ID的产品
		if (dao.queryByID(p.getId()) == null) {
			//如果不存在，而调用DAO组件进行保存
			dao.save(p);
		} else {
			//否则提示错误信息
			System.out.println("id已经存在");
		}
	}

	// 删除产品
	public void deleteProduct(String id) {
		//判断是否存在相同ID的产品
		if (dao.queryByID(id) != null) {
			//如果存在，而调用DAO组件进行删除
			dao.delete(id);
		} else {
			//否则提示错误信息
			System.out.println("id不存在");
		}
	}

	// 更新产品
	public void updateProduct(Product p) {
		//判断是否存在相同ID的产品
		if (dao.queryByID(p.getId()) != null) {
			//如果存在，而调用DAO组件进行更新
			dao.update(p);
		} else {
			//否则提示错误信息
			System.out.println("id不存在");
		}
	}

	// 查询所有产品
	public List queryAllProduct() {
		//调用DAO组件进行查询
		return dao.queryAll();
	}

	// 按id查询产品
	public Product queryProductByID(String id) {
		//调用DAO组件进行查询
		return dao.queryByID(id);
	}
}
