package quiz;

import java.util.Scanner;

public class B01_TotalPrice {

	/*
	 	콜라 - 2000
	 	환타 - 1900
	 	제로콜라 - 2200
	 	솔의눈 - 2500
	 	
	 	위의 4가지 음료수의 개수를 입력하면 총 가격이 출력되는 프로그램을 만들어보세요
	 	
	 	입력> 0 1 0 1
	 	출력> 4400	 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		int cokeP = 2000;
		int fantaP = 1900;
		int zeroCkP = 2200;
		int pineP = 2500;
		
//		System.out.print("콜라 갯수를 입력해 주세요 > ");
//		int coke = sc.nextInt();
//		System.out.print("환타 갯수를 입력해 주세요 > ");
//		int fanta = sc.nextInt();
//		System.out.print("제로콜라 갯수를 입력해 주세요 > ");
//		int zeroCk = sc.nextInt();
//		System.out.print("솔의눈 갯수를 입력해 주세요 > ");
//		int pine = sc.nextInt();
//		
//		int total = cokeP*coke + fantaP*fanta + zeroCkP*zeroCk + pineP*pine;
//		
//		System.out.printf("총 %d원", total);
		
		
//		System.out.print("음료수의 갯수를 입력해주세요 >");
//		int coke = sc.nextInt();		
//		int fanta = sc.nextInt();
//		int zeroCk = sc.nextInt();
//		int pine = sc.nextInt();
//		
//		int total = cokeP*coke + fantaP*fanta + zeroCkP*zeroCk + pineP*pine;
//		
//		System.out.printf("총 %d원", total);
		
		int cokePrice = 2000;
		int fantaPrice = 1900;
		int zerocokePrice = 2200;
		int pinetreePrice = 2500;
		
		System.out.println("콜라 - 2000");
		System.out.println("환타 - 1900");
		System.out.println("제로콜라 - 2200");
		System.out.println("솔의눈 - 2500");
		System.out.print("음료 갯수 입력> ");
		
		int cokeQty = sc.nextInt();
		int fantaQty = sc.nextInt();
		int zerocokeQty = sc.nextInt();
		int pinetreeQty = sc.nextInt();
		
		int totalPrice = cokeQty * cokePrice
				+ fantaQty * fantaPrice
				+ zerocokeQty * zerocokePrice
				+ pinetreeQty * pinetreePrice;
		
		System.out.println("총 가격: " + totalPrice);
	}
}
