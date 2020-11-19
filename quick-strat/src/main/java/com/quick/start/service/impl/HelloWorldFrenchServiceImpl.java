package com.quick.start.service.impl;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */

public class HelloWorldFrenchServiceImpl implements HelloWorldService {

	
	public String helloWorld(String from) {
		System.out.println("Salut tt le monde " +from);
		return "Salut tt le monde " +from;
	}



}
