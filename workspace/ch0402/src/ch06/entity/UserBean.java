package ch06.entity;

public class UserBean {

	private int rid;
	private String rname;
	private String rsex;
	private int ryear;
	private int rmonth;
	private String rrace;
	private String rintro;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getRsex() {
		return rsex;
	}
	public void setRsex(String rsex) {
		this.rsex = rsex;
	}
	public int getRyear() {
		return ryear;
	}
	public void setRyear(int ryear) {
		this.ryear = ryear;
	}
	public int getRmonth() {
		return rmonth;
	}
	public void setRmonth(int rmonth) {
		this.rmonth = rmonth;
	}
	public String getRrace() {
		return rrace;
	}
	public void setRrace(String rrace) {
		this.rrace = rrace;
	}
	public String getRintro() {
		return rintro;
	}
	public void setRintro(String rintro) {
		this.rintro = rintro;
	}
	@Override
	public String toString() {
		return "UserBean [rname=" + rname + ", rsex=" + rsex + ", ryear=" + ryear + ", rmonth=" + rmonth + ", rrace="
				+ rrace + ", rintro=" + rintro + "]";
	}
	
	
	
	
}
