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


@Service
public class OrderServiceImpl implements OrderService {
	
	
	@Autowired
    private OrderRepository orderRepository;
	
	@Autowired
	private OrderItemClient orderItemClient;
	
	public void save(OrderDto orderDto){
		
		Order order = new Order();
		order.setCutomerName(orderDto.getCutomerName());
		order.setShippingAddress(orderDto.getShippingAddress());
		order.setTotal(orderDto.getTotal());
		order.setOrderDate(orderDto.getOrderDate());
		
		//BeanUtils.copyProperties(order, orderDto);
		Order o = orderRepository.save(order);
		
		List<OrderItem> list = new ArrayList<OrderItem>();
		for(OrderItemDto d : orderDto.getOrderItems()) {
			OrderItem orderItem = new OrderItem();
			orderItem.setOrderId(o.getId());
			orderItem.setProductCode(d.getProductCode());
			orderItem.setProductName(d.getProductName());
			orderItem.setQuantity(d.getQuantity());
			list.add(orderItem);
		}
		
		
		orderItemClient.create(list);
		
	}
	
	public OrderDto getOrder(long id) {
		Optional<Order> order = orderRepository.findById(id);
		OrderDto orderDto = new OrderDto();
		List<OrderItemDto> olist = new ArrayList<>();
		
		if(order.isPresent()) {
			orderDto.setCutomerName(order.get().getCutomerName());
			orderDto.setOrderDate(order.get().getOrderDate());
			orderDto.setShippingAddress(order.get().getShippingAddress());
			orderDto.setTotal(order.get().getTotal());
			List<OrderItem> oL = orderItemClient.listOrderItemByOrderId(order.get().getId());
			for(OrderItem o : oL) {
				OrderItemDto orderItem = new OrderItemDto();
				orderItem.setProductCode(o.getProductCode());
				orderItem.setProductName(o.getProductName());
				orderItem.setQuantity(o.getQuantity());
				olist.add(orderItem);
				
			}
		
			orderDto.setOrderItems(olist);
		}
		
		
		return orderDto;
	}
	
	
}



