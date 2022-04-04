package com.springboot.demo;

import com.springboot.demo.config.HelloWorldConfig;
import com.springboot.demo.service.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorldService helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");
		helloWorldService.printHelloWorld();
		while (true){

		}
	}
}
