package com.ishang.utils;

public class Department {
	private int id;
	private String name;
	private int parentid;
	
	public void setID(int id) {this.id=id;}
	public int getID() {return id;}
	
	public void setName(String name) {this.name=name;}
	public String getName() {return name;}
	
	public void setParentid(int pid) {this.parentid=pid;}
	public int getParentid() {return parentid;}
	
	public void setAll(int id, String n, int pid) {
		setID(id);
		setName(n);
		setParentid(pid);
	}
}
