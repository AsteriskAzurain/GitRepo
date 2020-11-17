package ssh.dao;

import java.util.List;

import ssh.pojo.User;

public interface UserDao {
public void save(User p);
	
	//删除产品
	public void delete(String id);
	
	//更新产品
	public void update(User p);
	
	//查询所有产品
	public List queryAll();
	
	//按id查询产品
	public User queryByID(String id);
	
	public List<User> queryByEntity(User user);
}
