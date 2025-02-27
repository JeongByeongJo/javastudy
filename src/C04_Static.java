import myobj.Sheep;
import myobj.TrumphCard;

public class C04_Static {
	/*
		# static (정적 영역, 클래스 영역 <-> 인스턴스 영역) (공유하는 숫자, 데이터들을 static으로 만든다.)
		
		- 인스턴스 영역의 반대 개념
		- 같은 클래스로 만들어진 모든 인스턴스들이 함께 공유하는 영역
		- 앞에 static이 붙은 자원들은 모든 인스턴스들이 함께 사용하는 공동 자원이 된다.
	*/
	public static void main(String[] args) {
		Sheep s = new Sheep();
		myobj.Apple a = new myobj.Apple();
		
		s.harvest();
		
		//myobj.Apple은 myobj.Food를 상속받았기 때문에
		//Food를 요구하는 자리에 전달이 가능하다(업캐스팅)
		s.setColor(a);
		s.setColor(new myobj.Apple());
		s.setColor(new myobj.Banana());
		s.setColor(new myobj.Watermelon());
		
		
		System.out.println(s.getRemainHarvestTime() / 1000 / 60 + "분 남았습니다.");
		
		long t = System.currentTimeMillis() / 1000 / 60 / 60 / 60;
		
		System.out.println(t);
		
		TrumphCard t1 = new TrumphCard('◇', 0);
		TrumphCard t2 = new TrumphCard('♥', 3);
		TrumphCard t3 = new TrumphCard('♣', 10);
		
		// static 자원들은 어떤 인스턴스로 접근하더라도 같은 값을 보게되기 때문에
		// 클래스 이름에 .을 직고 상요하는 것을 권한다.
		TrumphCard.width = 90;
		
		t1.print();
		t2.print();
		t3.print();
		
		TrumphCard.printCardSize();
		t2.printCardSize();
		t3.printCardSize();	
		
	}

}
