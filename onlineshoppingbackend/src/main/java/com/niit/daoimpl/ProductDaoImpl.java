package com.niit.daoimpl;

import java.util.*;
import javax.transaction.*;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.niit.bean.Product;
import com.niit.dao.ProductDao;
@Repository("ProductDao") 
@Transactional
public  class ProductDaoImpl implements ProductDao {
	@Autowired
    SessionFactory sessionFactory;
    
	public boolean addProduct(Product Product) {
		
		 try
	        {
	        sessionFactory.getCurrentSession().save(Product);
	        return true;
	        }
	        catch(Exception e)
	        {
	        return false;
		}
	}

	public boolean deleteProduct(Product Product) {
	
		try
        {
        sessionFactory.getCurrentSession().delete(Product);
        return true;
        }
        catch(Exception e)
        {
        return false;
        }
	}

	public boolean updateProduct(Product Product) {
		
		try
        {
        sessionFactory.getCurrentSession().update(Product);
        return true;
        }
        catch(Exception e)
        {
        return false;
	}
	}

	public List<Product> listProducts() {
		
		 Session session=sessionFactory.openSession();
	        Query query=session.createQuery("from Product");
	        List<Product> listProducts=query.list();
	        session.close();
			return listProducts;
	}

	public Product getProduct(int ProductID) {
		
		   Session session=sessionFactory.openSession();
	        Product Product=session.get(Product.class,ProductID);        
			return Product ;
	}

	public List<Product> listCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
