package quiz;

import java.util.Scanner;

public class B11_WhileNumeric {
	/*
 		사용자가 입력한 문자열이 모두 숫자라면 
 		true를 출력하는 프로그램을 만들어 보세요
    */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>  ");
		String str = sc.nextLine();
		
		boolean numeric = true;
		int i = 0;
		while (i <str.length()) {
			char ch = str.charAt(i);
			if (ch < '0' || ch > '9') {
				numeric = false;
				break;
			}
			i++;
		}
		System.out.println(numeric);
		
		System.out.println();
		// 선생님 풀이
		System.out.println("#### 선생님 풀이 ####");
		
		boolean result = true;
		
		i = 0;
		while (i <str.length()) {
			char ch = str.charAt(i);
			
			if (ch < '0' || ch > '9') {
				result = false;
				break;
			}
			
			++i;
		}
		
		System.out.println("모두 숫자? " + result);
		
	}
}
