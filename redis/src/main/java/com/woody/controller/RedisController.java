package com.woody.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: RedisController.java
 * @Package woody.spring_cloud_redis.controller
 * @Description: TODO
 * @author wh
 * @date 2017年12月15日 下午4:03:17
 * @version V1.0
 */
@RestController
public class RedisController {

	@Autowired
	private StringRedisTemplate redisTemplate;

	@RequestMapping("/redis/set")
	public String set(String key, String value) {
		RedisCallback<Boolean> redisCallback = connection -> {
			connection.set("foot".getBytes(), "woody".getBytes());
			return true;
		};
		redisTemplate.execute(redisCallback);
		return null;
	}

	@RequestMapping("/redis/get")
	public String get(String key) {
		RedisCallback<String> redisCallback = connection -> {
			String value = new String(connection.get("foot".getBytes()));
			return value;
		};
		return redisTemplate.execute(redisCallback);
	}

}
