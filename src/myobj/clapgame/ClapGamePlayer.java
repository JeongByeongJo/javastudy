package myobj.clapgame;

public class ClapGamePlayer {
	
	String name;
	int win;
	int loss;
	
	public ClapGamePlayer(String name) {
		this.name = name;
	}
	
	public void win() {
		++this.win;		
	}
	
	public void loss() {
		++this.loss;
	}
	
	public void print() {
		System.out.printf(" %s: %d승 %d패\n", name, win, loss);
	}
	
}
