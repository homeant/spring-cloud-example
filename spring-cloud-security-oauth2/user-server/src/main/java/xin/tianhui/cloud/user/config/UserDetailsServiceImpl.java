package xin.tianhui.cloud.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import xin.tianhui.cloud.user.domain.UserDo;
import xin.tianhui.cloud.user.service.UserService;

@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserService userService;

	private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		UserDo user = userService.findUser(s);
		return User.builder().username(user.getUsername()).password(user.getPassword())
				.passwordEncoder((p) -> passwordEncoder.encode(p)).build();
	}
}
