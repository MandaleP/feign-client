package com.feignclient.commons.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feignclient.commons.Order;
import com.feignclient.commons.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	public List<OrderItem> findByOrderId(long id);

}
