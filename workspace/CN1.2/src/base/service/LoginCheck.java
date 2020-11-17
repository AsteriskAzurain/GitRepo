package base.service;

import java.util.List;

import base.dao.impl.UserDaoImpl;
import base.pojo.User;

public class LoginCheck {

	public UserDaoImpl getDao() {
		return dao;
	}

	public void setDao(UserDaoImpl dao) {
		this.dao = dao;
	}

	private UserDaoImpl dao;

	public List<User> loginCheck(User user) {
		List<User> rs = dao.queryByEntity(user);
			return rs;
	}

}
