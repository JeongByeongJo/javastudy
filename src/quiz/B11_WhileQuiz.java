package quiz;

public class B11_WhileQuiz {
	
	/*
 	1. 555~2222 사이의 13의 배수를 모두 출력해보세요.
 	2. 50부터 100사이의 모든 숫자의 총합을 구해서 출력해보세요.
 	3. 1부터 1000사이의 모든 10의 배수를 한줄에 8개씩 출력해보세요.
 	4. 1부터 19까지 모든 숫자의 곱을 구해서 출력해보세요.
 	5. 8999~4999사이에 있는 5번째 287의 배수를 출력해보세요.
	*/
	public static void main(String[] args) {
		
		//1.
		int i = 555;
		
		while(i >= 555 && i <= 2222) {
			if (i % 13 == 0) {
				System.out.println(i);
			}
			++i;
		}
		
		System.out.println("-----------------------------");
		
		//2.
		i = 50;
		int sum = 0;
		while(i >= 50 && i <= 100) {
			sum += i;
			++i;
		}
		System.out.println(sum);
		
		System.out.println("-----------------------------");
		
		//3.
		i = 1;
		int count = 0;
		while (i >= 1 && i <= 1000) {
			if (i % 10 == 0) {
				System.out.printf("%d ", i);				
			}
			if (i % 80 == 0) {
				System.out.println();
			}
			++i;
		}
		
		System.out.println();
		System.out.println("-----------------------------");
		
		//4.
		long l = 1L;
		long numL = 1L;
		while (l >= 1 && l <= 19) {
			numL *= l;
			++l;
		}
		System.out.printf("1~19사이 모든수의 곱은: %d", numL);
		
		System.out.println();
		System.out.println("-----------------------------");
		
		//5. 7749
		i = 8999;
		count = 0;
		
		while(i <= 8999 && i >= 4999) {
			
			if (i % 287 == 0) {
				count++;
				
				if (count == 5) {
					System.out.print(i);
				}
			}
			i--;			
		}

		
	}//main

}
