package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.HelloScope;

public class HelloScopeMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("scopesdemo.xml");
//		HelloScope hs1=context.getBean(HelloScope.class);
//		System.out.println("hashcode of hs1 is "+hs1.hashCode());
//		System.out.println(hs1.getMessage());
		
//		HelloScope hs2=context.getBean(HelloScope.class);
//		System.out.println("hashcode of hs2 is "+hs2.hashCode());
//		System.out.println(hs2.getMessage());
		
		
		//Accessing beans with their ids
		HelloScope hs1=(HelloScope) context.getBean("h1");
		System.out.println("hashcode of hs1 is "+hs1.hashCode());
		System.out.println(hs1.getMessage());
		
		HelloScope hs2=(HelloScope) context.getBean("obj2");
		System.out.println("hashcode of hs2 is which is pointing to obj2 of singleton & is lazy "+hs2.hashCode());
		System.out.println(hs2.getMessage());
		
		HelloScope hs3=(HelloScope) context.getBean("obj2");
		System.out.println("hashcode of hs3 is which is pointing to obj2 of singleton & is lazy "+hs3.hashCode());
		System.out.println(hs3.getMessage());
		
		HelloScope hs4=(HelloScope) context.getBean("obj3");
		System.out.println("hashcode of hs4 for id obj3 is(prototype scope) "+hs4.hashCode());
		System.out.println(hs4.getMessage());
		
		HelloScope hs5=(HelloScope) context.getBean("obj3");
		System.out.println("hashcode of hs5 for id obj3 is(prototype scope) "+hs5.hashCode());
		System.out.println(hs5.getMessage());
		
		HelloScope hs6=(HelloScope) context.getBean("obj4");
		System.out.println("hashcode of hs6 for id obj4 is(prototype scope/CI) "+hs6.hashCode());
		System.out.println(hs6.getMessage());
		
		HelloScope hs7=(HelloScope) context.getBean("obj4");
		System.out.println("hashcode of hs7 for id obj4 is(prototype scope/CI) "+hs7.hashCode());
		System.out.println(hs7.getMessage());
	}

}
