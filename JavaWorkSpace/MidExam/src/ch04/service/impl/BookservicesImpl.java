package ch04.service.impl;

import java.util.List;

import ch04.dao.impl.BookDao;
import ch04.dao.impl.BookDaoImpl;
import ch04.entity.BookBean;
import ch04.service.BookService;

public class BookservicesImpl implements BookService {
	
	BookDao book= new BookDaoImpl();
	
	@Override
	public boolean save(BookBean t) {
		// TODO Auto-generated method stub
		if(book.save(t)>0) return true;
		else return false;
	}

	@Override
	public boolean update(BookBean t) {
		// TODO Auto-generated method stub
		if(book.update(t)>0) return true;
		else return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		if(book.delete(id)==1) return true;
		else return false;
	}

	@Override
	public List<BookBean> findByAll() {
		// TODO Auto-generated method stub
		return book.findByAll();
	}

	@Override
	public BookBean findById(int id) {
		// TODO Auto-generated method stub
		return book.findById(id);
	}

	@Override
	public List<BookBean> findByEntity(BookBean t) {
		// TODO Auto-generated method stub
		return book.findByEntity(t);
	}

}
