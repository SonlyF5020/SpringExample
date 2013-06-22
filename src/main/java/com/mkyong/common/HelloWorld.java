package com.mkyong.common;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	private int age;

	public HelloWorld(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public HelloWorld(){}

	public String returnString(){
		return "Hello! "+name;
	}

	public String returnAge(){
		return "age:"+age;
	}
	public void printInfo() {
		System.out.println(returnString());
		System.out.println(returnAge());
	}
}
