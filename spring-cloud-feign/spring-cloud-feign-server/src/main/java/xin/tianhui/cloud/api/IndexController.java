package xin.tianhui.cloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@GetMapping
	public String index(){
		return "hello world!";
	}


}
