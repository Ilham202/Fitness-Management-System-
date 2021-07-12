package com.model;

import org.springframework.stereotype.Component;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

//pojo class with required attributes,getters and setters
@Component
public class Order {
	@NotEmpty(message="{error.customerName.blank}")
	private String customerName;
	@NotEmpty(message="{error.contactNumber.blank}")
	private String contactNumber;
	@Min(value=0, message="{error.couponCode.positive}")
	private int couponCode;
	private String displayType;
	private String brandName;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public int getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(int couponCode) {
		this.couponCode = couponCode;
	}
	
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	

}
