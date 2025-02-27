package quiz;

import java.util.Scanner;

public class B08_CountE {
	/*
	 	사용자가 문장을 입력하면 해당 문장에 포함된 알파벳 e의 개수를 출력해주는 프로그램을 만들어 보세요.
	 	(※ 대/소문자 모두 세어야 함)
	 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);				
		System.out.println("문장을 입력해주세요 > ");
		String msg = sc.nextLine();		
		
		int count = 0;
		for (int i = 0; i < msg.length(); ++i) {
			if (msg.charAt(i) == 'E' || msg.charAt(i) == 'e') {
				count++;
			}
		}		
		
		//System.out.println(count);				
		System.out.printf("알파벳 E 또는 e의 갯수는 %d개 입니다.\n", count);
		
		int eECount = 0;
		for (int index = 0; index < msg.length(); ++index) {
			char ch = msg.charAt(index);
			
			switch (ch) {
			case 'e', 'E':
				eECount++;
			break;
			}
		}
		System.out.printf("알파벳 E 또는 e의 갯수는 %d개 입니다.\n", eECount);
		
		// 선생님 풀이
		int eCount = 0;
		for (int index = 0; index < msg.length(); ++index) {
			char ch = msg.charAt(index);
			
			if (ch == 'e' || ch == 'E') {
				eCount++;
			}
		}
		System.out.printf("알파벳 E 또는 e의 갯수는 %d개 입니다.\n", eCount);
		
	}

}
