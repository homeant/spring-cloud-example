package xin.tianhui.cloud.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/hello")
	public String hello(String name){
		return restTemplate.getForObject("http://spring-cloud-feign/hello?name=" + name, String.class);
	}
}
