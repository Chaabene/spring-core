package com.quick.start.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.quick.start.service.HelloWorldService;

/**
 * @author Aymen Chaaben
 *
 */
@Component
@Profile({"default","french"})
public class HelloWorldFrenchServiceImpl implements HelloWorldService {

	
	public void helloWorld(String from) {
		System.out.println("Salut tt le monde " +from);
	}



}
