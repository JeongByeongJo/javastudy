
public class A04_VariableNaming {
	/*
	 * # 우리는 변수를 왜 사용하는가?
	 * 
	 * - 코드의 가독성을 높이기 위해 - 값을 여러번 사용하기 위해 (재사용)
	 * 
	 * # 변수의 이름 규칙 (권장)(*개발자들간에 불문율)
	 * 
	 * 1. 두 단어 이상을 이어붙여 변수명을 지을 때 _를 사용한다. (C언어 스타일, snake_case) ex) apple_qty,
	 * apple_price, minsu_age
	 * 
	 * 2. 두 단어 이상을 이어붙여 변수명을 지을 때 대문자를 활용한다. (Java 스타일, camelCase) ex) appleQty,
	 * applePrice, minsuAge
	 * 
	 * 3. 변수명의 첫 글자는 알파벳 소문자를 사용해야 한다. (첫 글자가 대문자인 경우, 암묵적으로 클래스로 간주한다.) ex)
	 * apple(변수로 간주), Apple(클래스로 간주)
	 * 
	 * 4. 프로그램이 끝날때까지 값이 절대로 변하지 않는 변수(=상수)는 모두 대문자로 사용한다. ex) PI,
	 * MAX_INTEGER_VALUE, MAX_LONG_VALUE
	 * 
	 * 5. 패키지 이름은 모두 소문자를 사용한다. ex) Quiz(클래스로 간주)
	 * 
	 * 6. 해당 변수에 들어있는 값이 무엇인지 쉽게 파악할 수 있는 이름을 사용해야 한다. ex) a1, a2, a3 ... 와 같이 하면
	 * 안된다.
	 * 
	 * 
	 * # 변수의 이름 규칙 (필수): 안지키면 컴파일 불가능
	 * 
	 * 1. 변수명의 첫 번째 글자에는 숫자를 사용할 수 없다. ex) 1st, 2nd, 7eleven (x)
	 * 
	 * 2. 변수명에는 공백을 사용할 수 없다.
	 * 
	 * 3. 특수문자는 _와 $만 사용할 수 있다. ex) _rabbit, $uper (o)
	 * 
	 * 4. 이미 자바에서 사용하고 있는 키워드(예약서)들은 변수명으로 사용할 수 없다. (Eclipse에서 보라색으로 표시되는 키워드들) ex)
	 * class, public, static, int, double, ... (x)
	 * 
	 */
	public static void main(String[] args) {
		int apple_qty = 20;
		int apple_price = 768;
		double apple_weight = 99.37;

		System.out.println("사과의 갯수: " + apple_qty + "개");
		System.out.println("사과의 한 개의 가격: " + apple_price + "원");
		System.out.println("사과 한 개의 무게: " + apple_weight + "g");
		System.out.println("사과의 총가격: " + apple_qty * apple_price + "원");
		System.out.println("사과의 총 무게: " + apple_qty * apple_weight + "g");

	}

}
