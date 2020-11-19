package com.quick.start.service.impl;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */

public class HelloWorldSpanichServiceImpl implements HelloWorldService {

	
	public String helloWorld(String from) {
		System.out.println("Hola mundo " +from);
		return "Hola mundo " +from;
	}



}
