package com.douzone.springcontainer;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.springcontainer.user.User;

import config.user.AppConfig01;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig01.class)
public class MainTest {
	
	@Autowired
	private User user;

	public void testUserNotNull() {
		
	}
	
	@Test
	public void testMethod1() {
		int x =10;
		assert(2+x >1);
	}
	
	@Test
	public void testMethod2() {

			
	}
	
	@Test
	public void testMethod3() {
		User user = new User();
		assert(user != null);
	}
	
	
}
