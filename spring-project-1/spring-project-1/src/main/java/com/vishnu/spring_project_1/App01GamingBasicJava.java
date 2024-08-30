package com.vishnu.spring_project_1;

import com.vishnu.spring_project_1.game.gameRunner;
import com.vishnu.spring_project_1.game.marioGame;
import com.vishnu.spring_project_1.game.*;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		var game = new marioGame();
//		var gameRunner=new gameRunner(marioGame);
//		var game=new superContra();
		var game=new pacman();
		var gameRunner=new gameRunner(game);
		gameRunner.run();
	}

}
