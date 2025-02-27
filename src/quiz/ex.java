package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 숫자 3개 입력>> ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		boolean overDice1 = num1 < 1 || num1 > 6;
		boolean overDice2 = num2 < 1 || num2 > 6;
		boolean overDice3 = num3 < 1 || num3 > 6;

		while (overDice1 || overDice2 || overDice3) {
			System.out.print("잘못입력하셨습니다. 다시 입력해주세요>> ");
			
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();			
			
			overDice1 = num1 < 1 || num1 > 6;
			overDice2 = num2 < 1 || num2 > 6;
			overDice3 = num3 < 1 || num3 > 6;			
		}		
		
		int prize = 0;
		
		if (num1 == num2 && num2 == num3) {
			prize = 10000 + ((num1) * 1000);
		} else if (num1 == num2 || num2 == num3) {
			prize = 1000 + ((num2) * 100);
		} else if (num1 == num2 || num1 == num3) {
			prize = 1000 + ((num1) * 100);
		} else {
			prize = Math.max(Math.max(num1, num2), num3) * 100;
		}		
		
		System.out.println(prize);		
		
	}//main

}
