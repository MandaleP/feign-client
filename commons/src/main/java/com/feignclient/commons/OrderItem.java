package com.feignclient.commons;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ORDER_ITEM")
public class OrderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "PRODUCT_CODE")
    private String productCode;
	
	@Column(name = "PRODUCT_NAME")
    private String productName;
	
	@Column(name = "QUANTITY")
    private long quantity;
	
	@Column(name = "ORDERID")
	private long orderId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
}
