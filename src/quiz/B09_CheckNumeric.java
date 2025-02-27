package quiz;

import java.util.Scanner;

public class B09_CheckNumeric {
	/*
	 	사용자가 입력한 문자열이 모두 숫자로 되어있으면 
	 	true를 출력하는 프로그램을 만들어 보세요
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>  ");
		String text = sc.next();
		
		boolean numeric = true;
		
		for (int i = 0; i < text.length(); ++i) {
			if (text.charAt(i) < '0' || text.charAt(i) > '9') {
				numeric = false;
			}
			numeric &= numeric; //  이거 필요 없었어 ㅠㅠ
		}
		System.out.println(numeric);		
		
		// 선생님 풀이
		
		int len = text.length();
		boolean isNumeric = true;
		//한 글자씩 꺼내면서
		
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			// 꺼낸 한 글자가 숫자가 아니면 더이상 검사할 필요도 없다.
			if (ch < '0' || ch > '9') {
				isNumeric = false;
				break;
			}
			
		}
		System.out.println("결과: " + isNumeric);
	}

}
