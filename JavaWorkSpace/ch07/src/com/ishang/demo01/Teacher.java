package com.ishang.demo01;

public class Teacher implements Person {

	//实现Person接口中的go方法
	@Override
	public void go() {
		System.out.println("去教室讲课");
	}

}
