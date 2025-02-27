package quiz;

import java.util.Scanner;

public class B08_CountAlphabet {
	/*
	 	사용자가 문장을 입력하면 대문자의 개수와 소문자의 개수를 세어서 출력해주는 프로그램을 만들어보세요.	 	
	 */

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.print(" > ");
		String msg = sc.nextLine();
		
		int cCount = 0;
		int sCount = 0;
		for (int index = 0; index < msg.length(); ++index) {
			char ch = msg.charAt(index);
			
			if (ch >= 'A' && ch <= 'Z') {
				cCount++;
			} else	if (ch >= 'a' && ch <= 'z') {
				sCount++;
			}
		}
		System.out.printf("대문자의 갯수는 %d개, 소문자의 갯수는 %d개 입니다.\n", cCount, sCount);
		
		// 선생님 풀이
		System.out.print(">>  ");
		String text = sc.nextLine();
		
		int lower_count = 0;
		int upper_count = 0;
		
		for (int i = 0; i < msg.length(); ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				lower_count++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper_count++;
			}
		}
		System.out.println("소문자 개수: " + lower_count);
		System.out.println("대문자 개수: " + upper_count);
		
	}
}
