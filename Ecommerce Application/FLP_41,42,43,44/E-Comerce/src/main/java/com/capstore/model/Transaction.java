package com.capstore.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactions")
public class Transaction {
	
	@Id
	@Column(name="orderid")
	private long orderId;
	@Column(name="productid")
	private long productId;
	@Column(name="productname")
	private String productName;
	@Column(name="productimage")
	private String productImage;
	
	
	@Column(name="customerid")
	private long customerId;
	
	@Column(name="dateofbooking")
	private Date dateOfBooking;
	@Column(name="price")
	private long price;
	@Column(name="quantity")
	private long quantity;
	public Transaction(long orderId, long productId, String productName, String productImage, long customerId,
			Date dateOfBooking, long price, long quantity) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.customerId = customerId;
		this.dateOfBooking = dateOfBooking;
		this.price = price;
		this.quantity = quantity;
	}
	public Transaction() {
		super();
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Date getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	


}
