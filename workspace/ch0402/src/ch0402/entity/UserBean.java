package ch0402.entity;

public class UserBean {
	
	private String uname;
	private String upasswd;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpasswd() {
		return upasswd;
	}
	public void setUpasswd(String upasswd) {
		this.upasswd = upasswd;
	}
	@Override
	public String toString() {
		return "UserBean [uname=" + uname + ", upasswd=" + upasswd + "]";
	}

	
}
