package com.niit.fashionclubbackend;
import static org.junit.Assert.*;
import org.junit.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import com.niit.bean.Product;
import com.niit.dao.ProductDao;
public class ProductUnitTest {
@Autowired
	static ProductDao ProductDao;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    ProductDao=(ProductDao) context.getBean("ProductDao");
	}
@Ignore
	@Test
	public void addProductTest()
	{
		Product Product=new Product();
		Product.setProName("Laptop");
		Product.setProDesc("Fast speed, good storage");
		
		assertTrue("Problem in ading the Product",ProductDao.addProduct(Product));
	}
	@Ignore
	@Test
	public void deleteProductTest()
	{
		Product Product=ProductDao.getProduct(1);
		
		assertTrue("Problem in deleting Product",ProductDao.deleteProduct(Product));
	}
	@Ignore
	@Test
	public void updateProductTest()
	{
		Product Product=ProductDao.getProduct(2 );
	//	Product.setProductDesc("Fast");
		
		assertTrue("Problem in updating Product",ProductDao.updateProduct(Product));
	}
}
