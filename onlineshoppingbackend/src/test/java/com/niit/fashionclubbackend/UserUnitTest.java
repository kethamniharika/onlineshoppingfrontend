package com.niit.fashionclubbackend;
import static org.junit.Assert.*;
import org.junit.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import com.niit.bean.User;
import com.niit.dao.UserDao;
public class UserUnitTest {
@Autowired
	static UserDao UserDao;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    UserDao=(UserDao) context.getBean("UserDao");
	}
	//@Ignore
	@Test
	public void addUserTest()
	{
		User User=new User();
		User.setUsername("niha");
		User.setPassword("password");
		User.setRole("ROLE_USER");
		User.setEnabled(true);
		User.setCustomerName("niha1");
		assertTrue("Problem in adding the User",UserDao.addUser(User));
	}
	@Ignore
	@Test
	public void deleteUserTest()
	{
		User User=UserDao.getUser(1);
		
		assertTrue("Problem in deleting User",UserDao.deleteUser(User));
	}
	@Ignore
	@Test
	public void updateUserTest()
	{
		User User=UserDao.getUser(2 );
		User.setCustomerName("prani");
		assertTrue("Problem in updating User",UserDao.updateUser(User));
	}
}
