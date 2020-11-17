package com.ishang.demo02;

import com.ishang.demo01.Person;

public class Student implements Person {
	// 学生名字
	private String name;

	// 实现Person接口中的go方法
	public void go() {
		System.out.println(name + "去教室上课");
	}

	// 设置学生名字
	public void setName(String name) {
		this.name = name;
	}

	// 返回学生名字
	public String getName() {
		return name;
	}

}
