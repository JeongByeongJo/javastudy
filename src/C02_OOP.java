import java.util.Random;

public class C02_OOP {
	/*
		# 객체 지향 프로그래밍 (object Oriented Programming)
		
		- 변수와 함수들을 하나의 개념으로 묶어서 생각하는 개발 방식
		- 변수와 함수들을 무분별하게 사용하다보면 여러가지 문제들이 발생하기 때문에
		  우리에게 친숙한 개념으로 묶어서 생각하기 시작했다.
		- 변수는 주로 해당 객체의 현재 상태를 나타낸다.
		- 함수는 주로 해당 객체의 여러 기능(method)을 나타낸다.
		  기능(method)은 해당 객체의 상태를 변화시킨다.
		  
		ex: 책(Book)
		
		- 책의 현재 상태 (변수로 지정할 만한 것들)
		  제목, 글쓴이, 엮은이, 발행일, 고유번호(ISBN), 전체페이지
		  현재 페이지, 책갈피가 꽂힌 위치(int[])
		  
		- 책에 기능 (메서드로 만들어 볼만한 것들) *클래스 안에 있으면 메서드다(자바에서는 모두 메인 안에 있어야 해서 자바에는 메서드밖에 없다.)*
		  책장 넘기기(현재 페이지 + 1)
		  책 펴기(특정 페이지로 바로 이동)
		  책 덮기(0페이지로 이동)
		  책갈피 꽂기(책갈피 위치 배열에 현재 페이지 추가)
		  
		# 클래스 (Class)
		
		- 객체지향에서 말하는 객체를 프로그래밍 언어로 표현하는 문법
		- 클래스는 해당 객체의 설계도 역할을 한다.
		- 클래스는 설계도에 불과하기 때문에 정의한 시점에서는 실체가 없다.
		- 클래스를 사용해 찍어내는 실체를 인스턴스(instance)라고 부른다.
		- 클래스를 사용해 새로운 인스턴스를 생성할 때는 new를 사용한다.
		  
	*/
	public static void main(String[] args) {
		// 하나의 클래스로 여러 인스턴스를 찍어낼 수 있다.
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		// 클래스 내부의 변수는 인스턴스가 생성된 뒤에 . 을 찍어 접근할 수 있다.
		
		// 같은 클래스로 찍어낸 각 인스턴스는 각자의 값을 지닐 수 있다.
		book1.title = "컴퓨터활용능력 1급 실기";
		book2.title = "PERFECT 전산세무 2급";
		book3.title = "성낙현으니 JSP 자바 웹 프로그래밍";
		
		System.out.println("book1의 현재 페이지: " + book1.currPage);
		System.out.println("book1의 현재 페이지: " + book2.currPage);
		System.out.println("book1의 현재 페이지: " + book3.currPage);
		
		// 클래스 내부의 메서드도 생성된 인스턴스에 .을 찍고 사용할 수 있다.
		// 해당 메서드는 다른 인스턴스를 변화시킬 수 없고
		// 자기 자신의 인스턴스(this)만 변화시킬 수 있다.
		for (int i = 0; i < 120; ++i) {
			book1.nextPage();			
		}
		
		book3.gotoPage(30);
		
		System.out.println("----------------------------------");		
		System.out.println("book1의 현재 페이지: " + book1.currPage);
		System.out.println("book1의 현재 페이지: " + book2.currPage);
		System.out.println("book1의 현재 페이지: " + book3.currPage);
		System.out.println("--------------------------------");
		Coffee tea1 = new Coffee();
		Coffee coffee1 = new Coffee();
		Coffee coffee2 = new Coffee();
		
		tea1.name = "생강차";
		coffee1.name = "아메리카노";
		coffee2.name = "카푸치노";
		
		tea1.price = 4000;
		tea1.size = 1;
		coffee1.price = 1500;
		coffee1.size = 1;
		coffee2.price = 3500;
		coffee2.size = 0;
		
		
		System.out.println("생강차 가격: " + tea1.price);
		System.out.println("아메리카노 가격: " + coffee1.price);
		System.out.println("카푸치노 가격: " + coffee2.price);
				
		coffee2.addShut();
		System.out.println("--------------------------------");
		System.out.printf("아메리카노 사이즈: %s, 가격: %d\n", coffee1.sizeStr[coffee1.size], coffee1.price);
		
		System.out.println("--------------------------------");
		System.out.printf("카푸치노 사이즈: %s, 가격: %d\n", coffee2.sizeStr[coffee2.size], coffee2.price);
		
		System.out.println("--------------------------------");
		coffee1.sizeUp();
		System.out.printf("아메리카노 사이즈: %s, 가격: %d\n", coffee1.sizeStr[coffee1.size], coffee1.price);
		
		System.out.println("--------------------------------");
		coffee1.sizeUp();
		System.out.printf("아메리카노 사이즈: %s, 가격: %d\n", coffee1.sizeStr[coffee1.size], coffee1.price);
		
		System.out.println("--------------------------------");
		coffee2.sizeUp();
		System.out.printf("카푸치노 사이즈: %s, 가격: %d\n", coffee2.sizeStr[coffee2.size], coffee2.price);
		
		Weapon w1 = new Weapon();
		
		for (int i = 0; i < 500; ++i) {
			w1.upgrade();
		}
		
		w1.attak();
		
	}//main
}

class Book {
	// static 키워드가 붙지 않은 변수들을 인스턴스 변수라고 한다.
	String title;
	String writer;
	int price;
	int currPage;
	int maxPage;
	
	// static 키워드가 붙지 않은 메서드들을 인스턴스 메서드라고 한다.
	void nextPage() {
		// this: 이 메서드를 호출한 인스턴스 자기 자신을 의미
		++this.currPage; // this는 메서드를 호출한 인스턴스 자신을 지칭한다.
	}
	
	void gotoPage(int page) {
		this.currPage = page;
	}
}

class Coffee {
	String name;	
	int price;	
	int size;
	String[] sizeStr = {"Short", "Tall", "Grande", "Venti"};	
	
	void sizeUp() {
		++size;		
		price += 1000;
	}
	
	void addShut() {
		price += 500;
	}
}

// 선생님 풀이
class Weapon {
	String name;
	double attackSpeed;
	int damage;
	int duration;
	int upgrade;
	int[] upgradeChaceTable = 
		{100, 90, 90, 80, 80, 60, 40, 20, 10, 5};
	
	Random ran = new Random();
	
	void attak() {
		System.out.printf("공격! %d의 데미지를 입혔습니다!", damage + (upgrade * 100));
	}
	
	void upgrade() {
		if (upgrade == 10) {
			System.out.println("더이상 강화할 수 없습니다.");
			return;
		}		
		// 업그레이드 확률만큼 true를 채워 놓으면 된다.
		// true를 고르면 강화 성공으로 친다.
		int upgradeChance = upgradeChaceTable[upgrade];
		
		boolean[] upgradeSuccess = new boolean[100];
		for (int i = 0; i < upgradeChance; ++i) {			
			upgradeSuccess[i] = true;			
		}
		if (upgradeSuccess[ran.nextInt(100)]) {
			upgrade++;
			System.out.printf("강화성공! [현재 강화: %d]\n", upgrade);
		} else {
			if (upgrade > 6) {
				--upgrade;
				System.out.printf("강화 실패로 단계가 낮아졌습니다.\n", upgrade);
			}
			System.out.printf("강화실패 [현재 강화: %d]\n", upgrade);
		}
	}
}


