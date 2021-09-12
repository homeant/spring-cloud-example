package xin.tianhui.cloud.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xin.tianhui.cloud.service.SayHelloService;

@Slf4j
@Service
public class SayHelloServiceImpl implements SayHelloService {
	@SentinelResource("sayHello")
	public String sayHello(String name) {
		log.info(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch (Exception e){
			e.printStackTrace();
		}
		return "hello ".concat(name).concat("!");
	}
}
