package com.mmik.trainings.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	private Greeting greeting;

	@Before
	public void setup() {
		System.out.println("----- setup Test");
		greeting = new GreetingImpl();
	}
	
	@Test
	public void greetShouldReturnValue() {
		System.out.println("----- greetShouldReturnValue Test");
		String result = greeting.greet("Junit");
		assertNotNull("Object is Null !", result);
		assertEquals("Hello Junit",result);		
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void greetShouldThrowException_For_NameNotNull() {
		System.out.println("----- greetShouldThrowException_For_NameNotNull Test");
		greeting.greet(null);
	}
	
	@Test(expected= IllegalArgumentException.class)
	public void greetShouldThrowException_For_NameIsBlank() {
		System.out.println("----- greetShouldThrowException_For_NameIsBlank Test");
		greeting.greet("");
	}
	
	@After
	public void teardown (){
		System.out.println("----- teardown Test");
		greeting = null;
	}

}
