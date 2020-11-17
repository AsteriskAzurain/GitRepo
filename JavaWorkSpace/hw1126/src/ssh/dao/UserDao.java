package ssh.dao;

import java.util.List;

import ssh.pojo.User;

public interface UserDao {
public void save(User p);
	
	//ɾ����Ʒ
	public void delete(String id);
	
	//���²�Ʒ
	public void update(User p);
	
	//��ѯ���в�Ʒ
	public List queryAll();
	
	//��id��ѯ��Ʒ
	public User queryByID(String id);
	
	public List<User> queryByEntity(User user);
}
