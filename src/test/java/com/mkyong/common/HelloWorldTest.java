package com.mkyong.common;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
	@Test
	public void shouldBeHelloJames(){
		HelloWorld helloWorld=new HelloWorld();
		assertThat(helloWorld.returnString(),is("Hello! James"));
	}
}
