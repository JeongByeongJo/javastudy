import myobj.Car;
import myobj.CountKorean;
import myobj.CountLetter;
import myobj.CountNumeric;
import myobj.Fruit;
import myobj.Grape;
import myobj.Peach;
import myobj.Pet;
import myobj.Truck;

public class C06_Extend {
	/*
		# 클래스 상속 (extends 입력 )
		
		- 이미 만들어져 있는 클래스를 그대로 물려받아 사용하는 문법
		- 클래스를 물려받은 후에는 새로운 변수 또는 메서드를 추가하거나
		  가지고 있던 변수 또는 메서드를 덮어 쓸 수 있다.
		- 부모가 가지고 있는 기능을 자식 클래스에서 마음대로 고쳐 사용하는 것을
		  '오버라이드(Override)'라고 부른다.
		- 상속 받은 자식 클래스는 반드시 가장 첫 줄에서
		  부모 클래스의 생성자를 호출해야 한다.
		  
		# super
		
		- 자식 클래스로 생성된 인스턴스는 내부에 부모 클래스 부분을 지니고 있다.(그림을 떠올려)
		- super는 상속받은 클래스로 만들어진 인스턴스에서 부모 클래스 부분을 의미.
		- this는 상속받은 클래스로 만들어진 인스턴스에서 현재 클래스 부분을 의미.
		- super()는 상속받은 클래스에서 부모 클래스의 생성자를 의미한다.
		- this()는 상속받은 클래스에서 현재 클래스의 다른 생성자를 의미한다. 
	*/
	public static void main(String[] args) {
		// 상속시 자식 클래스는 부모의 변수와 메서드를 그대로 물려받는다.
		Car c1 = new Car(); //부모
		Truck t1 = new Truck(); //자식
		
		//Car t2 = new Truck();
		
		System.out.println(c1.brand);
		System.out.println(c1.max_speed);		
		System.out.println(t1.max_fuel);
		
		c1.drive();
		t1.drive();
		
		// 자식 클래스에는 부모 클래스에는 없던 기능이 새로 추가될 수 있다.
		System.out.println(t1.max_cargo);
		System.out.println(t1.curr_cargo);
		
		t1.addCargo(100);
		
		Pet p1 = new Pet("밥", 95);
		
		t1.print_a();
		
		Fruit fruit = new Fruit("color");		
		Grape grape = new Grape();
		Peach peach = new Peach();
		
		fruit.eat(3);
		grape.eat(2);
		peach.eat(1);
		
		fruit.color = "color";
		System.out.println(grape.color);
		System.out.println(peach.color);
		System.out.println(fruit.color);
		
		grape.print();
		
		CountLetter countLetter = new CountLetter("type");
		CountKorean countKorean = new CountKorean();
		CountNumeric countNumeric = new CountNumeric();
		
	}
}
