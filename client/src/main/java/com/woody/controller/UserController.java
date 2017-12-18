package com.woody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.woody.service.UserService;

/**
 * @Title: UserController.java
 * @Package woody.spring_cloud_client.controller
 * @Description: TODO
 * @author wh
 * @date 2017年12月14日 下午5:43:24
 * @version V1.0
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Value("${server.port}")
	private String port;

	@RequestMapping(value = "client_service", method = RequestMethod.GET)
	public String provider() {
		System.out.println("---------client_service------------");
		return "------client_service=" + port + "-------";
	}

	@RequestMapping(value = "feign_service", method = RequestMethod.GET)
	public String feign_service() {
		String str = userService.feign_service();
		System.out.println(str);
		return str;
	}

}
