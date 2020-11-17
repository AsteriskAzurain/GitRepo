package javawb.pojo;

import java.util.Date;

public class LoginUser {
private	int id;
private	String username;
private	String password;
private String sex;
private String birthday;
private String school;

public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
@Override
public String toString() {
	return "LoginUser [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", birthday="
			+ birthday + ", school=" + school + ", getSex()=" + getSex() + ", getBirthday()=" + getBirthday()
			+ ", getSchool()=" + getSchool() + ", getId()=" + getId() + ", getUsername()=" + getUsername()
			+ ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}





}


