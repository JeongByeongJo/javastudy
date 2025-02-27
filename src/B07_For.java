
public class B07_For {
	/*
	 	# 반복문 (Loop)
	 	
	 	- for, while, do-while(x), forEach
	 	- 똑같은 코드를 여러번 반복하고 싶을 때 사용한다.
	 	
	 	# for문
	 	
	 	  for (초기값; 반복조건; 증감값) {
	 	  	반복 조건이 참인 동안 반복될 코드
	 	  }
	 	  
	 	  - 초기값: for문이 처음 시작했을 때 딱 한번 실행되는 곳
	 	  		  주로 반복자(iterator)를 초기화하는데에 사용한다.
	 	  - 반복조건: 해당 조건이 true인 동안 {}안의 내용을 반복 실행한다.
 	  		    해당 조건이 false인 경우 {}안의 내용을 무시하고 반복문이 종료된다.
	 	  - 증감값: {}내부의 코드를 모두 실행하고 나면 실행되는 곳.
	 	  	주로 반복자의 값을 변화시키는 용도로 사용한다.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			System.out.println("/)/)");
			System.out.println("( ..)");
			System.out.println("( >♡)");
			System.out.println("I am rabbit " + i);
		}
		
		/*
		 	1. 가장 기본적인 형태의 for문
		 	
		 	- 초기값에는 0을 주고 조건에는 반복하고 싶은 횟수를 적는 방식
		 	- 원하는 횟수만큼 반복하고 싶을 때 가장 많이 사용하는 형태
		 */
		for (int i = 0; i < 10; ++i) {
			System.out.printf("Hello~! %02d\n", i);
		}
		// 87부터 거꾸로 하나씩 10개 출력하고 싶을때(초기값을 바꾸지 않는게 좋다)
		for (int i = 0; i < 10; ++i) {		
			System.out.printf("Hello~! %02d\n", 87 - i);
		}
		 /*
		  	2. 값을 자유롭게 설정한 for문
		  	
		  	- for문의 모든 값을 자유롭게 변경하여 용도에 맞게 사용하는 경우
		  */
		for (int i = 87; i >= 85; --i) {
			System.out.println("Good day " + i);
		}
		
		for (int i = 1; i < 10; i *= 2) {
			System.out.println("2의 제곱: " + i);
		}
		System.out.println("----------------");
		
		// <연습1> 콘솔에 -128 ~ +127까지 출력해보기
		for (int i = -128; i < 128; ++i) {
			System.out.printf("%+d\n", i);
		}
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; ++b) {
			System.out.println(b);
		}
						
		// <연습2> 콘솔에 모든 한글을 출력해보기
		for (char c = '가'; c <= '힣'; ++c) {
			System.out.println(c);
		}
		for (char c = 'ㄱ'; c <= 'ㅣ'; ++c) {
			System.out.println("자음모름: " + c);
		}
		
		/*
		 	3. 각 자리의 값을 생략한 for 문
		 	
		 	- for문의 각 자리의 값(초기값, 조건, 증감값)은 적지 않아도 된다.
		 	- 조건을 생략하면 무한반복이 된다.
		 */
		long num = 0;
		
		for (; num != 10;) {
			System.out.println("무한반복!! " + ++num);
		}
	}

}
