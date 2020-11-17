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
		// ����LoginDaoImpl�������ȸ�ֵ���ж��Ƿ�Ϊ��

	}

	public boolean userRegister(LoginUser user) {
		if (logindao.findById(user.getId()) == null) {
			logindao.save(user);
			System.out.println(user);
			return true;
		}
		return false;

	}

//����û� ,��ע����ͬ
	public boolean addUser(LoginUser user) {
		if (logindao.findById(user.getId()) == null) {
			logindao.save(user);
			System.out.println(user);
			return true;
		}
		return false;

	}

//ɾ���û������id�ǿ���ɾ��
	public boolean deleteUser(int id) {
		if (!(logindao.findById(id) == null)) {
			logindao.delete(id);
		} else {
			return false;
		}
		return true;

	}

//��ѯ�û�,��ѯ����
	public List findAllUser() {
		return logindao.findByAll();
	}
//��������Name�����ݿ����ҵõ�������£���
	public void updateUser(LoginUser user) {
		logindao.update(user);
	}

//��ѯ����
public List findSomeUser(LoginUser user) {
//if(!(logindao.findByName(user.getUsername())==null)) {
//	System.out.println("userΪ"+user);
//	System.out.println("user����ǿգ�˵���Ѿ���ֵ");
//	return logindao.findByName(username);	
//}	
	System.out.println(user);
System.out.println("��һ�������ǿյ�");
	return logindao.findByName(user);

}}