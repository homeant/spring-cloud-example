package xin.tianhui.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.tianhui.cloud.service.SayHelloService;

@RestController
public class IndexController {

	@Autowired
	private SayHelloService sayHelloService;

	@GetMapping
	public String sayHello(String name) {
		return sayHelloService.sayHello(name);
	}
}
