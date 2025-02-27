package quiz;

import java.util.Scanner;

public class Exercise00 {
	
	/*
	사용자가 숫자를 입력하면
	해당 숫자까지 369게임을 진행했을때 박수를 총 몇 번 쳐야하는지 출력해보세요.
*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");
		int num = sc.nextInt();				
		
		
		int count = 0;
		for (int i = 1; i <= num; ++i) {
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				++count;
			}
			if(i/10 == 3 || i/10 == 6 || i/10 == 9) {
				++count;
			}
		}
		System.out.println(count);
	}
}
