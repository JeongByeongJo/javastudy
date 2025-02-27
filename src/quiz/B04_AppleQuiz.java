package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {
	/*
	 	사과를 10개씩 담을 수 있는 바구니가 있을 때
	 	사용자가 사과 개수를 입력하면 사과를 모두 담기 위해 필요한
	 	바구니의 개수를 알려주는 프로그램을 만들어보세요.
	 	※ 사과 개수를 잘못입력하면 다시 입력하게 해라.	 	
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과 갯수를 입력해주세요 > ");
		int appleQty = sc.nextInt();
		
		if (appleQty < 0) {
			System.out.println("사과 갯수를 잘못 입력하셨습니다.");
		} else { 
			int basketQty = (int) Math.ceil(appleQty / 10.0); // *기억해!*
//			int basketQty = appleQty / 10;
//			
//			// 10개씩 담고났을 때 나머지가 0보다 크다면
//			if (appleQty % 10 > 0) {
//				// 바구니의 갯수를 1 증가시킨다
//				basketQty = appleQty/10 + 1;
//			}				
				System.out.printf("필요한 사과 바구니는 %d개 입니다.\n", basketQty);
		} //if end
		//if end
//		
//		int appleBox;
//		boolean appleQtyProblem = appleQty < 0;
//		
//		if (!appleQtyProblem) {
//			if (appleQty%10 != 0) {
//				appleBox = appleQty/10 + 1;
//				System.out.printf("필요한 사과 바구니는 %d개 입니다.\n", appleBox);
//			} else {
//				appleBox = appleQty/10;
//				System.out.printf("필요한 사과 바구니는 %d개 입니다.\n", appleBox);
//			}
//		} else { 
//			System.out.println("사과 갯수를 잘못 입력하셨습니다.");
//		}
//		
//		System.out.println("--------------------------------");
//		
		System.out.print("사과 개수 >> ");
		appleQty = sc.nextInt();

		int basket = 0;
		
		while (appleQty < 0) {
			System.out.print("사과 개수를 잘못입력하셨습니다.\n다시 입력해주세요 >> ");
			appleQty = sc.nextInt();			
		}
		//basket = (int) Math.ceil(appleQty / 80.0);
		basket = (int) Math.ceilDiv(appleQty, 10);
		System.out.println(basket);
		
		
	}

}
