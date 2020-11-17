package com.ishang.demo01;

public class Factory {
	
	// 返回Teacher类实例
	public static Person getTeacher() {
		return new Teacher();
	}

	// 返回Student类实例
	public static Person getStudent() {
		return new Student();
	}
}
