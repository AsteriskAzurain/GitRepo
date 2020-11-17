package com.ishang.dao;

import java.util.List;

public interface BaseDao<T> {
	public int save(T t);
	public int update(T t);
	public int delete(int id);
	public List<T> findByAll();
	public T findById(int id);
	public List<T> findByEntity(T t);
}
