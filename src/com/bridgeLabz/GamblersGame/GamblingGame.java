package com.bridgeLabz.GamblersGame;

public class GamblingGame {
	
	static final int INITIAL_STAKE = 100;
	static final int EVERY_GAME_STAKE = 1;
	
	public static void main(String args[]) {
		

		System.out.println("Money at stake for every game : " + EVERY_GAME_STAKE);
		System.out.println("Money at stake for every day : " + INITIAL_STAKE);
		
		int gameStatus = (int) (Math.random()*10) % 2;
		
		if (gameStatus == 1) {
			System.out.println("Gambler won 1 $");
		}
		else {
			System.out.println("Gambler lost 1 $");
		}
 		
	}

}
