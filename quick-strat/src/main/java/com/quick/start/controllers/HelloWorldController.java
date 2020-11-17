package com.quick.start.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.quick.start.service.HelloWorldService;

@Controller
public class HelloWorldController {

	
	@Autowired
	private HelloWorldService helloService;

	@Autowired
	@Qualifier("helloWorldSpanichService")
	private HelloWorldService helloWorldSpanichService;
	
	@Autowired
	@Qualifier("english")
	private HelloWorldService helloWorldEnglish;
	
	



	public void getMessage() {
		System.out.println("***************************************");
		helloService.helloWorld("by type");
		
		System.out.println("***************************************");
		helloWorldSpanichService.helloWorld("qualifier default name");
		
		System.out.println("***************************************");
		helloWorldEnglish.helloWorld("qualifier custom name");
	}




}
