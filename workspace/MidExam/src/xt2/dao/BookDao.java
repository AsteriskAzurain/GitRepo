package xt2.dao;

import java.util.List;

import xt2.entity.BookBean;

public interface BookDao {
	
	public List<BookBean> showall();
	
	public int insert(BookBean book);
	public int delete(int id);
	public int update(BookBean book);
	public BookBean findbyId(int id );
	public List<BookBean> findbyEntity(BookBean book);
	
}
