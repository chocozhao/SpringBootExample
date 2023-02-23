package com.chocozhao.dubboconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.chocozhao.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Reference
	private HelloService helloService;

	@RequestMapping( "/hello" )
	public String sayHello() {
		return helloService.sayHello("chocozhao");
	}
}
