package com.ishang.demo02;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ishang.demo01.Person;

public class Test {
	public static void main(String[] args) {
		// 创建ClassPathResource实例
		ClassPathResource isr = new ClassPathResource("beans2.xml");

		// 创建XmlBeanFactory实例
		XmlBeanFactory factory = new XmlBeanFactory(isr);

		// 从Spring容器中获得Teacher实例
		Person teacher = (Person) factory.getBean("teacher");
		teacher.go();

		// 从Spring容器中获得Student实例
		Person student = (Person) factory.getBean("student");
		student.go();
	}
}
