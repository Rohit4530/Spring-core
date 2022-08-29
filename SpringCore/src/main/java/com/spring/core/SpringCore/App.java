package com.spring.core.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
      ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
      Student student=context.getBean("student1",Student.class);
      System.out.println(student);
    }
}
 