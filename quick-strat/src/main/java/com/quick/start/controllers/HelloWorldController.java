package com.quick.start.controllers;

import com.quick.start.service.HelloWorldService;

//@Controller
public class HelloWorldController {

	private HelloWorldService helloService;

	private HelloWorldService helloWorldSpanichService;

	private HelloWorldService helloWorldEnglish;

	public void getMessage() {
		System.out.println("***************************************");
		helloService.helloWorld("by type");

		System.out.println("***************************************");
		helloWorldSpanichService.helloWorld("qualifier default name");

		System.out.println("***************************************");
		helloWorldEnglish.helloWorld("qualifier custom name");
	}

	public void setHelloService(HelloWorldService helloService) {
		this.helloService = helloService;
	}

	public void setHelloWorldSpanichService(HelloWorldService helloWorldSpanichService) {
		this.helloWorldSpanichService = helloWorldSpanichService;
	}

	public void setHelloWorldEnglish(HelloWorldService helloWorldEnglish) {
		this.helloWorldEnglish = helloWorldEnglish;
	}

}
