package com.feignclient.orderservice.dto;

import java.util.Date;
import java.util.List;


public class OrderDto{
	
    private String cutomerName;
	
    private String shippingAddress;

    private Date orderDate;
	
    private long total;
	
    private List<OrderItemDto> orderItems;

	public String getCutomerName() {
		return cutomerName;
	}

	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<OrderItemDto> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItemDto> orderItems) {
		this.orderItems = orderItems;
	}

}
