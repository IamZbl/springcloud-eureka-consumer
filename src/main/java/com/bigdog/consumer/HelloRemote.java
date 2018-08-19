package com.bigdog.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//name远程服务名，即spring.application.name=springcloud-eureka-client
@FeignClient(name = "springcloud-eureka-client")
public interface HelloRemote {

	@RequestMapping(value = "/hello")
	public  String hello(@RequestParam(value = "name") String name);
}
