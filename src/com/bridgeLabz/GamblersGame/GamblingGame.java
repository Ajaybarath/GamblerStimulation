package com.bridgeLabz.GamblersGame;

public class GamblingGame {
	
	static final int INITIAL_STAKE = 100;
	static final int EVERY_GAME_STAKE = 1;
	
	int gamesWon = 0;
	int gamesLost = 0;
	
	public static void main(String args[]) {
		

		System.out.println("Money at stake for every game : " + EVERY_GAME_STAKE);
		System.out.println("Money at stake for every day : " + INITIAL_STAKE);
		
		GamblingGame player = new GamblingGame();
		player.exitLogic();
 		
	}
	
	public void gamePlay() {
		
		int gameStatus = (int) (Math.random()*10) % 2;
		
		if (gameStatus == 1) {
			gamesWon ++;
			System.out.println("Gambler won 1 $");
		}
		else {
			gamesLost ++;
			System.out.println("Gambler lost 1 $");
		}
		
	}
	
	public void exitLogic() {
		
		while(gamesWon < 50 && gamesLost < 50) {
			gamePlay();
		}
		
		if (gamesWon == 50) {
			System.out.println("Player resigned by winning 50$");
		}
		else {
			System.out.println("Player resigned by loosing 50$");
		}
	}
 
	
}
