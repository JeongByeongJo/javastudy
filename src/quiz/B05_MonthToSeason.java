package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {
	/*
	 	사용자가 몇 월인지 입력하면 해당하는 계절을 출력해보세요.
	 	(switch-case문, if문으로 한번씩 만들기)
	 	
 		12~3 겨울, 4~6 봄, 7~9 여름, 10~11 가을
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력해주세요 > ");
		int month = sc.nextInt();
		
		switch (month) {
			case 12: case 1: case 2: case 3: 
				System.out.println("겨울");
				break;
			case 4: case 5: case 6: 
				System.out.println("봄");
				break;
			case 7: case 8: case 9: 
				System.out.println("여름");
				break;
			case 10: case 11: 
				System.out.println("가을");
				break;
			default:
				System.out.println("월을 잘못입력하셨습니다.");
		}
		
		String season;
		boolean monthProblem = month < 1 || month > 12;
		
		if (monthProblem) {
			System.out.println("월을 잘못입력하셨습니다.");
		} else if (month==12 || month <= 3) {
			System.out.println("겨울");
		} else if (month >= 4 && month <= 6) {
			System.out.println("봄");
		} else if (month >= 7 && month <= 9) {
			System.out.println("여름");
		} else {
			System.out.println("가을");
		}
		
		// 
		int year = 0;
		boolean yy = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		
		int MM, dd;
		
	}

	

}
