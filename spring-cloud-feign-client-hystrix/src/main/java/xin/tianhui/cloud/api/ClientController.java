package xin.tianhui.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.tianhui.cloud.service.HelloService;

@RestController
public class ClientController {

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public String hello(String name){
		return helloService.hello(name);
	}
}
