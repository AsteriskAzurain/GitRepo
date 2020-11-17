package com.ishang.throwsAdvice;

import org.springframework.aop.ThrowsAdvice;

public class Error implements ThrowsAdvice {
	public void afterThrowing(Exception ex) {
		System.out.println("在顾客购买东西时发生了错误");
		System.out.println("错误的具体信息如下:");
		System.out.println(ex.getMessage());
	}
}
