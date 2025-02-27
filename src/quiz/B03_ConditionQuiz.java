package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz {
	
	/*
	 	# 알맞은 비교 연산을 만들어보세요
	 	
	 	1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	 	2. int형 변수 b가 짝수일 때 true
	 	3. int형 변수 c가 7의 배수일 때 true
	 	4. int형 변수 d와 e의 차이가 30일 때 true
	 	5. int형 변수 year가 (400으로 나누어 떨어지거나) true
	 	   또는 (4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때) true
	 	6. boolean형 변수 powerOn이 false일 때 true
	 	7. 문자열 참조변수 str이 "yes"일 때  true
	 */
	
	public static void main(String[] args) {
		int a=2, b=4, c=14, d=30, e=60, year=2024;
		boolean powerOn = true;
		String str = "yes";
		
		System.out.println(a > 10 && a < 20); // 변수가 왼쪽에 있어야 좋다.
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(Math.abs(d - e) == 30);
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)); //윤년 계산 공식
		System.out.println(!powerOn);
		
		System.out.println("--------------------------");
		// 문자열 끼리 비교할 때는 == 대신 .equals() 메서드를 사용해야 한다
		// 비교가 잘 되는 경우도 있지만, 안되는 경우도 있다.
		
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("yes or no? ");
		String input = sc.nextLine();
		System.out.println(input == "yes");
		System.out.println(input.equals("yes"));
	}

}
