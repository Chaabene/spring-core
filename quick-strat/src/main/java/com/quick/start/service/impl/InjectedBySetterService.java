package com.quick.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */
@Component
public class InjectedBySetterService {
	private HelloWorldService helloWorldService;

	@Autowired
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	public  void getMessage() {
		helloWorldService.helloWorld(InjectedBySetterService.class.getSimpleName());
	}


	
}
