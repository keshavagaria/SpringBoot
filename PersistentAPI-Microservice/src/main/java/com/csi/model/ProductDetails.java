package com.csi.model;



import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class ProductDetails {
private int productId;
private String productName;
 private double productPrice;
 private Date productLaunchDate;
 private long productTechnicalSupportNumber;
	/*
	 * public int getProductId() { return productId; } public void setProductId(int
	 * productId) { this.productId = productId; } public String getProductName() {
	 * return productName; } public void setProductName(String productName) {
	 * this.productName = productName; } public double getProductPrice() { return
	 * productPrice; } public void setProductPrice(double productPrice) {
	 * this.productPrice = productPrice; } public Date getProductLaunchDate() {
	 * return productLaunchDate; } public void setProductLaunchDate(Date
	 * productLaunchDate) { this.productLaunchDate = productLaunchDate; } public
	 * long getProductTechnicalSupportNumber() { return
	 * productTechnicalSupportNumber; } public void
	 * setProductTechnicalSupportNumber(long productTechnicalSupportNumber) {
	 * this.productTechnicalSupportNumber = productTechnicalSupportNumber; }
	 * 
	 */ 

}
