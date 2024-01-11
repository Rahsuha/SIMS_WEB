package com.sims.web;

public class Product {
protected String productID;
protected String productName;
protected String productCatalogues;


public Product(){
	super();
}

public Product(String productID, String productName,String productCatalogues) {
	this.productID=productID;
	this.productName=productName;
	this.productCatalogues=productCatalogues;
}

public void setproductid(String productid) {
	this.productID=productid;
}


public String getproductID() {
	return productID;
}

public void setproductName(String productName) {
	this.productName=productName;
}
public String getProductName() {
	return productName;
}
public void setproductCatalogues(String productCatalogues){
	this.productCatalogues=productCatalogues;
}

public String getproductCatalogues() {
	return productCatalogues;
}
}
