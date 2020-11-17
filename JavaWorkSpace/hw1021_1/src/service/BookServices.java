package service;

import dao.BookDao;
import dao.impl.BookDaoImpl;

public class BookServices {
	private BookDao bookDao;
	public void delete() {
		bookDao= new BookDaoImpl();
		bookDao.delete();
	}
	public void insert() {
		bookDao= new BookDaoImpl();
		bookDao.save();
	}
	public void find() {
		bookDao= new BookDaoImpl();
		bookDao.findbyall();
	}
}
