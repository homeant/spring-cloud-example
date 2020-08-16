package xin.tianhui.cloud.user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
public class Oauth2ServerConfig extends AuthorizationServerConfigurerAdapter {


	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

		super.configure(endpoints);
	}
}
