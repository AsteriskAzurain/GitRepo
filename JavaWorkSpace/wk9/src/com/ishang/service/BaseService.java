package com.ishang.service;

import java.util.List;

public interface BaseService<T> {
	public boolean save(T t);
	public boolean update(T t);
	public boolean delete(int id);
	public List<T> findByAll();
	public T findById(int id);
	public List<T> findByEntity(T t);
}
