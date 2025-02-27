package quiz;

import java.util.Random;

public class B12_TempPassword {
	/*
	 	알파벳 대문자만으로 구성된 랜덤 4자리 비밀번호를 20개 생성하여 출력해보세요 
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		//char z = 'Z';
		//System.out.println((int) z);
		System.out.println("1--------------");
		for (int i = 0; i < 20; ++i) {
			char pw0 = (char) ran.nextInt(65, 91);
			char pw1 = (char) ran.nextInt(65, 91);
			char pw2 = (char) ran.nextInt(65, 91);
			char pw3 = (char) ran.nextInt(65, 91);
			System.out.printf("%c%c%c%c\n", pw0, pw1, pw2, pw3);
		}
		
		System.out.println("2--------------");
		for (int i = 0; i < 20; ++i) {
			char pw0 = (char) ran.nextInt(65, 91);
			char pw1 = (char) ran.nextInt(65, 91);
			char pw2 = (char) ran.nextInt(65, 91);
			char pw3 = (char) ran.nextInt(65, 91);
			String pwStr = ""+pw0+pw1+pw2+pw3;
			System.out.println(pwStr);			
		}
		
		System.out.println("3--------------");
		for (int i = 0; i < 20; ++i) {
			String pwStr = "";
			for (int j = 0; j < 4; ++j) {
				char pwj = (char) ran.nextInt('A', 'Z' + 1);
				pwStr += pwj;
			}
			System.out.println(pwStr);			
		}
		
		System.out.println("4--------------");
		for (int i = 0; i < 20; ++i) {
			String pwStr = "";
			for (int j = 0; j < 4; ++j) {
				char pwj = (char) ((int)(Math.random() * 26 + 65));
				pwStr += pwj;
			}
			System.out.println(pwStr);			
		}
		
		System.out.println("\n5--------------\n");
		int i0 = 0;
		while (i0 < 20) {
			String pwStr = "";
			int j = 0;
			while (j < 4) {
				char pwj = (char) ((int)(Math.random() * 26 + 65));
				pwStr += pwj;
				 ++j;
			}
			++i0;
			System.out.println(pwStr);			
		}
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		// 선생님 풀이
		int keyLen = 4;
		for (int j = 0; j < 20; ++j) {
			String tempkey = "";
			for (int i = 0; i < keyLen; ++i) {
				tempkey += (char) ran.nextInt('A', 'Z' + 1);			
			}
			System.out.printf("%d번째 키: %s\n", j, tempkey);
		}
	
	}//main

}
