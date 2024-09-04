package com.vishnu.spring_project_1.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class superContra implements gamingConsole {
	public void up() {
		System.out.println("Contra ran up");
	}
	public void down() {
		System.out.println("Contra ran down");
	}
	public void left() {
		System.out.println("Contra ran left");
	}
	public void right() {
		System.out.println("Contra ran right");
	}
}
