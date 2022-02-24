package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(JavaConfig.class);
	     Student std = ctxt.getBean("getStudent", Student.class);
	     System.out.println(std);
	     std.study();
	}
	

	
}
