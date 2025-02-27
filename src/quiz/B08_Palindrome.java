package quiz;

import java.util.Scanner;

public class B08_Palindrome {
	/*
	 	 사용자가 단어를 입력하면
	 	 해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어보세요.
	 	 
	 	 >> LEVEL -> 좌우대칭입니다.
	 	 >> ABBA -> 좌우대칭입니다.
	 	 >> Apple -> 좌우대칭이 아닙니다.	 	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">> ");
		String text1 = sc.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < text1.length(); ++i) {
			char chS = text1.charAt(i);
			char chE = text1.charAt(text1.length()-1-i);			
			if (chS != chE) {
				count++;
			}			  
		}
		if (count > 0) {
			System.out.println("좌우 대칭이 아닙니다.");
		} else {
			System.out.println("좌우 대칭입니다.");
		}
				
	
		boolean palindrome1 = true;
		boolean palindrome2 = true;
		for (int i = 0; i < text1.length(); ++i) {
			char chS = text1.charAt(i);
			char chE = text1.charAt(text1.length()-1-i);			
			if (chS == chE) {
				palindrome2 = true;
			} else {
				palindrome2 = false;
			}				
			palindrome1 &= palindrome2; 
			
		}
		if (palindrome1) {
			System.out.println("좌우대칭입니다.");			
		} else {
			System.out.println("좌우대칭이 아닙니다.");			
		}
		
		System.out.println("=============================");
		// 선생님 풀이
		
		String word = "SaaS";
		
//		System.out.println(word.charAt(0) == word.charAt(4));
//		System.out.println(word.charAt(1) == word.charAt(3));
//		System.out.println(word.charAt(2) == word.charAt(2));
		int half = word.length() / 2;
		
		boolean palindrome = true;
		
		for (int i = 0; i < half; ++i) {
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(word.length() - 1 - i);
			
			palindrome &= ch1 == ch2;			
		}
		if (palindrome) {
			System.out.println("좌우대칭입니다..");
		} else {
			System.out.println("좌우대칭이 아닙니다..");
		}
		
		// 해당 단어를 거꾸로 뒤집고 같은 문자열인지 비교한다.
		String word2 = "";
		
		for (int i = 0; i < word.length(); ++i) {
			word2 += word.charAt(word.length()-1-i);			
		}
		System.out.println("제시된 단어: " + word);
		System.out.println("제시된 단어: " + word2);
		if (word.equals(word2)) {
			System.out.println("대칭");
		} else {
			System.out.println("비대칭");
		}
	}

}
