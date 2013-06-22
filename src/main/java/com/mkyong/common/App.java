package com.mkyong.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
	public static HelloWorld obj=new HelloWorld();

    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        obj = (HelloWorld) context.getBean("constructorBean");
        obj.printInfo();
    }
	public String getInfoName()
    {
		HelloWorld objInfo=new HelloWorld();
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        objInfo = (HelloWorld) context.getBean("constructorBean");
        return objInfo.returnString();
    }

	public String getInfoAge()
    {
		HelloWorld objInfo=new HelloWorld();
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        objInfo = (HelloWorld) context.getBean("constructorBean");
        return objInfo.returnAge();
    }
}
