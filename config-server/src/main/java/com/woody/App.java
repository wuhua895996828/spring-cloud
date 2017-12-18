package com.woody;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
@RestController
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
