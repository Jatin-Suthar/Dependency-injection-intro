package com.project.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		//load the spring config files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		//check if they are the same beans
		boolean compare = (theCoach == alphaCoach);
		System.out.println("Quick check whether they pointing to the same memory location:  " + compare);
		System.out.println("Memory location for first object:  " + theCoach);
		System.out.println("Memory loaction for second object:  " + alphaCoach);
		context.close();
	}
}
