package com.chocozhao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class NacosController {

//	@NacosValue(value = "${useLocalCache:false}",autoRefreshed = true)
//	private boolean useLocalCache;

//	@GetMapping(value = "/get")
//	public boolean get() {
//		return useLocalCache;
//	}
}
