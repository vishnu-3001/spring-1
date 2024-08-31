package springhelloworld;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Person (String name,int age,Address addr) {};
record Address(String firstLine,String city) {};

@Configuration
public class helloworldconfiguration {
	@Bean
	public String name() {
		return "vishnu";
	}
	@Bean
	public int age() {
		return 16;
	}
	@Bean
	public Person person() {
		return new Person("vishnu",24,new Address("chapin","NY"));
	}
	@Bean(name="mrbean")
	public Address addr() {
		return new Address("chapin","NY");
	}
	@Bean()
	@Primary
	//Qualifier("Person")
	public Person person2MethodCall() {
		return new Person(name(),age(),addr());
	}
	@Bean()
	public Person person3Parameter(String name,int age,Address mrbean) {
		return new Person(name,age,mrbean);
	}
}
