package com.vishnu.spring_project_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02helloworldspring {
	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(helloworldconfiguration.class);
		System.out.println(context.getBean("name"));
	}
}
