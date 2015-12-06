package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class MainApp {
	
	   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      ArrayList<Person> objs = new ArrayList<Person>();
		      int i=1;
		      for(i=0;i<=6;++i){
		    	  Person obj = (Person) context.getBean("person" + i+1);
		    	  objs.add(obj);
		      }

		      for(i=0;i<=6;++i){
		    	  Person p = objs.get(i);
		    	  String name = p.getName();
		    	  String gender = p.getGender();
		    	  int age = p.getAge();
		    	  System.out.println(name + " is a " + gender + " and " + age +" years old.");
		      }
		      ((ConfigurableApplicationContext)context).close();
	   }

}
