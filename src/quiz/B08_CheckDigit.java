package quiz;

import java.util.Scanner;

public class B08_CheckDigit {
	/*
	 	사용자가 숫자를 입력하면 해당 숫자가 몇 자리 숫자인지
	 	알아내는 프로그램을 만들어보세요
	 	
	 	(1) 문자열을 활용하여 구현하기
	 	
	 	(2) 문자열을 활용하지 않고 구현하기
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.print("숫자를 입력해주세요 >  ");
		long num0 = sc.nextLong();
		long num1 = Math.abs(num0);
		
		//(1)
		String text = num1+"";
		if (text.length() == 1 && text.charAt(0) == '0') {
			System.out.println("0입니다.");
		} else {
			System.out.println("입력한 숫자의 자릿수: " + text.length());		
		}
		
		
		//(2)
		double num = (double) num1;
		long count = 0;
		
		for (long i = 0; i < num; ++i) {
			if ((double)num/Math.pow(10, i) >= 1) {
				++count;
			}
		}
		System.out.println("입력하신 숫자의 자릿수: " + count);
		
		
		// 선생님 풀이		
		System.out.print(">> ");
		int mun = sc.nextInt();
		
		String munStr = "" + mun;
		
		if (munStr.length() == 1 && munStr.charAt(0) == '0') {
			System.out.println("0입니다.");
		} else if(munStr.charAt(0) == '-') {		
			System.out.println(munStr.length()-1);
		} else {
			System.out.println(munStr.length());
		}
		//(2)
		int digit = 0;
		for (int i = Math.abs(mun); i > 0; i /= 10) {
			System.out.printf("curr mun: %d, curr digit: %d\n", i, ++digit);
		}
		System.out.println(mun + "은 " + digit + "자리 숫자입니다.");
	}

}
