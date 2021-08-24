package com.bridgeLabz.GamblersGame;

public class GamblingGame {
	
	static final int INITIAL_STAKE = 100;
	static final int EVERY_GAME_STAKE = 1;
	
	int gamesWon = 0;
	
	int totalAmountWonOrLost = 0;
	
	int numberOfDaysWon = 0;
	int numberOfDaysLost = 0;
	
	public static void main(String args[]) {
		

		System.out.println("Money at stake for every game : " + EVERY_GAME_STAKE);
		System.out.println("Money at stake for every day : " + INITIAL_STAKE);
		
		GamblingGame player = new GamblingGame();
		player.monthlyGamePlay();
//		player.exitLogic();
 		
	}
	
	public void gamePlay() {
		
		int gameStatus = (int) (Math.random()*10) % 2;
		
		if (gameStatus == 1) {
			gamesWon ++;
//			System.out.println("Gambler won 1 $");
		}
		else {
			gamesWon --;
//			System.out.println("Gambler lost 1 $");
		}
		
	}
	
	public void exitLogic() {
		
		while(Math.abs(gamesWon) < (INITIAL_STAKE/2)) {
			gamePlay();
		}
		 	
		if (gamesWon == (INITIAL_STAKE/2)) {
			numberOfDaysWon ++;
//			System.out.println("Player resigned by winning " + (INITIAL_STAKE + gamesWon));
		}
		else {
			numberOfDaysLost ++;
//			System.out.println("Player resigned by loosing " + (INITIAL_STAKE + gamesWon));
		}
		
		totalAmountWonOrLost += gamesWon;

	}
	
	public void gamePlayForNDays (int numberOfDays) {
		
		for (int i=0;i<numberOfDays;i++) {
			exitLogic();
			gamesWon = 0;
		}
		
		if (totalAmountWonOrLost > 0) {
			System.out.println("Total amount won for 20 days is " + totalAmountWonOrLost);
		} else {
			System.out.println("Total amount lost for 20 days is " + Math.abs(totalAmountWonOrLost));
		}
		
	}
 
	
	public void monthlyGamePlay() {
		
		for (int i=1;i<=12;i++) {
			gamePlayForNDays(20);
			System.out.println("Number of days won on month " + i +" is " + numberOfDaysWon);
			System.out.println("Number of days lost on month " + i +" is " + numberOfDaysLost);
			
		}
	}
	
}
