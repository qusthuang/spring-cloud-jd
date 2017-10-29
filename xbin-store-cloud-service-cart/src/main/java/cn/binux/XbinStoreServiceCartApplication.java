package cn.binux;

import cn.binux.cart.service.impl.CartServiceImpl;
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
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.lang.reflect.Method;

@EnableHystrix
@Configuration
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan(basePackages = "cn.binux.mapper")
public class XbinStoreServiceCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreServiceCartApplication.class, args);
	}

	@Bean
	public JedisClient jedisClient() {
		return new JedisClientSingle();
	}

	@Bean
	public Feign.Builder feignHystrixBuilder() {
		return HystrixFeign.builder().setterFactory(new SetterFactory() {

			public HystrixCommand.Setter create(Target<?> target, Method method) {
				return HystrixCommand.Setter
						.withGroupKey(HystrixCommandGroupKey.Factory.asKey(CartServiceImpl.class.getSimpleName()))// 控制 RemoteProductService 下,所有方法的Hystrix Configuration
						.andCommandPropertiesDefaults(
								HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(10000) // 超时配置
						);
			}
		});
	}
}
