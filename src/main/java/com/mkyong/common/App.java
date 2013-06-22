package com.mkyong.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
	public static HelloWorld obj=new HelloWorld();

	public String showInjectedName(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		obj = (HelloWorld) context.getBean("helloBean");
		return obj.returnString();
	}
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
