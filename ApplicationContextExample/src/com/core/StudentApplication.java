package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {

	public static void main(String[] args) {
		ApplicationContext at = new ClassPathXmlApplicationContext("StudentConfig.xml");

		Student s1 = (Student) at.getBean("studentObj");
		System.out.println(s1.toString());
	}

}
