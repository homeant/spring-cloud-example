package xin.tianhui.cloud.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xin.tianhui.cloud.user.domain.UserDo;
import xin.tianhui.cloud.user.repository.UserRepository;
import xin.tianhui.cloud.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDo findUser(String username) {
		return userRepository.findByUsername(username);
	}
}
