package javawb.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javawb.pojo.CollegeUser;
import javawb.pojo.CollegeUser1;

public class CollegeDaoImpl extends HibernateDaoSupport {
	public List<CollegeUser> findByCollegeName(CollegeUser collegeuser) {
		Session session=this.getSession();
	
		String hql= "from CollegeUser c where c.name like ?";
//Êý¾Ý¿âÖÐÓï¾ä£ºselect * from university2017 where name like '%¸´µ©%'
//		  String hql="from User as user where user.id like '%"+id+"%'";
		Query query = session.createQuery(hql); 
//		query.setString("name","%"+value+"%"); 
		query.setString(0,"%"+collegeuser.getName()+"%");
		List<CollegeUser>list=query.list();
		//return (List)query.list();
		System.out.println(query.list());
	    return list;
	}
	public List<CollegeUser1> findByCollegeName1(CollegeUser1 collegeuser1) {
		Session session=this.getSession();
	
		String hql= "from CollegeUser1 c where c.name like ?";
//Êý¾Ý¿âÖÐÓï¾ä£ºselect * from university2017 where name like '%¸´µ©%'
//		  String hql="from User as user where user.id like '%"+id+"%'";
		Query query = session.createQuery(hql); 
//		query.setString("name","%"+value+"%"); 
		query.setString(0,"%"+collegeuser1.getName()+"%");
		List<CollegeUser1>list=query.list();
		//return (List)query.list();
		System.out.println(query.list());
	    return list;
	}
	
	
}
