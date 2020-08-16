package xin.tianhui.cloud.user.service;

import xin.tianhui.cloud.user.domain.UserDo;

public interface UserService {
	public UserDo findUser(String username);
}
