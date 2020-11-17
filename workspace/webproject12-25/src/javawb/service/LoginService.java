package javawb.service;

import java.util.Date;
import java.util.List;

import javawb.dao.LoginDaoImpl;
import javawb.pojo.LoginUser;

public class LoginService {
	private LoginUser loginuser;
	private String username;
	private String password;
	private Date birthday;
	private String school;
	private String sex;
	private LoginDaoImpl logindao;

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LoginDaoImpl getLogindao() {
		return logindao;
	}

	public void setLogindao(LoginDaoImpl logindao) {
		this.logindao = logindao;
	}

	public LoginUser getLoginuser() {
		return loginuser;
	}

	public void setLoginuser(LoginUser loginuser) {
		this.loginuser = loginuser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginUser loginCheck(String username, String password) {

		return logindao.findPeople(username, password);
		// 调用LoginDaoImpl方法，先赋值再判断是否为空

	}

	public boolean userRegister(LoginUser user) {
		if (logindao.findById(user.getId()) == null) {
			logindao.save(user);
			System.out.println(user);
			return true;
		}
		return false;

	}

//添加用户 ,与注册相同
	public boolean addUser(LoginUser user) {
		if (logindao.findById(user.getId()) == null) {
			logindao.save(user);
			System.out.println(user);
			return true;
		}
		return false;

	}

//删除用户，如果id非空则删除
	public boolean deleteUser(int id) {
		if (!(logindao.findById(id) == null)) {
			logindao.delete(id);
		} else {
			return false;
		}
		return true;

	}

//查询用户,查询所有
	public List findAllUser() {
		return logindao.findByAll();
	}
//如果输入的Name在数据库里找得到，则更新？？
	public void updateUser(LoginUser user) {
		logindao.update(user);
	}

//查询部分
public List findSomeUser(LoginUser user) {
//if(!(logindao.findByName(user.getUsername())==null)) {
//	System.out.println("user为"+user);
//	System.out.println("user里面非空，说明已经传值");
//	return logindao.findByName(username);	
//}	
	System.out.println(user);
System.out.println("赌一波上面是空的");
	return logindao.findByName(user);

}}