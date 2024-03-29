package com.fugger.helloTests;
import static org.junit.Assert.*;

import org.junit.Test;

import hello.Employee;
import hello.Greeter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;
public class SampleTest {
	@Test
	public void testPasses(){
		String expected = "Hello";
		String hello = "Hello";
		assertEquals(hello, expected);
		System.out.println("TEST");
	}
	@Test
	public void beanTestTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
	    Greeter obj = (Greeter) context.getBean("greeter2");
	    obj.getMessage();
	    obj.getMessage2();
	    assertEquals(obj.getM(), "Hello World2!");
	}
}
