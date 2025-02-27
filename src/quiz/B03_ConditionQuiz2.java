package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz2 {
	
	/*
	 	# 알맞은 조건식을 만들어보세요
	 	
	 	1. char형 변수 a가 'q' 또는 'Q'일 때 true
	 	2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	3. char형 변수 c가 '0' ~ '9'일 때 true
	 	4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	5. char형 변수 e가 한글일 때 true
	 	6. 사용자가 입력한 문자열이 quit일 때 true 
	 */
	public static void main(String[] args) {
		char a='q', b=' ', c='4', d='j', e='뻐'; // ㄱ: 12593, ㅣ: 12643, 가: 44032, 힣: 55203
						
//		System.out.println(a == 'q' || a == 'Q');
//		System.out.println(b != ' ' && b != '\t');
//		System.out.println(c >= 48 && c <= 57);
//		System.out.println(d >= 65 && d <= 122);
//		System.out.println(e >= 12593 && e <= 12643 || e >= 44032 && e <= 55203);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력해주세요 > ");
//		String str1 = sc.next();
//		System.out.println(str1.equals("quit"));
		
		System.out.println(a == 'q' || a == 'Q');
		System.out.println(b != ' ' && b != '\t');
		System.out.println(c >= '0' && c <= '9');
		System.out.println((d >= 'A' && d <= 'Z') || (d >= 'a' && d <= 'z'));
		System.out.println(e >= 'ㄱ' && e <= 'ㅣ' || e >= '가' && e <= '힣');
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요 > ");
		String str1 = sc.next();
		System.out.println(str1.equals("quit"));
		
	}

}
