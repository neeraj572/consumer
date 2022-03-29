package com.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/consume/{balance}")
	public String balanceConsumer(@PathVariable int balance) {
		String url="http://EXPOSER/update/"+balance;
		return restTemplate.getForObject(url,String.class);
	}

}
