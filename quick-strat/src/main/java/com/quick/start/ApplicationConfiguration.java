package com.quick.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.quick.start.service.HelloWorldService;
import com.quick.start.service.impl.HelloWorldFactory;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public HelloWorldFactory helloWorldFactory() {
		return new HelloWorldFactory();
	}


	@Bean
	@Profile("english")
	public HelloWorldService helloWorldEnglishServiceImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
	@Bean
	@Profile({"default","french"})
	public HelloWorldService helloWorldFrenchServiceImpl(HelloWorldFactory factory) {
		return factory.createHelloWorldService("fr");
	}
}
