package quiz;

import java.util.Scanner;

public class B10_Prime {
	 /*
	  	사용자가 정수를 입력하면 1부터 입력한 정수 사이에 존재하는 모든 소수를 출력해보세요.
	  	
	  	※ 소수: 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	  	
	  	> 10
	  	2, 3, 5, 7
	  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">> ");
		int numb = sc.nextInt();		
		
		for (int i = 1; i <= numb; ++i) {
			int count = 0; 
			for (int j = 1; j <= i; ++j) {
				if (i%j==0) {
					count++;					
				}				
			}			
			if (count==2) {
				System.out.print(i+" ");
			}				
		}
		
		// 선생님 풀이
		System.out.print("> ");
		int target = sc.nextInt();
		
		for (int num = 2; num <= target; ++num) {
			//System.out.printf("%d: ", num);
			int count = 0;
			for (int i = 2; i <= Math.sqrt(num); ++i) {
				if (num % i == 0) {
					//System.out.print(i + " ");
					++count;
					break;
				}
			} if (count == 0) {
				System.out.printf("%d ", num);
				//System.out.printf("소수\n", count);
			} else { 
				//System.out.printf("(%d개)\n", count);
			}
			
		}
		
	} //main

}
