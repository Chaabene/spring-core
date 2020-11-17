package com.quick.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */
@Component
public class InjectedByConstructorService {
	private HelloWorldService helloWorldService;

	@Autowired
	public InjectedByConstructorService(HelloWorldService helloWorldService) {
		super();
		this.helloWorldService = helloWorldService;
	}
	
	public  void getMessage() {
		helloWorldService.helloWorld(InjectedByConstructorService.class.getSimpleName());
	}

}
