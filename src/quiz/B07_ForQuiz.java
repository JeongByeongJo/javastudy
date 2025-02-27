package quiz;

public class B07_ForQuiz {
	/*
	 	1. 1000~2000 사이의 13의 배수를 모두 출력해보세요.
	 	2. 50부터 100사이의 모든 숫자의 총합을 구해서 출력해보세요.
	 	3. 1부터 1000사이의 모든 10의 배수를 한줄에 8개씩 출력해보세요.
	 	4. 1부터 19까지 모든 숫자의 곱을 구해서 출력해보세요.
	 	5. 8999~4999사이에 있는 5번째 287의 배수를 출력해보세요.
	 */
	
	public static void main(String[] args) {
		
		// 1.
		for (int i = 1000; i <= 2000; i++) {
			if (i%13 == 0) {
				System.out.println(i);
			}
		}
		
		//2. 
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			sum = sum + i;						
		}					
		System.out.println("50~100의 총합: " + sum);
		
		
		//3.
		int printCount = 0;
		for (int num = 1; num <= 1000; ++num) {
			if (num % 10 == 0) {
				//System.out.printf("%d번째 출력: %d\n", printCount, num);
				System.out.printf("%-4d", num);
				++printCount;
				
			// 10의 배수를 8번 출력할때마다 \n을 출력해 줄바꿈
			if (printCount % 8 == 0) {
				System.out.println();
			}
				
			}
		}
//		for (int i = 10; i <= 1000; i+=10) {
//			if (i%80 != 0) {
//				System.out.print(i);
//			} else if (i%8 == 0) {
//				System.out.println(i);
//			}
//		}
		System.out.println();
		//4.
		long result = 1;
		for (long num = 1; num <= 19; num++) {
			result *= num;
		}
		System.out.println("1~19의 곱: " + result);
		
		//5.
		int count = 0;
		for (int num = 8999; num >= 4999; --num) {
			if (num%287 == 0) {
				++count;
				if (count == 5) {
					System.out.println(num);
				}
			}
		}
		
		
	}

}
