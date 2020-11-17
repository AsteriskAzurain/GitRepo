package base.dao;

import java.util.List;

import base.pojo.User;

public interface UserDao {
	public void save(User u);

	public List queryAll();

	public List<User> queryByEntity(User user);
}
