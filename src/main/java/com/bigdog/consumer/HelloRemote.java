package com.bigdog.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigdog.hystrix.HelloRemoteHystrix;

//name远程服务名，即spring.application.name=springcloud-eureka-client
//添加指定fallback类，在服务熔断的时候返回fallback类中的内容。
@FeignClient(name = "springcloud-eureka-client",fallback=HelloRemoteHystrix.class)
public interface HelloRemote {

	@RequestMapping(value = "/hello")
	public  String hello(@RequestParam(value = "name") String name);
}
