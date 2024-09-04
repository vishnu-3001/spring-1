package example.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class springContextLauncher {

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(springContextLauncher.class)){
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			}
	}

}
