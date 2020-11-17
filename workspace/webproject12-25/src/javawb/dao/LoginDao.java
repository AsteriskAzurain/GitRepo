package javawb.dao;

import java.util.List;

import javawb.pojo.LoginUser;

public interface LoginDao {
	public LoginUser findPeople(String username,String password);
	public boolean verifyUsername(String username);
	public boolean addUser(LoginUser user);
	public void save(LoginUser user);
	public LoginUser findById(int id);
	public void delete(int id);
	public List findByAll();
	public void update(LoginUser user);
	public List<LoginUser> findByName(LoginUser user);
}
