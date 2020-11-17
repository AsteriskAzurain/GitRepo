package ssh.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ssh.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User o) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(o);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(getHibernateTemplate().get(User.class, id));

	}

	@Override
	public void update(User o) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(o);
	}

	@Override
	public List queryAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from User u");//返回所有User对象
		/* 1、find(String queryString); 
		 *    queryString=" from bean.User " =>返回所有User对象
		 * 2、find(String queryString , Object value);
		 * 	  eg. this.getHibernateTemplate().find("from bean.User u where u.name like ?", "%test%");
		 * 		  =>模糊查询，返回name属性值包含test的对象
		 * 3、find(String queryString, Object[] values);
		 * 	  eg. String hql= "from bean.User u where u.name=? and u.password=?"
		 * 		  this.getHibernateTemplate().find(hql, new String[]{"test", "123"});
		 * 		  =>返回用户名为test并且密码为123的所有User对象
		 * */
	}

	@Override
	public User queryByID(String id) {
		// TODO Auto-generated method stub
		Object o=this.getHibernateTemplate().get(User.class, id);
		return (User)o;
	}

	@Override
	public List<User> queryByEntity(User user) {
		// TODO Auto-generated method stub
		//Object o=this.getHibernateTemplate().findByExample(user);
		String hql= "from User u where u.username=? and u.password=?";
//		String[] paramName= new String[]{"username", "password"};
        String[] value= new String[]{user.getUsername(), user.getPassword()};
		List list=this.getHibernateTemplate().find(hql,value);
//		if(o.equals(null)) {return false;}
//		else {return true;}
//		if(list.size()>0)return (User)list.get(0);
//		else return null;
		return list;
	}

}
