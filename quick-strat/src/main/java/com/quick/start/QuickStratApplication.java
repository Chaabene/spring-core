package com.quick.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.quick.start.controllers.HelloWorldController;
import com.quick.start.service.HelloWorldService;
import com.quick.start.service.impl.HelloWorldEnglishServiceImpl;
import com.quick.start.service.impl.InjectedByConstructorService;
import com.quick.start.service.impl.InjectedBySetterService;

/**
 * @author Aymen Chaaben
 *
 */
@SpringBootApplication
public class QuickStratApplication {
	
	

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(QuickStratApplication.class, args);
	
	HelloWorldController helloWorldController =(HelloWorldController) ctx.getBean("helloWorldController");
	helloWorldController.getMessage();
	
	}

}
