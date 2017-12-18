package com.woody.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Title: UserService.java
 * @Package woody.spring_cloud_client.service
 * @Description: TODO
 * @author wh
 * @date 2017年12月14日 下午5:45:30
 * @version V1.0
 */
@FeignClient(value = "service-feign")
public interface UserService {
	
	@RequestMapping(value ="feign_service" ,method =RequestMethod.GET)
	String feign_service(); 

}
