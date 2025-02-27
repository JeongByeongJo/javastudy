package myobj;

public class Game369Player {
	String name;
	int win;
	int loss;
	
	public Game369Player(String name) {
		this.name = name;
	}
	
	public void win() {
		++win;
	}
	
	public void loss() {
		++loss;		
	}
	
	public void print() {
		System.out.printf("%s: %d승, %d패\n", name, win, loss);
	}

}
