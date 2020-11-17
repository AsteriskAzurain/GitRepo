package javawb.dao;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



import javawb.pojo.LoginUser;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {
	@SuppressWarnings("unchecked")
	public LoginUser findPeople(String username,String password) {
		String hql= "from LoginUser u where u.username=? and u.password=?";

		String[] value=new String[]{username,password};
		List <LoginUser>list=this.getHibernateTemplate().find(hql,value);
if(list.size()>0) {

	System.out.println("list里面有"+list.get(0));
	return list.get(0);
	}
else{System.out.println("恭喜进入雷区,list里面好像没东西"+list);
	return null;
	
}
	
	}
	public boolean verifyUsername(String username) {
		@SuppressWarnings("unchecked")
		List<LoginUser> lists =this.getHibernateTemplate().find("from LoginUser u where u.username=?", username);
		return lists.isEmpty() ? false:true;
	}

	public boolean addUser(LoginUser user) {
		if(!verifyUsername(user.getUsername())) {
			this.getHibernateTemplate().save(user);
			System.out.println(user);
			return true;
		}
		return false;
	}
	
	@Override
	public void save(LoginUser user) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().save(user);
	}
	
	//这个暂时没有用
	@Override
	public LoginUser findById(int id) {
	return (LoginUser)this.getHibernateTemplate().get(LoginUser.class, id);
	
		
	}
	@Override
	public void delete(int id) {
		// TODO 自动生成的方法存根
	 this.getHibernateTemplate().delete(this.getHibernateTemplate().get(LoginUser.class, id));
		
	}
	@Override
	public List findByAll() {
		// TODO 自动生成的方法存根
		return this.getHibernateTemplate().find("from LoginUser");
	}
	//查询所有用户，供select使用
	@Override
	public void update(LoginUser user) {
		this.getHibernateTemplate().flush();
		this.getHibernateTemplate().clear();
		this.getHibernateTemplate().saveOrUpdate(user);
		
	}
	//通过用户名查找,selectpart by name(炸了！！！)
	public List findByName(LoginUser user) {
		String value=user.getUsername();
		String hql= "from LoginUser u where u.username=?";
//		调用this.getHibernateTemplate().find(queryString, value)
		return this.getHibernateTemplate().find(hql, value);
		
	}
	
	
}
