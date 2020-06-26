package xin.tianhui.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xin.tianhui.cloud.service.hystrix.HelloServiceHystrix;

@FeignClient(value = "spring-cloud-feign-server",fallback = HelloServiceHystrix.class)
public interface HelloService {
	@GetMapping("/hello")
	String hello(@RequestParam("name") String name);
}
