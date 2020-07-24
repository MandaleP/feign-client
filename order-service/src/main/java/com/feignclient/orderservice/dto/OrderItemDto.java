package com.feignclient.orderservice.dto;

import com.feignclient.commons.OrderItem;

public class OrderItemDto{
	
    private String productCode;
	
    private String productName;
	
    private long quantity;

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

}
