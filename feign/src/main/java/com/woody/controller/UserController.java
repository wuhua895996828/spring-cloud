package com.woody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woody.service.UserService;

/**
 * @Title: UserController.java
 * @Package com.woody.controller
 * @Description: TODO
 * @author wh
 * @date 2017年12月13日 下午4:39:12
 * @version V1.0
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("client_service")
	public String client_service() {
		String str = userService.client_service();
		System.out.println(str);
		return str;
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("feign_service")
	public String feign_service() {
		System.out.println("-----feign_service-------");
		return "-----feign_service -----" + port + "-------";

	}

	// @Value("${foo}")
	String foo;

	@RequestMapping(value = "/hi")
	public String hi() {
		return foo;
	}

}
