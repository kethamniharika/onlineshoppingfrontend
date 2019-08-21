package com.niit.dao;
import java.util.*;
import com.niit.bean.Supplier;
public interface SupplierDao {
	public boolean addSupplier(Supplier supplier);
	   public boolean deleteSupplier(Supplier supplier);
	   public boolean updateSupplier(Supplier supplier);
	   public List<Supplier> listSupplier();
	   public Supplier getSupplier(int SupplierID);

}
