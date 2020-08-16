package xin.tianhui.cloud.test.nacos;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.client.naming.NacosNamingService;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import xin.tianhui.cloud.test.ApplicationTest;

import java.util.List;
import java.util.Properties;

@Slf4j
public class NacosServerTest extends ApplicationTest {
	@Test
	public void test() throws NacosException {
		Properties properties = new Properties();
		properties.setProperty("serverAddr", "http://127.0.0.1:8848");
		NacosNamingService nacosNamingService = new NacosNamingService(properties);

		Instance instance = new Instance();
		instance.setIp("127.0.0.1");
		instance.setPort(8080);
		//instance.setWeight(null);
		//instance.setClusterName(null);
		instance.setMetadata(null);

		nacosNamingService.registerInstance("test",instance);

		Instance instance2 = new Instance();
		instance2.setIp("127.0.0.1");
		instance2.setPort(8080);
		//instance.setWeight(null);
		//instance.setClusterName(null);
		instance2.setMetadata(null);

		nacosNamingService.registerInstance("test2",instance2);

		List<Instance> allInstances = nacosNamingService.getAllInstances("test");
		log.info("instance:{}",allInstances);
	}
}
