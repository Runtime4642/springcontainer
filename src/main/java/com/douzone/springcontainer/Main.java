package com.douzone.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.douzone.springcontainer.user.Friend;
import com.douzone.springcontainer.user.User;
import com.douzone.springcontainer.user.User1;

public class Main {
	
	public static void main(String[] args) {
		testBeanFactory();
		testApplicationContext();
	}
	public static void testBeanFactory() {
		System.out.println("@@@@@testBeanFactory()@@@@@@@@");
		//@ 설정인 경우 id가 자동으로 만들어진다 => User1 = user1
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
		User1 user1 =(User1)bf1.getBean("user1");
		System.out.println(user1.getName());
		
		
		//XML Bean 설정인 경우에는 id를 주지않으면 에러
		//id 대신에 type 으로 빈을 가져올수 있다.
		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));
		 //user1 =(User1)bf2.getBean("user1");
		user1 =bf2.getBean(User1.class);
		System.out.println(user1.getName());
	}
	
	public static void testApplicationContext() {
		System.out.println("@@@@@testApplicationContext()@@@@@@@@");
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/user/applicationContext.xml");
		User1 user1 =ac.getBean(User1.class);
		System.out.println(user1.getName());
		
		//오류 빈 설정은 id나 name 설정을 해야한다.
//		user1 =(User1)ac.getBean("user1");
//		System.out.println(user1.getName());
		
		//	name으로 가져오기
		User user =(User)ac.getBean("user");
		System.out.println(user);
		
		//id로 가져오기
		user =(User)ac.getBean("usr");
		System.out.println(user1.getName());
		
		//id로 가져오기
		user =(User)ac.getBean("usr2");
		System.out.println(user);
		
		//id로 가져오기
		user =(User)ac.getBean("usr3");
		System.out.println(user);
		
		//id로 가져오기
		Friend friend =(Friend)ac.getBean("friend");
		System.out.println(friend);
		
	
				
		// 오류: 빈이 만들어진게 오류가 아니라 같은 타입의 빈이 2개 이상 존재하기 때문
//		user=(User)ac.getBean(User.class);
//		System.out.println(user.getName());
		
		
	}

}
