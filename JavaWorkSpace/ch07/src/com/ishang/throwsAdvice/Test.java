package com.ishang.throwsAdvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		// 加载配置文件
		ClassPathResource resource = new ClassPathResource("beans8.xml");
		// 根据配置文件构造BeanFactory对象
		BeanFactory factory = new XmlBeanFactory(resource);
		// 取得提供具体业务逻辑的Java Bean
		Customer customer = (Customer) factory.getBean("customer");
		// 调用Java Bean中的具体方法
		customer.buy();
	}
}
