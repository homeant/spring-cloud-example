package xin.tianhui.cloud.test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import xin.tianhui.cloud.test.config.ApplicationConfiguration;

@ComponentScan
@SpringBootTest(classes = {ApplicationConfiguration.class})
public class ApplicationTest extends AbstractTestNGSpringContextTests {

}
