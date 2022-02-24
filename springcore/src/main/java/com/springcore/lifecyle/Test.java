package com.springcore.lifecyle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext ctxt = new ClassPathXmlApplicationContext("com/springcore/lifecyle/config.xml");
        Samosa samosa = (Samosa) ctxt.getBean("s1");
        System.out.println(samosa);
        
       ctxt.registerShutdownHook(); 
     Pepsi pepsi =(Pepsi) ctxt.getBean("p1");
        
        
        
        
        
	}

}
