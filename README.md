# spring-cloud-example

> spring-cloud example


## Nacos

* spring-cloud-nacos-config
* spring-cloud-nacos-discovery

```bash
curl http://localhost:8080/config
```

### 代码解读

[跟我学spring cloud之nacos](https://tianhui.xin/blog/2020/06/27/spring_cloud_nacos/)


## Feign

* spring-cloud-feign-server
* spring-cloud-feign-client
* spring-cloud-feign-client-hystrix

```bash
curl http://localhost:8081/hello?name=tom
```

## Gateway

* spring-cloud-gateway

## Security



## Sentinel

* spring-cloud-sentinel

[下载地址](https://github.com/alibaba/Sentinel/releases)

[详解](https://tianhui.xin/blog/2019/04/21/springbootsentinel/)

```bash
java -Dserver.port=8081 -Dcsp.sentinel.dashboard.server=localhost:8081 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.7.2.jar
```

## sleuth

* spring-cloud-sleuth

[zipkin下载](https://repo1.maven.org/maven2/io/zipkin/zipkin-server/2.21.5/zipkin-server-2.21.5-exec.jar)


