package myobj;

public class PirateGamePlayer {
	final static int START_SCORE = 20;
	final static int START_CASH = 2000;
	final static int PLAYER_NUMBER = 4;
	
	
	public int[] playerNum = new int[PLAYER_NUMBER];
	public int[] score = new int[PLAYER_NUMBER];
	public int[] cash = new int[PLAYER_NUMBER];
	public int[] count = new int[PLAYER_NUMBER];
	
//	public PirateGamePlayer() {
//		
//	}
	
	public PirateGamePlayer() {			
		for(int i = 0; i < PLAYER_NUMBER; ++i) {
			this.playerNum[i] = i;
			this.score[i] = START_SCORE;
			this.cash[i] = START_CASH;			
		}
	}
	
	public void first(int playerNum) {
		this.cash[playerNum - 1] = this.cash[playerNum - 1] + 1000;
	}
	
	public void scond(int playerNum) {
		this.cash[playerNum - 1] = this.cash[playerNum - 1] + 500;
	}
	
	public void third(int playerNum) {
		this.cash[playerNum - 1] = this.cash[playerNum - 1] - 500;
	}
	
	public void fourth(int playerNum) {
		this.cash[playerNum - 1] = this.cash[playerNum - 1] - 1000;
	}

}
