package com.chocozhao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {



	@GetMapping(value = "/test")
	public String get() {
		return "Hello world！！！";
	}
}
