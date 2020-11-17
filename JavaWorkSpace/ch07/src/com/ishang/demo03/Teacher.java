package com.ishang.demo03;

import com.ishang.demo01.Person;
import com.ishang.demo02.Student;

public class Teacher implements Person{
	//老师名字
	private String name;
	//老师最喜欢的一个学生
	private Student student;
	
	//实现Person接口中的go方法
	public void go(){
		System.out.println( name + "去给" + student.getName()+ "讲课");
	}

	//设置老师名字
	public void setName(String name) {
		this.name = name;
	}

	//返回老师名字
	public String getName() {
		return name;
	}

	//设置学生
	public Student getStudent() {
		return student;
	}

	//返回学生
	public void setStudent(Student student) {
		this.student = student;
	}	
}
