package com.quick.start.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */
@Component
@Profile("english")
public class HelloWorldEnglishServiceImpl implements HelloWorldService {

	
	public void helloWorld(String from) {
		System.out.println("Hello world " +from);
	}



}
