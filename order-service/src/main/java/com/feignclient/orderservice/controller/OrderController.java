package com.feignclient.orderservice.controller;


import com.feignclient.orderservice.dto.OrderDto;
import com.feignclient.orderservice.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    public OrderService orderService;

    
    @PostMapping("/create")
    @Transactional
    public void createOrder(OrderDto orderDto) {
    	
    	orderService.save(orderDto);
    	
    }
    
    @GetMapping("/{id}")
    @Transactional
    public OrderDto getOrder(long id) {
    	
    	return orderService.getOrder(id);
    	
    }

}
