
public class A01_Escape {
	/*
	 * # Escape 문자
	 * 
	 * - \와 합쳐져서 특수한 기능을 하는 문자 - 소스 코드에서 그냥 사용하기에는 문제가 생길 수 있는 문자들을 표현하기 위한 방식 - \와
	 * 바로 뒤에 나오는 하나의 문자가 합쳐져서 특수한 기능할 한다. - Escape 문자는 따지고 보면 두 문자가 이루여져 있지만 하나의 문자로
	 * 간주한다.
	 * 
	 */

	public static void main(String[] args) {

		// \n : 줄 바꿈의 기능을 가진 이스케이프 문자
		System.out.println("안녕하세요~ 반갑습니다!");
		System.out.println("안녕하세요~ \n반갑습니다!");

		// \t : Tab키의 기능을 가진 이스케이프 문자
		// Tab키는 그냥 사용해도 되지만, 일반 공백과 구분이 힘들어 \t로 적는편이 직관적이다.
		System.out.println("안녕\t하세요~ 반갑습니다!");
		System.out.println("안녕	하세요~ 반갑습니다!");
		System.out.println("안녕 하세요~ 반갑습니다!");

		// \\ : 그냥 역슬래시를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("C:\\Program Files\\Java");

		// 이스케이프 문자는 하나의 문자로 인식된다.
		System.out.println('\\');
		System.out.println('\t');

		// \" : 그냥 "를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("오늘은 \"피자\"를 시켜먹어야겠다.");

		// \' : 그냥 '를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("오늘은 '피자'를 시켜먹어야겠다.");
		System.out.println("'");
		System.out.println('\'');
	}

}
