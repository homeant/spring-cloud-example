package xin.tianhui.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xin.tianhui.cloud.service.HelloService;

@RestController
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private HelloService helloService;

	@GetMapping("/hello")
	public String hello(String name){
		return restTemplate.getForObject("http://spring-cloud-feign-server/hello?name=" + name, String.class);
	}

	@GetMapping("/hello2")
	public String hello2(String name){
		return helloService.hello(name);
	}
}
