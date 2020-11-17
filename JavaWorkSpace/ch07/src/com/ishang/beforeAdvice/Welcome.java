
package com.ishang.beforeAdvice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class Welcome implements MethodBeforeAdvice {
	// 添加前置通知
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("欢迎光临本店"); // 前置通知
	}
}
