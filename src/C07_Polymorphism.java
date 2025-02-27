
public class C07_Polymorphism {
	/*
		# 객체의 다형성
		
		- 객체는 다양한 형태를 지닐 수 있다는 성질
		- 강아지는 강아지이기도 하고 동물이기도 하다.
		  (강아지는 동물이다(o), 동물은 강아지다(x))
		- 자식 클래스는 자식 클래스이기도 하지만 부모 클래스이기도 하다. (자식은 부모의 모든걸 가지고 있다. 그래서...)
		- 부모 클래스가 자식 클래스가 되기에는 모르는것이 많아 무리가 있다. (부모는 자식의 일부만 가지고 있다. 그래서...)
	*/
	public static void main(String[] args) {
		Animal a1 = new Animal("거북이", 200);
		Dog d1 = new Dog("댕댕이", 3);
		
		// 업캐스팅 (자식이 부모 타입으로  타입캐스팅 되는 것) (자연스러운 타입캐스팅)
		Animal a2 = new Dog("상근이", 2);
		Animal a3 = d1;
		
		// Animal이 Dog가 되기 위해서는 알아야 할 것이 너무 많다...
		
		// 다운캐스팅(부모 타입을 자식 타입으로 타입캐스팅 하려는 것)
		//Dog d2 = new Animal(); // 일반적으로 허용되지 않는다.
		
		a1.crying();
		d1.crying();
		
		// a2와 a3는 Animal 타입 인스턴스임에도 불구하고
		// Dog 타입의 crying()을 사용하고 있다.
		
		// 오버라이딩된 메서드는 업케스팅되더라도 자식클래스의 것으로 동작한다.
		a2.crying();
		a3.crying();
		
		// 부모타입에만 있는 메서드 사용해보기
		a1.checkAge();
		d1.checkAge();
		a2.checkAge();
		
		// 자식타입에만 있는 메서드 사용해보기
		
		d1.patrol();
		
		// 원래는 강아지였던 인스턴스들이 업캐스팅되고나면
		// 강아지에만 존재하던 본래의 기능을 사용하지 못한다.
		//a2.patrol();
		//a3.patrol();
		
		// a2, a3는 원래 강아지였던 인스턴스이기 때문에
		// 다운캐스팅을 통해 다시 강아지로 돌아가는 것이 가능하다.
		Dog d4 = (Dog) a2;
		Dog d5 = (Dog) a3;
		
		// 원래 강아지였던적이 없는 인스턴스의 경우
		// 빨간줄은 안생기기만 컴파일 도중에 에러가 발생한다.
		//Dog d6 = (Dog) a1;
		
		// 다시 강아지로 돌아간 a2, a3는 patrol()을 사용할 수 있다.
		d4.patrol();
		d5.patrol();		
	}
}

class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	// (1) 부모 타입에도 있고 자식타입에도 있는 메서드 (오버라이드)
	public void crying() {
		System.out.println(name + "동물이 웁니다.");
	}
	
	// (2) 부모 타입에만 있는 메서드
	public void checkAge() {
		System.out.println(name + "의 나이는 " + age + "살 입니다.");
	}
}
class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);		
	}
	
	// (1) 부모 타입에도 있고 자식타입에도 있는 메서드 (오버라이드)
	//     업캐스팅 후에도 사용가능
	@Override
	public void crying() {
		System.out.println(name + "가 멍멍하고 짖었습니다!");
	}
	
	// (3) 자식 타입에만 있는 메서드 (업캐스팅 후에는 사용 불가능)
	public void patrol() {
		System.out.println(name + "는 주변을 산책했습니다.");
	}
}
class Lion extends Animal {

	public Lion(String name, int age) {
		super(name, age);
		
	}
	
}