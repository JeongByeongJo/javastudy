package quiz;

import java.util.Scanner;

public class B09_CheckNumeric2 {
	/*
 		사용자가 입력한 문자열이 모두 숫자로 되어있으면 
 		true를 출력하는 프로그램을 만들어 보세요 (16진수 까지 숫자로 판정)
 		
 		10진수 : 0 ~ 9 까지만 숫자
 		16진수 : 0 ~ 9, A ~ F 까지 숫자
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(">> ");
		String text = sc.next();
		
		int len = text.length();
		boolean isNumeric = true;
		
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if (ch < '0' || ch > '9') {
				isNumeric = false;
				if (ch >= 'A' && ch <= 'F') {
					isNumeric = true; 
				} else if (ch >= 'a' && ch <= 'f') {
					isNumeric = true;
				}
			}
		}
		System.out.println(isNumeric);		
		
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if (ch < '0' || ch > '9') {
				isNumeric = false;
			}
			if (ch >= 'A' && ch <= 'F') {
				isNumeric = true; 
			} else if (ch >= 'a' && ch <= 'f') {
				isNumeric = true;
			}
		}
		System.out.println(isNumeric);
		
		
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			if (ch < '0' || ch > '9') {
				if (ch < 'A' || ch > 'F' && ch < 'a' || ch > 'f') {
					isNumeric = false;
					break;
				}
			}
		}
		System.out.println(isNumeric);
		
		// 선생님 풀이
		
		boolean isnuMeric = true;
		for (int i = 0; i < text.length(); ++i) {
			char ch = text.charAt(i);
			
			// 숫자가 아닌 조건
			// (1) 0~9를 벗어난 문자, (2) a~f를 벗어난 숫자, (3) A~F를 벗어난 문자
			if(!(ch>= '0' && ch <= '9') && !(ch >= 'a' && ch <= 'f') && !(ch >= 'A' && ch <= 'F')) {
				isnuMeric = false;
				break;
			}
		}
	}

}
