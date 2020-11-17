package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.User;

public class Test01 {
//  1、读取配置文件
//	2、通过sqlsessionfactorybuilder创建sqlsessionfactory会话工厂
//	3、通过sqlsessionfactory创建sqlsession
//	4、调用sqlsession的操作数据库方法
//	5、关闭sqlsession
	public static void main(String[] args) {
		try {
			test01();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("exception");
			e.printStackTrace();
		}
	}
	public void before() throws IOException {
		InputStream inputstream =Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sessionfactory =new SqlSessionFactoryBuilder().build(inputstream);
		SqlSession session =sessionfactory.openSession();
		
	}
	
	public static void test01() throws IOException {
		InputStream inputstream =Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sessionfactory =new SqlSessionFactoryBuilder().build(inputstream);
		SqlSession session =sessionfactory.openSession();
		User user=session.selectOne("findUserById", 1);
		System.out.println(user);
		session.close();
	}

	public void test02() throws IOException {
		InputStream inputstream =Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sessionfactory =new SqlSessionFactoryBuilder().build(inputstream);
		SqlSession session =sessionfactory.openSession();
		List<User> list=session.selectList("findUserByUserName", "赵");
		System.out.println(list);
		session.close();
	}
	
	public void test03() throws IOException {
		InputStream inputstream =Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory sessionfactory =new SqlSessionFactoryBuilder().build(inputstream);
		SqlSession session =sessionfactory.openSession();
		Date d= new Date();
		User user=new User(110,"sbsfbw","female",d,"sh");
		session.insert("insertUser",user);
		session.commit();
		session.close();
	}
	public void close() {
//		session.close();
	}
}
