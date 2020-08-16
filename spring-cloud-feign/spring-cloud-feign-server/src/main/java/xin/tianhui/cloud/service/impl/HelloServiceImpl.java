package xin.tianhui.cloud.service.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.tianhui.cloud.service.HelloService;

@RestController
public class HelloServiceImpl implements HelloService {
	@GetMapping("hello")
	public String hello(String name) {
		return new StringBuffer("hello ").append(name).toString();
	}
}
