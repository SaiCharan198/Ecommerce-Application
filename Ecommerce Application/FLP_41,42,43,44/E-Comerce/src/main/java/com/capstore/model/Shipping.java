package com.capstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ship")
public class Shipping {
	@Id
	@Column(name="orderid")
	private long orderId;
	@Column(name="productid")
	private long productId;
	@Column(name="customerid")
	private long customerId;
	@Column(name="customername")
	private String customerName;
//	@Column(name="dateofbooking")
//	private Date dateOfBooking;
//	@Column(name="dateofdelivery")
//	private Date dateOfDelivery;
	private String address;
	@Column(name="pincode")
	private long pinCode;
	@Column(name="paymentmode")
	private String modeOfPayment;
	@Column(name="merchantid")
	private long merchantId;
	private String status;
	private double price;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPinCode() {
		return pinCode;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(long merchantId) {
		this.merchantId = merchantId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	
}
