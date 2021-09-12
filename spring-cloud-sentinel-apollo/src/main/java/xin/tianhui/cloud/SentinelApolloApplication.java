package xin.tianhui.cloud;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.apollo.ApolloDataSource;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

import java.util.List;

@SpringCloudApplication
public class SentinelApolloApplication {
	public static void main(String[] args) {
		loadRules();
		SpringApplication.run(SentinelApolloApplication.class, args);
	}

	private static void loadRules() {
		// Set up basic information, only for demo purpose. You may adjust them based on your actual environment.
		// For more information, please refer https://github.com/ctripcorp/apollo
		String appId = "sentinel-demo";
		String apolloMetaServerAddress = "http://106.54.227.205";
		System.setProperty("app.id", appId);
		System.setProperty("apollo.meta", apolloMetaServerAddress);

		String namespaceName = "sentinel.yml";
		String flowRuleKey = "flowRules";
		// It's better to provide a meaningful default value.
		String defaultFlowRules = "[]";


		ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new ApolloDataSource<>(namespaceName,
				flowRuleKey, defaultFlowRules, source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
		}));
		FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
	}
}
