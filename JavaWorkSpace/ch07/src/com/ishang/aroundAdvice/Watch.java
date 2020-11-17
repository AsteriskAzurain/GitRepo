package com.ishang.aroundAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Watch implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("欢迎光临本店");   //拦截前执行
		Object buy = arg0.proceed();       //执行目标对象方法
		System.out.print("欢迎再次光临本店"); //拦截后执行
		return buy;
	}

}
