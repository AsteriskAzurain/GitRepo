package xt2.service.impl;

import java.util.List;

import xt2.dao.impl.BookDaoImpl;
import xt2.entity.BookBean;
import xt2.service.BookService;

public class BookServiceImpl implements BookService {
	BookDaoImpl dao=new BookDaoImpl();
	@Override
	public List<BookBean> showall() {
		// TODO Auto-generated method stub
		return dao.showall();
	}

	@Override
	public boolean insert(BookBean book) {
		// TODO Auto-generated method stub
		if(dao.insert(book)>0) return true;
		else return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		if(dao.delete(id)>0)return true;
		else return false;
	}

	@Override
	public boolean update(BookBean book) {
		// TODO Auto-generated method stub
		if(dao.update(book)>0)return true;
		else return false;
	}

	@Override
	public BookBean findbyId(int id) {
		// TODO Auto-generated method stub
		return dao.findbyId(id);
	}

	@Override
	public List<BookBean> findbyEntity(BookBean book) {
		// TODO Auto-generated method stub
		return dao.findbyEntity(book);
	}

}
