package myobj;

public class Dog extends Pet { // 생성자 자동으로 부르는 기능이 있다.(빨간줄일때
	public Dog() {
		super("멍멍이", 1); // <- 자식클래스에서는 무조건 부모클래스의 생성자를 먼저 입력해야한다. super: 부모 클래스를 지칭한다.
	}
}
