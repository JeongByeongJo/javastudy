package quiz;

public class B07_ForQuiz2 {
	/*
	 	# for문을 사용해 숫자를 다음과 같이 출력해보세요
	 	
	 	1. 0 3 6 9 12 ... 93 96 99 ( if(i%3 == 0)	for(;;i+=3) )
	 	2. -35 -28- 21 ... 0 7 14 ... 35
	 	3. 100 200 300 ... 800 900 1000
	 	4. 100 99 98 ... 5 4 3 2 1 0
	 	5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (총 30번)
	 	6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 * ... (총 30번)
	 	7. 7 77 777 7777 77777 .... 7777777777
	 */
	public static void main(String[] args) {
		// 3 33 333 3333
		long z = 0;
		double x = 321.123456789;
		
		z = (long) x;
		
		System.out.println(z);
		
		long num9 = 0;
		for (int i = 0; i < 4; ++i) {
			double num8 = Math.pow(10, i);
			num9 += num8;
			System.out.println(num9*7);
		}
		
		
		
		//1.
		for (int i = 0; i <= 33; ++i) {
			System.out.printf("%2d ", i*3);
		}
		System.out.println();
		//2.
		for (int i = -5; i <= 5; i++) {
			System.out.printf("%2d ",i*7);
		}
		System.out.println();
		//3.
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%2d ",i*100);
		}
		System.out.println();
		//4.
		for (int i = 0; i <= 100; ++i) {
			int a = 100-i;
			System.out.printf("%d ", a);
		}
		System.out.println();
		//5. 
		for (int i= 0; i < 30; i++) {
			System.out.println(i % 10 + " ");
		}
		System.out.println();
		
		
		for (int i= 0; i < 30; i++) {
			for (int num = 0; num < 10; num++) {
				System.out.printf("%2d ",num);				
			}
		}
		System.out.println();
		//6.
		for (int i = 0; i < 3; i++) {
			for (int num = 10; num > 0; num--) {
				System.out.printf("%2d ",num);
			}
		}
		System.out.println();		
		//7.		
		long a = 0;
		for (long i = 0; i <= 10; i++) {
			double num = Math.pow(10, i);			
			a += num;
			System.out.printf("%d ", a*7);
		}					
		System.out.println();
		
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		}
		System.out.println();
		
		String numStr = "7";
		for(int i = 0; i < 10; ++i) {
			System.out.print(numStr + " ");
			numStr += "7";
		}
	}

}
