package com.quick.start.service.impl;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */

public class HelloWorldEnglishServiceImpl implements HelloWorldService {

	
	public String helloWorld(String from) {
		System.out.println("Hello world " +from);
		return "Hello world " +from;
	}



}
