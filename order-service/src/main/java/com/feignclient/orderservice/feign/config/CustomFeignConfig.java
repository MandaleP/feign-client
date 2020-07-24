package com.feignclient.orderservice.feign.config;

import feign.Contract;
import feign.auth.BasicAuthRequestInterceptor;
import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;

public class CustomFeignConfig {

    @Bean
    public Contract feignContract() {
        return new Contract.Default();
    }

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }

}
