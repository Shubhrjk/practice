package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person person = (Person) ctxt.getBean("person");
		System.out.println(person);
		Addition addition = (Addition) ctxt.getBean("Add");
		addition.doSum();
	}

}
