package com.vishnu.spring_project_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class helloworldconfiguration {
	@Bean
	public String name() {
		return "vishnu";
	}
}
