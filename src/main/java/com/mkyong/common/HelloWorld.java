package com.mkyong.common;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String returnString(){
		return "Hello! "+name;
	}
	public void printHello() {
		System.out.println(returnString());
	}
}
