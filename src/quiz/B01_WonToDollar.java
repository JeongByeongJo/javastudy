package quiz;

import java.util.Scanner;

public class B01_WonToDollar {	
	/*
	   한국 돈을 입력하면 달러로 환전했을때 얼마를 받을 수 있는지
	   출력해주는 프로그램을 만들어보세요 
	   (현재 환율은 검색해서 반영, 달러는 소수점 둘째자리까지 출력)	
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("환전하시려는 액수를 입력해 주세요 >>");
//		double won = sc.nextDouble();
//		double dollar = won/1451;
//		
//		System.out.printf("%.2f 달러", dollar);
		
		System.out.print("환전하시려는 원화 액수를 입력해주세요");
		
		int won = sc.nextInt();
		double wonToUsd = 1451;
		double usd = won / wonToUsd;
		
		System.out.printf("원화 %d원은 USD %.2f달러입니다.", won, usd);
		
	}

}
