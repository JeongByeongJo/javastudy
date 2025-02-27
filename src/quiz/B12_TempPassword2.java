package quiz;

import java.util.Random;

public class B12_TempPassword2 {
	/*
	 	대문자, 소문자, 숫자, 특수문자로 구성된
	 	8 ~ 12자리의 랜덤 임시 비밀번호를 10개 생성하여 출력하는 프로그램을 만들어보세요.
	 	※ 특수문자는 아스키코드 33 ~ 47번 까지만 사용한다.	 	
	*/
	public static void main(String[] args) {
		
		Random ran = new Random();		
		
		for (int j = 0; j < 10; ++j) {
			String tempkey = "";
			int keyLen = ran.nextInt(8, 13);
			for (int i = 0; i < keyLen; ++i) {
				char temp = 0;
				temp = (char) ran.nextInt('!', 'z');
				while (temp >= ':' && temp <= '@' || temp >= '[' && temp <= '`') {
					temp = (char) ran.nextInt('!', 'z');
				} 				
				tempkey += temp;			
			}
			System.out.printf("%d번째 키: %s (%d자리)\n", j, tempkey, keyLen);
		}
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		// 선생님 풀이
		
		// **범위를 내가 정하는 방법이 있다.**
		String passwordCharset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "abcdefghijklmnopqrstuvwxyz0123456789!\"#$%&'()*+,-./";
		
		for (int i = 0; i < 10; ++i) {
			int keySize = ran.nextInt(8, 13);
			
			String tempPassword = "";
			
			for (int j = 0; j < keySize; ++j) {
				tempPassword +=
						passwordCharset.charAt(ran.nextInt(passwordCharset.length()));
			}
			
			System.out.printf("%d번째 임시비밀번호: %s (%d자리)\n", i, tempPassword, keySize);
		}
		
//		for (int i = 0; i < 10; ++i) {
//			int keySize = ran.nextInt(8, 13);
//			String tempPassword = "";
//			for (int j = 0; j < keySize; ++j) {
//				int category = ran.nextInt(4);
//				
//				switch (category) {
//					case 0:
//						tempPassword += (char) (ran.nextInt('A', 'Z'+ 1 ));
//						break;
//					case 1:
//						tempPassword += (char) (ran.nextInt('a', 'z'+ 1 ));
//						break;
//					case 2:
//						tempPassword += (char) (ran.nextInt('0', '9'+ 1 ));
//						break;
//					case 3:
//						tempPassword += (char) (ran.nextInt(33, 48));
//						break;
//				}
//			}
//			System.out.printf("%s (%d자리)\n", tempPassword, keySize);
//		}
		
	}//main

}
