package com.quick.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.quick.start.service.impl.HelloWorldEnglishServiceImpl;
import com.quick.start.service.impl.HelloWorldFrenchServiceImpl;

@Configuration
public class ApplicationConfiguration {

	@Bean
	@Profile("english")
	public HelloWorldEnglishServiceImpl helloWorldEnglishServiceImpl() {
		return new HelloWorldEnglishServiceImpl();
	}
	@Bean
	@Profile({"default","french"})
	public HelloWorldFrenchServiceImpl helloWorldFrenchServiceImpl() {
		return new HelloWorldFrenchServiceImpl();
	}
}
