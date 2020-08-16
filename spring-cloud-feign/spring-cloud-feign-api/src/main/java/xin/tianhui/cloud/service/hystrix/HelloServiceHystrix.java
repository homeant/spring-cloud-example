package xin.tianhui.cloud.service.hystrix;

import org.springframework.stereotype.Component;
import xin.tianhui.cloud.service.HelloService;

@Component
public class HelloServiceHystrix implements HelloService {
	public String hello(String name) {
		return "name,hystrix!!!";
	}
}
