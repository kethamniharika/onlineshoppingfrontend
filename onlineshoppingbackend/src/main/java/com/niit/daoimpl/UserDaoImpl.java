package com.niit.daoimpl;

import java.util.*;
import javax.transaction.*;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.niit.bean.User;
import com.niit.dao.UserDao;
@Repository("UserDao") 
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
    SessionFactory sessionFactory;
    
	public boolean addUser(User User) {
		
		 try
	        {
	        sessionFactory.getCurrentSession().save(User);
	        return true;
	        }
	        catch(Exception e)
	        {
	        return false;
		}
	}

	public boolean deleteUser(User User) {
	
		try
        {
        sessionFactory.getCurrentSession().delete(User);
        return true;
        }
        catch(Exception e)
        {
        return false;
        }
	}

	public boolean updateUser(User User) {
		
		try
        {
        sessionFactory.getCurrentSession().update(User);
        return true;
        }
        catch(Exception e)
        {
        return false;
	}
	}

	public List<User> listUsers() {
		
		 Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from User");
	        List<User> listUsers=query.list();
	        session.close();
			return listUsers;
	}

	public User getUser(int UserID) {
		
		   Session session=sessionFactory.openSession();
	        User User=session.get(User.class,UserID);        
			return User ;
	}

	public List<User> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
