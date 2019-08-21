package com.niit.fashionclubbackend;
import static org.junit.Assert.*;
import org.junit.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import com.niit.bean.Supplier;
import com.niit.dao.SupplierDao;
public class SupplierUnitTest {
@Autowired
	static SupplierDao supplierDao;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.niit");
	    context.refresh();
	    
	    supplierDao=(SupplierDao) context.getBean("supplierDao");
	}
//@Ignore
	@Test
	public void addSupplierTest()
	{
		Supplier supplier=new Supplier();
		supplier.setSupplierName("Niha");
		supplier.setSupplierAddress("Flat no:14,Bnajara Hills ,Hyd");
		
		assertTrue("Problem in adding the Supplier",supplierDao.addSupplier(supplier));
	}
	@Ignore
	@Test
	public void deleteSupplierTest()
	{
		Supplier Supplier=supplierDao.getSupplier(1);
		
		assertTrue("Problem in deleting Supplier",supplierDao.deleteSupplier(Supplier));
	}
	@Ignore
	@Test
	public void updateSupplierTest()
	{
		Supplier Supplier=supplierDao.getSupplier(2 );
		Supplier.setSupplierAddress("Flat no:14,Banjara Hills, Hyd");
		
		assertTrue("Problem in updating Supplier",supplierDao.updateSupplier(Supplier));
	}
}
