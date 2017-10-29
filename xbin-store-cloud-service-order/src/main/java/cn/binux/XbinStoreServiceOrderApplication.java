package cn.binux;

import cn.binux.order.service.impl.OrderServiceImpl;
import cn.binux.utils.JedisClient;
import cn.binux.utils.impl.JedisClientSingle;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import feign.Feign;
import feign.Target;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.lang.reflect.Method;

@EnableHystrix
@EnableFeignClients
@Configuration
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "cn.binux.mapper")
public class XbinStoreServiceOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreServiceOrderApplication.class, args);
	}

	@Bean
	public JedisClient jedisClient() {
		return new JedisClientSingle();
	}
}
