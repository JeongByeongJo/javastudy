
public class A02_Variable {
	/*
	 * # 변수 (variable)
	 * 
	 * - 프로그래밍 언어에서 데이터를 저장해 놓을 수 있는 공간 - 변수 선언을 통해 메모리에 공간을 확보한 수 데이터를 해당 메모리에 저장해
	 * 둘 수 있다.
	 * 
	 * # 메모리 (RAM, 주기억장치)
	 * 
	 * - 전기가 통하는 동안만 데이터가 유지되는 성질을 가지고 있는 저장 매체 - 현재 진행상황을 보관해놓는 용도로 사용하는 기억장치 - 용량이
	 * 넉넉치 않음(무거운게임,프로그램=변수를 엄청 많이 가지고있다.) - 속도가 빠르다. - 변수를 선언한다는 것은 메모리의 공간을
	 * 잠시(프로그램이 꺼질때 까지)빌리는 것이다.
	 * 
	 * # 하드드라이브 (HDD, 보조기억장치)
	 * 
	 * - 전기가 통하지 않을때도 데이터를 계속 보관해주는 성질을 가지고 있는 저장 매체 - 영구적으로 보관되지만 속도가 느리다.
	 */
	public static void main(String[] args) {

		/*
		 * # 변수의 선언
		 * 
		 * 타입 변수명;
		 * 
		 * - 앞에는 변수의 타입을 적고 뒤에는 변수의 이름을 적는다 - 해당 변수에 저장할 데이터의 타입에 따라 타입의 이름이 달라진다. ex)
		 * 정수를 보관하고 싶은 변수는 int로 선언 문자열을 보관하고 싶은 변수는 String으로 선언
		 */
		int price; // 정수만 보관할 수 있는 변수 price를 선언
		String name; // 문자열만 보관할 수 있는 변수 name을 선언

		/*
		 * # 대입 연산 (=)
		 * 
		 * - 원래 알고 있던 =의 의미: 왼쪽의 값과 오른쪽의 값이 같다 ex) 5x = 15 - 프로그래밍 언어에서 =의 의미: 왼쪽의 변수에
		 * 오른쪽의 값을 넣어라 - 변수를 선언한 후에는 대입 연산을 통해 원하는 값을 넣어줘야 한다 - 변수를 선언한 후 비어있는 변수에 가장
		 * 처음으로 값을 대입하는 행위를 '초기화'라고 부른다
		 */
		price = 2500;
		name = "철수";

		System.out.println(price);
		System.out.println(price * 3);
		System.out.println(price - 99);
		System.out.println(name);

		// 자바에서는 초기화되지 않은 변수는 사용할 수 없다.
		int hour;
		hour = 16;
		System.out.println("지금은 " + hour + "시 입니다.");

		// 변수를 선언하는 여러 방식들

		// (1) 선언만 하고 대입은 나중에 하는 방식 **
		int score;
		score = 80;
		System.out.println("점수: " + score);

		// (2) 선언과 동시에 초기화 하는 방식(초기화가 안되는 상황을 방지) ***
		int cook_time = 3;
		System.out.println("권장 조리시간: " + cook_time + "분");

		// (3) 한번에 같은 타입으로 여러 변수를 선언하기

		int user_score, com_score, time_limit;

		user_score = 10;
		com_score = 15;
		time_limit = 5;

		// (4) 한번에 여러개의 변수 선언과 동시에 초기화하기
		int ramen = 3, kimbab = 5, jjolmyeon = 3;
		String menu1 = "라면", menu2 = "김밥", menu3 = "쫄면";

		// ※ 같은 {} 내부에서 같은 이름의 변수를 다시 선언할 수 없다.
		// String score;

	}

}
