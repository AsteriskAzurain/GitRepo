package dao;

import java.util.List;

import entity.Book;

public interface BookDao {
	public int delete();
	public int save();
	public List<Book> findbyall();
}
