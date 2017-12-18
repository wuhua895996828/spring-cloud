package com.woody.service;

import org.springframework.stereotype.Component;

/**    
 * @Title: UserServiceCallback.java  
 * @Package com.woody.service  
 * @Description: TODO  
 * @author wh 
 * @date 2017年12月13日 下午4:52:47  
 * @version V1.0    
 */
@Component
public class UserServiceCallback implements UserService {

	public String client_service() {
		return "sorry system error";
	}

}
