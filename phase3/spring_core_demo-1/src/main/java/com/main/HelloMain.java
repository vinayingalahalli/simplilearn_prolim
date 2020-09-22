package com.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Hello;

public class HelloMain {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("beanconfiglifecycledemo.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beanconfiglifecycledemo.xml");
		
		Hello h=context.getBean(Hello.class);
		System.out.println(h.getMessage());
		System.out.println("hashcode of h is "+h.hashCode());
		Hello h1=context.getBean(Hello.class);
		System.out.println(h1.getMessage());
		System.out.println("hashcode of h1 is "+h1.hashCode());
		context.registerShutdownHook();
		context.close();
	}

}
