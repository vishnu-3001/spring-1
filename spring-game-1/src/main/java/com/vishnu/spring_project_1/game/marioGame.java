package com.vishnu.spring_project_1.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class marioGame implements gamingConsole {
	public void up() {
		System.out.println("Mario ran up");
	}
	public void down() {
		System.out.println("Mario ran down");
	}
	public void left() {
		System.out.println("Mario ran left");
	}
	public void right() {
		System.out.println("Mario ran right");
	}
}
