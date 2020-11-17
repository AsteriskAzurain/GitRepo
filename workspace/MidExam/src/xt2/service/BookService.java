package xt2.service;

import java.util.List;

import xt2.entity.BookBean;

public interface BookService {
	public List<BookBean> showall();
	
	public boolean insert(BookBean book);
	public boolean delete(int id);
	public boolean update(BookBean book);
	public BookBean findbyId(int id);
	public List<BookBean> findbyEntity(BookBean book);
}
