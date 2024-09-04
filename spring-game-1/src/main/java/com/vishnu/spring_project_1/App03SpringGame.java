package com.vishnu.spring_project_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vishnu.spring_project_1.game.gameRunner;
import com.vishnu.spring_project_1.game.gamingConsole;
import com.vishnu.spring_project_1.game.pacman;

@Configuration
@ComponentScan("com.vishnu.spring_project_1.game")
public class App03SpringGame {
	public static void main(String[] args) {
		
		try(var context=new AnnotationConfigApplicationContext(App03SpringGame.class)){
		//context.getBean(gamingConsole.class).up();
		context.getBean(gameRunner.class).run();
		}
	}
}


