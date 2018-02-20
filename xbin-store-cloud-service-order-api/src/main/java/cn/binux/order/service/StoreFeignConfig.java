package cn.binux.order.service;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration("order")
public class StoreFeignConfig {

    @Bean
    @Scope("prototype")
    @Primary
    Request.Options options2() {
        return new Request.Options(7000000, 5000000);
    }
}
