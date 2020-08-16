package xin.tianhui.cloud.user.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity(name = "t_user")
public class UserDo implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@Column(length = 32)
	private String username;

	@Column(length = 32)
	private String password;
}
