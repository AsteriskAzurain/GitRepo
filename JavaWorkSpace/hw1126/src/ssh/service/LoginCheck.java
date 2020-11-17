package ssh.service;

import java.util.List;

import ssh.dao.UserDaoImpl;
import ssh.pojo.User;

public class LoginCheck {
	
	private User db;
	private String pswd;
	private UserDaoImpl dao;
	
	public User getDb() {
		return db;
	}

	public void setDb(User db) {
		this.db = db;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public UserDaoImpl getDao() {
		return dao;
	}

	public void setDao(UserDaoImpl dao) {
		this.dao = dao;
	}

	public Boolean loginCheck(User user) {
		//db.setUsername(user.getUsername());
		//db =dao.queryByEntity(db);
//		pswd=db.getPassword();
//		if(user.getPassword().equals(pswd))return true;
//		else return false;
//		User db =dao.queryByEntity(user);
//		if(db.equals(null)) return false;
		List<User> rs=dao.queryByEntity(user);
		if(rs.size()>0) return true;
		else return false;
	}
}
