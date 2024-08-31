package com.vishnu.spring_project_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishnu.spring_project_1.game.gameRunner;
import com.vishnu.spring_project_1.game.gamingConsole;

public class App03SpringGame {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(gamingConfig.class)){
		//context.getBean(gamingConsole.class).up();
		context.getBean(gameRunner.class).run();
		}
	}
}


