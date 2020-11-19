package com.quick.start.service.impl;

import com.quick.start.service.HelloWorldService;

public class HelloWorldFactory {
	public HelloWorldService createHelloWorldService(String language) {
		HelloWorldService helloWorldService = null;
		
		switch (language) {
		case "fr": 
			helloWorldService= new HelloWorldFrenchServiceImpl();
			break;
		case "en":
			helloWorldService= new HelloWorldEnglishServiceImpl();
			break;
		case "es":
			helloWorldService= new HelloWorldSpanichServiceImpl();
			break;
		case "gr":
			helloWorldService= new HelloWorldGermanServiceImpl();
			break;

		default:
			helloWorldService= new HelloWorldFrenchServiceImpl();
			break;
		}
		return helloWorldService;
	}
}
