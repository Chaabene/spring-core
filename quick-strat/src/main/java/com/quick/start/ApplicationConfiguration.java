package com.quick.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
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
	@Profile({"french","default"})
	@Primary
	public HelloWorldService helloWorldFrenchService(HelloWorldFactory factory) {
		return factory.createHelloWorldService("fr");
	}
	
	@Bean
	public HelloWorldService helloWorldSpanichService(HelloWorldFactory factory) {
		return factory.createHelloWorldService("es");
	}

	@Bean(name="english")
	public HelloWorldService helloWorldEnglishService(HelloWorldFactory factory) {
		return factory.createHelloWorldService("en");
	}
}
