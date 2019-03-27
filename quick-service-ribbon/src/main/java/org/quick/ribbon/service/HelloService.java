
/**   
 * 文件名：HelloService.java   
 * 作者：Andy  
 * 版本信息： V 1.0  
 * 日期：2019年3月14日   
 * Copyright 足下 Corporation 2019    
 * 版权所有   
 *   
 */
package org.quick.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author: Andy
 * @version: 2019年3月14日 下午3:28:00
 * @desc 消费服务接口
 */
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError") // 熔断回调方法
	public String hiService(String name) {
		return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
	}

	public String hiError(String name) {
		return "hi," + name + ",sorry,error!";
	}

}
