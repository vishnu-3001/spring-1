package springhelloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02helloworldspring {
	public static void main(String[] args) {
		try (var context=new AnnotationConfigApplicationContext(helloworldconfiguration.class)){
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("mrbean"));
			System.out.println(context.getBean(Address.class));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameter"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(Person.class));
		}
	}
}
