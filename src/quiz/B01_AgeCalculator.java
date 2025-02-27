package quiz;

import java.util.Scanner;

public class B01_AgeCalculator {
	
	/*
	 	이름과 태어난 해를 입력하면 이름과 나이를 출력해주는 프로그램을 만들어보세요.
	 	
	 	ex> 김동우 1997
	 		김동우 (28세)
	 */
	
	public static void main(String[] args) {
		
		// 1. 입력을 받기위해 새 스캐너를 생성
		Scanner sc = new Scanner(System.in); // 콘솔로부터 입력을 받겠다.
		
		System.out.print("이름과 태어난 해를 입력해주세요 >> ");
		String name0 = sc.next();
		int year0 = sc.nextInt();
		int age0 = 2025 - year0;
		
		System.out.printf("%s (%d세)", name0, age0);
		
		System.out.println();
		System.out.println("----------------------------------");
		
		
		String name = "";
		String year = "";
		
		boolean validName = false;
		boolean loop = true;
		
		while(loop) {		
			System.out.print("이름과 태어난 해를 입력해주세요 >  ");
			String nameYear = sc.nextLine();
			for (int i = 0; i < nameYear.length(); ++i) {
				char ch = nameYear.charAt(i);
				if (ch >= '가' && ch <= '힣') {
					name += ch;
					validName = true;
				} else if (ch >= '0' && ch <= '9') {
					year += ch;
				}
			}//for end
			if (year.length() == 4 && validName) {
				loop = false;		
			} else { System.out.println("다시 입력해주세요.");
				name = "";
				year = "";
				continue;				
			}
			int yyyy = 0;
			for (int i = 0; i < year.length(); ++i) {
				char ch = year.charAt(i);
				yyyy += (ch - 48) * (int)Math.pow(10, 3-i);
			}		
			int age = 2024 - yyyy + 1;
			System.out.printf("%s (%d세)", name, age);			
		}
		
		//System.out.printf("%s (%d세)", name, age);
		
//		char ch1000 = year.charAt(0);
//		char ch100 = year.charAt(1);
//		char ch10 = year.charAt(2);
//		char ch1 = year.charAt(3);
//		int year1000 = (ch1000 - 48)*1000;
//		int year100 = (ch100 - 48)*100;
//		int year10 = (ch10 - 48)*10;
//		int year1 = (ch1 - 48);
//		int year0 = year1000 + year100 + year10 + year1;
//		System.out.println(year0); // 5 = 53		
		
		
	}// main

}
