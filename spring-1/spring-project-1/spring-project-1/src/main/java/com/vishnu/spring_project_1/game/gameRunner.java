package com.vishnu.spring_project_1.game;

public class gameRunner {
	private gamingConsole game;
	public gameRunner(gamingConsole game) {
		this.game=game;
	}
	public void run() {
		//System.out.println("Mario ran away");
		System.out.println("super contra running");
//		game.up();
//		game.down();
//		game.right();
//		game.left();
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
