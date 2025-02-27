package quiz;

import java.util.Scanner;

public class B11_Count369 {
	/*
		사용자가 숫자를 입력하면
		해당 숫자까지 369게임을 진행했을때 박수를 총 몇 번 쳐야하는지 출력해보세요.
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int i369 = sc.nextInt();
		
		String str = "" + i369;
		int count = 0;
		
		int i0 = 0;
		while (i0 <= i369) {
			str = ""+i0;			
			int j = 0;
			while (j < str.length()) {				
				char ch = str.charAt(j);				
				if (ch == '3' || ch == '6' || ch == '9') {
					count++;				
				}
				++j;
			}
			++i0;
		}
		System.out.println(count);
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		
		int num = sc.nextInt();
		count = 0;
		for (int i = 1; i <= num; ++i) {
			System.out.printf("%d: ", i);
			int chkNum = i;
			while(chkNum > 0) {
				int n = chkNum % 10;
				if (n == 3 || n == 6 || n == 9) {
					System.out.print('짝');
					++count;
				}
				chkNum /= 10;				
			}			
		}
			// i는 박수를 몇 번 쳐야하는 숫자인가?
			// 3133
//			String numStr = "" + i;
//			
//			for(int index = 0; index < numStr.length(); ++index) {
//				char ch = numStr.charAt(index);
//				
//				if (ch == '3' || ch == '6' || ch == '9') {
//					System.out.print('짝');
//					++count;
//				}
//			}			
//			System.out.println();
//		}
		System.out.printf("총 박수 횟수: %d\n", count);		
	}//main

}
