package com.quick.start.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.quick.start.service.HelloWorldService;

@Controller
public class HelloWorldController {
	@Autowired
	private HelloWorldService helloWorldService;
	
	public void getMessage() {
		helloWorldService.helloWorld(HelloWorldController.class.getSimpleName());
	}

}
