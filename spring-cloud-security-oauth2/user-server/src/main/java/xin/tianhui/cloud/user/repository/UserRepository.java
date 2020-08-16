package xin.tianhui.cloud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xin.tianhui.cloud.user.domain.UserDo;

public interface UserRepository extends JpaRepository<UserDo, Long> {

	UserDo findByUsername(String username);
}
