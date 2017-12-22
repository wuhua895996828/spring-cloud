package com.woody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Title: App.java
 * @Package com.woody
 * @Description: TODO
 * @author wh
 * @date 2017年12月13日 下午4:16:36
 * @version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@EnableCircuitBreaker
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

}
