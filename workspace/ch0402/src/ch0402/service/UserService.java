package ch0402.service;

import java.util.ArrayList;
import java.util.List;

import ch0402.dao.UserDao;
import ch0402.entity.UserBean;


public class UserService {
	
	UserDao dao =new UserDao();
	
	public boolean UserCheck(UserBean user) {
		
		String upasswd=user.getUpasswd();
		
		List<UserBean> list= new ArrayList<UserBean>();
		list= dao.find(user);
		if(list.size()>0) {
			System.out.println("list.size > 0");
			for(UserBean rstu:list) {
				System.out.println(rstu.getUpasswd()+"?="+upasswd);
				if(rstu.getUpasswd().trim().equals(upasswd)) {
					System.out.println("passwd checked");
					return true;
					}
				}
			System.out.println("passwd check failed");
			return false;
		}
		else {
			System.out.println("list.size=0");
			return false;
		} 
	}
	public boolean UserInsert(UserBean user) {
		int n=0;
		n=dao.insert(user);
		if(n>0)return true;
		else return false;
	}
	
}
