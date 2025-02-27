package quiz;

import java.util.Scanner;

public class B08_ChangeCase {
	/*
	 	사용자가 영어로 된 문장을 입력하면 대소문자를 반대로 바꿔서 출력해보세요.
	 	
	 	입력 >> abcdEFG
	 	출력 >> ABCDefg
	 */
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println(">>  ");
//		String text = sc.nextLine();
//				
//		String str = "";		
//		
//		for (int i = 0; i<text.length(); ++i) {
//			char ch = text.charAt(i);
//			
//			if (ch >= 'a' && ch <= 'z') {
//				ch = ((char)(ch - 32));
//			} else if (ch >= 'A' && ch <= 'Z') {
//				ch = ((char)(ch + 32));
//			}
//			str += ch;
//		}
//		System.out.print(str);		
		
		
		// 선생님 풀이
		
		String text1 = "abcdEFG";
		int diff = 'a' - 'A';
		
		for (int i = 0; i < text1.length(); ++i) {
			char ch = text1.charAt(i);
			
			// 대문자는 소문자로 바꿔서 출력, 소문자는 대문자로 바꿔서 출력,
			// 둘 다 아니라면 그냥 출력
			if (ch >= 'A' && ch <= 'Z') {
				ch = ((char)(ch + diff));
				System.out.print(ch);
			} else if (ch >= 'a' && ch <= 'z') {
				ch = ((char)(ch -diff));
				System.out.print(ch);
			} else {
				System.out.print(ch);
			}
		}
		
//		System.out.println();
//		char ca = 'A';
//		char sa = 'a';
//		System.out.println((int) ca);
//		System.out.println((int) sa);
//		System.out.println((char)(ca + 32));
	}

}
