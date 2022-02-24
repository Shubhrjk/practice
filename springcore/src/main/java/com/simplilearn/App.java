package com.simplilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        ApplicationContext ctxt = new ClassPathXmlApplicationContext("config.xml");
       Student student1= (Student) ctxt.getBean("student1");
     System.out.println(student1);
        //####################################################
     
     
     
     
    }
}
