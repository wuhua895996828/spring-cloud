package com.woody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: App.java
 * @Package com.woody
 * @Description: TODO
 * @author wh
 * @date 2017年12月13日 下午2:37:15
 * @version V1.0
 */
@SpringBootApplication
@EnableEurekaServer
@RestController
public class App {
  
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
