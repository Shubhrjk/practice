package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 ApplicationContext ctxt =new  ClassPathXmlApplicationContext("com/springcore/collection/config.xml");
	 Emp emp1 =(Emp) ctxt.getBean( "Emp1");
	 System.out.println(emp1.getPhones());
	 System.out.println(emp1.getName());
	 System.out.println(emp1.getAddress());
	 System.out.println(emp1.getCourses());
	}

}
