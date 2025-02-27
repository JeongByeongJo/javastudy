package myobj;

public class Fruit {
	public String color;
	double calories;
	
	public Fruit(String color) {
		this.color = color;
	}
	
	public void eat(double amount) {
		calories -= amount;
	}
}

// myobj 내부에 Fruit 클래스를 상속받은 클래스 3가지 만들어보세요.
// Fruit처럼 상속 관계인 클래스들을 정의해보세요.