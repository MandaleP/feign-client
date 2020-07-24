package com.feignclient.orderservice.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feignclient.commons.Order;
import com.feignclient.commons.OrderItem;
import com.feignclient.commons.repository.OrderRepository;
import com.feignclient.orderservice.dto.OrderDto;
import com.feignclient.orderservice.dto.OrderItemDto;
import com.feignclient.orderservice.feign.client.OrderItemClient;

public interface OrderService {
	
	
	
	public void save(OrderDto orderDto);
	
	public OrderDto getOrder(long id);
	
}



