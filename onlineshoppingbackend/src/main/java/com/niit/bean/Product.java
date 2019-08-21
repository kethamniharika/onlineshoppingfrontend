package com.niit.bean;

import javax.persistence.*;
@Entity
@Table
public class Product {
	@Id
	@GeneratedValue
	int ProductID;	
	String ProductName;
	String ProductDesc;
	public int getProductID() {
		return ProductID;
	}
	public void setProductID(int ProductID) {
		this.ProductID = ProductID;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String ProductName) {
		ProductName = ProductName;
	}
	public String getProductDesc() {
		return ProductDesc;
	}
	public void setProductDesc(String ProductDesc) {
		ProductDesc = ProductDesc;
	}
	
}
