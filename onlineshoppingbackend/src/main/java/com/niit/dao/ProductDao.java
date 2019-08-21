package com.niit.dao;

import java.util.*;
import com.niit.bean.Product;
public interface ProductDao {
	   public boolean addProduct(Product Product);
	   public boolean deleteProduct(Product Product);
	   public boolean updateProduct(Product Product);
	   public List<Product> listCategories();
	   public Product getProduct(int ProductID);

}
