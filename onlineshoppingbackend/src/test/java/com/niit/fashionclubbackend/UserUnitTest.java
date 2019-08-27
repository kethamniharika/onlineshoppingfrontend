package com.niit.fashionclubbackend;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDao;
import com.niit.bean.UserInfo;

public class UserUnitTest {

	@Autowired
	static UserDao userDao;
	
	@BeforeClass
	public static void init()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    userDao=(UserDao) context.getBean("userDao");
	}
	
	@Ignore
	@Test
	public void addUserInfoTest()
	{
		UserInfo user=new UserInfo();

		user.setUsername("swathi");
		user.setPassword("swathi@123");
		user.setRole("ROLE_ADMIN");
		user.setEnabled(true);
		user.setCustomerName("prani");
		user.setCustomerAddr("Hyderabad");

		assertTrue("Problem in adding the userInfo",userDao.addUser(user));
	}


	
	


}