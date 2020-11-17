package base.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import base.dao.UserDao;
import base.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(u);
	}

	@Override
	public List queryAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from User u");
	}

	@Override
	public List<User> queryByEntity(User user) {
		// TODO Auto-generated method stub
		String hql= "from User u where u.username=? and u.password=?";
        String[] value= new String[]{user.getUsername(), user.getPassword()};
        System.out.println(value);
		List list=this.getHibernateTemplate().find(hql,value);
		return list;
	}

}
