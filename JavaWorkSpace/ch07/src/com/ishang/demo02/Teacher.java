package com.ishang.demo02;

import com.ishang.demo01.Person;

public class Teacher implements Person {
	// 老师名字
	private String name;

	// 实现Person接口中的go方法
	public void go() {
		System.out.println(name + "去教室讲课");
	}

	// 设置老师名字
	public void setName(String name) {
		this.name = name;
	}

	// 返回老师名字
	public String getName() {
		return name;
	}

}
