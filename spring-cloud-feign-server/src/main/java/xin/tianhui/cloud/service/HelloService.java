package xin.tianhui.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "helloService")
public interface HelloService {
	@GetMapping("/hello")
	String hello(@RequestParam("name") String name);
}
