// 현재 코드에서 다른 패키지의 코드를 불러다 사용하겠다.

import quiz.A00_Rabbit;
import quiz.A01_Bill;

public class B00_Import {
	
	/*
		# import
		
		- 다른 패키지에 속해 있는 다른 클래스를 불러다 사용하기 위한 문법
		- 같은 패키지에 속해 있는 다른 클래스는
		  굳이 import를 하지 않아도 불러다 사용할 수 있다.	
	*/
	public static void main(String[] args) {
		A00_Hello.main(null);
		A01_Escape.main(null);
		
		// Ctrl + Shift + o : 자동 import 단축키
		A00_Rabbit.main(null);
		A01_Bill.main(null);
	}

}
