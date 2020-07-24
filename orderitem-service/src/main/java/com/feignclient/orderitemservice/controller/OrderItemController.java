package com.feignclient.orderitemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.feignclient.commons.OrderItem;
import com.feignclient.commons.repository.OrderItemRepository;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/orderitem")
public class OrderItemController {
	
	@Autowired
	private OrderItemRepository orderItemRepository;

    @GetMapping("{id}")
    public List<OrderItem> listOrderItems(long id){
        return orderItemRepository.findByOrderId(id);
    }

    
    
    @PostMapping("/create")
    private List<OrderItem> create(List<OrderItem> orderItem){
        return orderItemRepository.saveAll(orderItem);
    }
}
