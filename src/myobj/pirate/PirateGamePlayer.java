package myobj.pirate;

public class PirateGamePlayer {
	String name;
	int money;
	int score; // 매 게임마다 초기화되는 점수
	
	public PirateGamePlayer(String name) {
//		this.name = name;
//		this.money = 3000;
		this(name, 3000); // 위에 2줄을 이와같이 줄일 수 있다.
	}
	
	public PirateGamePlayer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	// 해당 클래스의 필드값을 꺼내서 볼 수 있는 메서드들 : Getter
	// 해당 클래스의 필드값을 수정할 수 있는 메서드들 : Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	public void setScoer(int score) {
		this.score = score;
	}
	
	public int	getScoer() {
		return score;
	}	
	
	public void addScore(int score) {
		this.score += score;
	}
}
