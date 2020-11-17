package ch06.dao;

import java.util.List;

import ch06.entity.UserBean;

public interface UserDao {
	public List<UserBean> SearchByEntity(UserBean t);
	
	public int Insert(UserBean t);
}
