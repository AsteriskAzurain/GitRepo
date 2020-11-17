package com.ishang.afterAdvice;

public class Customer {
	private String name; // 客户姓名
	// 客户购买东西
	public void buy() {
		System.out.println("客户" + this.name + "买了很多东西");
	}
	// 返回客户姓名
	public String getName() {
		return name;
	}
	// 设置客户姓名
	public void setName(String name) {
		this.name = name;
	}
}
