package com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private ApiConfig apiConfig;
	
	@GetMapping("/hello")
	public String sayHello() {
		return apiConfig.getHost()+" "+apiConfig.getPort()+" "+apiConfig.getTimeout();
	}
	
}