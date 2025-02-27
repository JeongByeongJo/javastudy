package quiz;

import java.util.Random;
import java.util.Scanner;

public class B13_ShuffleText {
	/*
	 	사용자로부터 단어를 입력받으면
	 	해당 단어를 무작위로 뒤섞은 다섯개의 결과를
	 	char[] 타입으로 생성해보세요.
	*/
	public static void main(String[] args) {			
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("단어를 입력해주세요 >>  ");
		String word = sc.next();
		int leng = word.length();
		
		for (int i = 0; i < 5; ++i) {
			char[] wordArr = new char[leng];
			
			for (int j = 0; j < leng; ++j) {
				char ch = word.charAt(j);
				wordArr[j] = ch;			
			}
			
			char[] ranWordArr = new char[leng];
			for (int j = 0; j < leng; ++j) {
				int ranIndex = ran.nextInt(leng);
				ranWordArr[j] = wordArr[ranIndex];
				wordArr[ranIndex] = 1;
				for (int k = 0; k < leng; ++k) {
					if (ranWordArr[k] == 1) {
						--j;
						break;
					}
				}
			}
			System.out.println(ranWordArr);
		}
		
		
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		System.out.print("뒤섞을 단어를 입력해주세요>> ");
		String keyword = sc.next();
		
		int len = keyword.length();
		
		
//		for (int i = 0; i < len; ++i) {
//			System.out.printf("shuffled[%d]: %c(%d)\n", i, shuffled[i], (int)shuffled[i]);
//		}
		for (int j = 0; j < 5; ++j) {
		
			char[] shuffled = new char[len];
			
			int i = 0;
			while (i < len) {
				char ch = keyword.charAt(i);
				int ranIndex = ran.nextInt(len);
				
				if (shuffled[ranIndex] == 0) {
					shuffled[ranIndex] = ch;
				} else {
					continue;
				}
				
				++i;
			}
			System.out.println(shuffled);
		}
//		for (int j = 0; j < 5; ++j) {
//			// 문자열은 수정이 불가능하기 때문에 뒤섞는 방식을 사용할 수 없기 때문에
//			// 문자열을 그대로 char[]로 전환
//			char[] keywordArr = new char[len];
//			
//			for (int i = 0; i < len; ++i) {
//				keywordArr[i] = keyword.charAt(i);
//			}		
//			
//			int shuffleSize = len * ran.nextInt(2,4);
//			
//			for (int i = 0; i < shuffleSize; ++i) {
//				int ranIndex = ran.nextInt(1, len);
//												
//				char temp = keywordArr[0];
//				keywordArr[0] = keywordArr[ranIndex];
//				keywordArr[ranIndex] = temp;
//			}
//		
//		System.out.println(keywordArr);
//		}
		
		System.out.println();
		System.out.println("------------------------");
		
		char[] keywordArr = new char[len];
		char[] ranKeywordArr = new char[len];
		for (int i0 = 0; i0 < len; ++i0) {
			//keywordArr[i] = keyword.charAt(i);
			ranKeywordArr[i0] = keyword.charAt(i0);
		}
		for (int i0 = 0; i0 < len; ++i0) {
			if (ranKeywordArr[i0] != 0) {		
				int ranIndex = ran.nextInt(len);
				keywordArr[i0] = ranKeywordArr[ranIndex];
				ranKeywordArr[ranIndex] = 0;
					
				}
			}
		
		System.out.println(keywordArr);
		System.out.println(ranKeywordArr);
	}

}
