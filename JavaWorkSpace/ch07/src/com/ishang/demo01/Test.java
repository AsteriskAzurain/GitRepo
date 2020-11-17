package com.ishang.demo01;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) {
		Test t = new Test(); 
	}

	// 普通Java应用
	public void test1() {
		Student stu = new Student();
		Teacher tea = new Teacher();
		stu.go();
		tea.go();
	}

	// 利用工程类解耦
	public void test2() {
		Person stu = Factory.getStudent();
		stu.go();
		Person tea = Factory.getTeacher();
		tea.go();
	}

	// 利用spring注入
	public void test3() {
		// 创建ClassPathResource实例
		ClassPathResource isr = new ClassPathResource("beans1.xml");

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
