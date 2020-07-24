package com.feignclient.orderitemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.feignclient")
@EnableJpaRepositories("com.feignclient")
@EntityScan( basePackages = {"com.feignclient"} )
public class OrderItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderItemServiceApplication.class, args);
	}

}
