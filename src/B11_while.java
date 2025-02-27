
public class B11_while {
	/*
	  # while
	  
	  - for문과 사용법이 약간 다른 반복문
	  - 초기값과 증감값의 위치가 정해져있지 않아 for문보다 자유롭다.
	  - ()안의 내용이 true일 때 {}안의 내용을 반복한다.
	  - 증감값의 위치에 따라 결과가 달라질 수 있으므로 주의해야 한다.	 
	*/
	public static void main(String[] args) {
		
		int num = 0;
		while (num++ < 100) { //num++ 처럼 ++을 뒤에 넣어 주로 사용한다. (++num이면 99번 반복)
			System.out.println("Hello~!" + num);
		}
		
		// 0~9까지 10회 반복
		int i = 0;		
		while (i < 10) {
			System.out.println(i++);
		}		
		
		// 1~10까지 10회 반복
		System.out.println("------------------");
		i = 0;		
		while (i < 10) {
			System.out.println(++i);
		}
		
		// 1~10까지 10회 반복
		System.out.println("------------------");
		i = 0;		
		while (i++ < 10) {
			System.out.println(i);
		}
		// 1~9까지 9회 반복(10이라고 써놨는데 9회 반복이라 잘 쓰지 않음)
		System.out.println("------------------");
		i = 0;		
		while (++i < 10) {
			System.out.println(i);
		}
		
		// 1~10까지 홀수만 출력
		System.out.println("------------------");
		i = 0;		
		while (i++ < 10) {
			System.out.println(i++);
		}
		// 1~10까지 짝수만 출력
		System.out.println("------------------");
		i = 0;		
		while (i++ < 10) {
			System.out.println(++i);
		}
		
	}// main

}
