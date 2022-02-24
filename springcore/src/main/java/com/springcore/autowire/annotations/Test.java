package com.springcore.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String[] args) {
	ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/springcore/autowire/annotations/autoconfig.xml");
	Emp emp1 = ctxt.getBean("emp1", Emp.class);
	System.out.println(emp1);
}
}
