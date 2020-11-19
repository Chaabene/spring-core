package com.quick.start.service.impl;

import com.quick.start.service.HelloWorldService;

public class HelloWorldGermanServiceImpl implements HelloWorldService {

	@Override
	public String helloWorld(String from) {
		System.out.println("Hallo Welt " + from);
		return "Hallo Welt " + from;
	}

}
