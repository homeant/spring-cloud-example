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


## Sentinel

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

```bash
java -Dserver.port=8081 -Dcsp.sentinel.dashboard.server=localhost:8082 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.7.2.jar
```

