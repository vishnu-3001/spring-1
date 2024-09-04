package example.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.vishnu.spring_project_1.App03SpringGame;
import com.vishnu.spring_project_1.game.gameRunner;

@Component
class Business{
	Dependency1 dependency1;
	Dependency2 dependency2;
	public Business(Dependency1 dependecy1,Dependency2 dependency2) {
		super();
		this.dependency1=dependecy1;
		this.dependency2=dependency2;
	}
	public String tostring() {
		return "Using"+dependency1+" and "+dependency2;
	}
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DependencyInjection {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(DependencyInjection.class)){
			//context.getBean(gamingConsole.class).up();
			System.out.println(context.getBean(Business.class).tostring());
			}
	}
}
