package com.bigdog.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigdog.consumer.HelloRemote;

/**
 * 创建HelloRemoteHystrix类继承与HelloRemote实现回调的方法
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		// TODO Auto-generated method stub
		return "hello" +name+", this messge send failed ";
	}

	
}
