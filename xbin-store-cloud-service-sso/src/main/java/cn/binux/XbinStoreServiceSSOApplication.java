package cn.binux;

import cn.binux.sso.service.impl.UserServiceImpl;
import cn.binux.utils.JedisClient;
import cn.binux.utils.impl.JedisClientSingle;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import feign.Feign;
import feign.Request;
import feign.Target;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.lang.reflect.Method;

@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "cn.binux.mapper")
public class XbinStoreServiceSSOApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreServiceSSOApplication.class, args);
	}

	@Bean
	public JedisClient jedisClient() {
		return new JedisClientSingle();
	}
}
