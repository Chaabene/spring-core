package com.quick.start;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.quick.start.service.HelloWorldService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/helloworld-config.xml", "classpath:/helloworld-french-config.xml" })
public class FrenchIntegTest {

	@Autowired
	private HelloWorldService helloWorldService;

	@Test
	public void testHelloWorld() {
		String result = helloWorldService.helloWorld("");
		assertEquals("Salut tt le monde ", result);
	}

}
