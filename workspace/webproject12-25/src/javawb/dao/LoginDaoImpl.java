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

	System.out.println("list������"+list.get(0));
	return list.get(0);
	}
else{System.out.println("��ϲ��������,list�������û����"+list);
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
		// TODO �Զ����ɵķ������
		this.getHibernateTemplate().save(user);
	}
	
	//�����ʱû����
	@Override
	public LoginUser findById(int id) {
	return (LoginUser)this.getHibernateTemplate().get(LoginUser.class, id);
	
		
	}
	@Override
	public void delete(int id) {
		// TODO �Զ����ɵķ������
	 this.getHibernateTemplate().delete(this.getHibernateTemplate().get(LoginUser.class, id));
		
	}
	@Override
	public List findByAll() {
		// TODO �Զ����ɵķ������
		return this.getHibernateTemplate().find("from LoginUser");
	}
	//��ѯ�����û�����selectʹ��
	@Override
	public void update(LoginUser user) {
		this.getHibernateTemplate().flush();
		this.getHibernateTemplate().clear();
		this.getHibernateTemplate().saveOrUpdate(user);
		
	}
	//ͨ���û�������,selectpart by name(ը�ˣ�����)
	public List findByName(LoginUser user) {
		String value=user.getUsername();
		String hql= "from LoginUser u where u.username=?";
//		����this.getHibernateTemplate().find(queryString, value)
		return this.getHibernateTemplate().find(hql, value);
		
	}
	
	
}
