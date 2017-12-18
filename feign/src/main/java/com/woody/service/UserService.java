package com.woody.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Title: UserService.java
 * @Package com.woody.service
 * @Description: TODO
 * @author wh
 * @date 2017年12月13日 下午4:38:29
 * @version V1.0
 */
@FeignClient(value = "service-client", fallback = UserServiceCallback.class)
public interface UserService {

	@RequestMapping(value = "client_service", method = RequestMethod.GET)
	public String client_service();

}
