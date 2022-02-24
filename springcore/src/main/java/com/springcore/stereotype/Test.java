package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
             Student std= ctxt.getBean("ob", Student.class);
       //      System.out.println(std);
             System.out.println(std.getAddress());
             System.out.println(std.getAddress().getClass().getName());
             
	}

}
