package com.feignclient.orderservice.feign.client;

import com.feignclient.commons.OrderItem;
import com.feignclient.orderservice.feign.config.CustomFeignConfig;

import feign.RequestLine;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Set;

@FeignClient(name="orderitem-service", configuration = CustomFeignConfig.class)
public interface OrderItemClient {
   
    //@GetMapping("/orderitem/{ordertId}")
	@RequestLine("GET /orderitem/{ordertId}")
    //@RequestMapping(method = RequestMethod.GET, value = "/orderitem/{ordertId}")
    List<OrderItem> listOrderItemByOrderId(@PathVariable long ordertId);
    
    //@PostMapping("/orderitem/create")
    //@RequestMapping(method = RequestMethod.POST, value = "/orderitem/create")
	@RequestLine("POST /orderitem/create")
    List<OrderItem> create(@RequestBody List<OrderItem> list);

}
