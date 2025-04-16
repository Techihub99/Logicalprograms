package com.org.java.generalLogical;

import java.util.Date;

public class Product {
	private int productId;
	private String productName;
	private double price;
	private String mfgCountry;
	private String mfgDate;
	
	public Product(int productId, String productName, double price, String mfgCountry, String mfgDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.mfgCountry = mfgCountry;
		this.mfgDate = mfgDate;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMfgCountry() {
		return mfgCountry;
	}
	public void setMfgCountry(String mfgCountry) {
		this.mfgCountry = mfgCountry;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", mfgCountry="
				+ mfgCountry + ", mfgDate=" + mfgDate + "]";
	}
	
	/*public void setProductId(int productId){
		this.productId=productId;
	}
	public int getProductId(){
		return productId;
	}*/
	

}
