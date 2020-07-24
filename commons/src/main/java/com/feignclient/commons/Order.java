package com.feignclient.commons;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ORDER_TAB")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "CUSTOMER_NAME")
    private String cutomerName;
	
	@Column(name = "SHIPPING_ADDRESS")
    private String shippingAddress;
	
	@Column(name = "ORDER_DATE")
    private Date orderDate;
	
	@Column(name = "TOTAL")
    private long total;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
}
