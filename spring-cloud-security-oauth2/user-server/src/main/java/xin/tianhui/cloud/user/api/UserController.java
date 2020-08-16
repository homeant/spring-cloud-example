package xin.tianhui.cloud.user.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.tianhui.cloud.user.domain.UserDo;
import xin.tianhui.cloud.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/{username}")
	public UserDo findUser(@PathVariable("username") String username){
		return userService.findUser(username);
	}
}
