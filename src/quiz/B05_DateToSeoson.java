package quiz;

import java.util.Scanner;

public class B05_DateToSeoson {
	/*
	 	사용자가 년,월,일을 입력하면 알맞은 계절을 출력해 보세요.
	 	
	 	※ 주의사항
	 	1. 존재하지 않는 날짜를 입력하면 문구를 출력해줘야 한다.
	 	2. 계절의 구분은 절기로 한다
	 	
	 		입춘 2월3일(봄) - 34th
	 		입하 5월5일 - 94th
	 		입추 8월7일 - 219th
	 		입동 11월7일 - 311th	 			 		
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력해주세요.");
		int year = sc.nextInt();
		System.out.print("월 입력해주세요.");
		int month = sc.nextInt();
		System.out.print("일 입력해주세요.");
		int date = sc.nextInt();
		
//		int date = 0;
//		int year = 2025, month = 1;
		
		
		// 0. 이번 달의 최대 날짜를 구해보자.
		int maxDate; // **중요** 범위를 정할때 새로운 변수값을 정의해 활용하는 것이 필요할 때가 있다. **중요**
		switch (month) {
			case 1, 3, 5, 7, 8, 10 ,12:
				maxDate = 31;
				break;
			case 4, 6, 9, 11:
				maxDate = 30;
				break;
			case 2:
				if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
					maxDate = 29;
				} else {
					maxDate = 28;
				}
				break;
			default:
				maxDate = -1;
				break;
		}
		
		// 1. 잘못된 값은 없나
		String season = "계절";
		
		if (year < 0 || month < 1 || month > 12) {
			System.out.println("월 입력이 잘못되었습니다.");			
		} else if (date < 1 || date > maxDate) {
			System.out.println("날짜 입력이 잘못되었습니다.");
		} else {
			switch (month) {
				case 1, 12:
					season = "겨울";
					break;
				case 3, 4:
					season = "봄";
					break;
				case 6, 7:
					season = "여름";
					break;
				case 9, 10:
					season = "가을";
					break;
				case 2:
					if (date < 3) {
						season = "겨울";
					} else {
						season = "봄";
					} break;
				case 5:
					if (date < 5) {
						season = "봄";
					} else {
						season = "여름";
					} break;
				case 8:
					if (date < 7) {
						season = "여름";
					} else {
						season = "가을";
					} break;
				case 11:
					if (date < 7) {
						season = "가을";
					} else {
						season = "겨울";
					} break;
					
			}
			System.out.printf("%d년 %d월 %d일\n", year, month, date);
			System.out.println(season);
		}
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("연도를 입력해주세요.");
//		int yyyy = sc.nextInt();
//		System.out.print("월 입력해주세요.");
//		int mm = sc.nextInt();
//		System.out.print("일 입력해주세요.");
//		int dd = sc.nextInt();
		
//		boolean ddErr1 = mm == 1 && dd > 31;
//		boolean ddErr2 = mm == 2 && dd > 28;
//		boolean ddErr2_1 = mm == 2 && dd > 29;
//		boolean ddErr3 = mm == 3 && dd > 31;
//		boolean ddErr4 = mm == 4 && dd > 30;
//		boolean ddErr5 = mm == 5 && dd > 31;
//		boolean ddErr6 = mm == 6 && dd > 30;
//		boolean ddErr7 = mm == 7 && dd > 31;
//		boolean ddErr8 = mm == 8 && dd > 31;
//		boolean ddErr9 = mm == 9 && dd > 30;
//		boolean ddErr10 = mm == 10 && dd > 31;
//		boolean ddErr11 = mm == 11 && dd > 30;
//		boolean ddErr12 = mm == 12 && dd > 31;
//		boolean ddErr0 = mm < 1 || mm > 12 || dd < 1 || ddErr1 || ddErr2 || ddErr3 || ddErr4 ||
//				ddErr5 || ddErr6 || ddErr7 || ddErr8 || ddErr9 || ddErr10 || ddErr11 || ddErr12;		
//		boolean ddErr0_1 = mm < 1 || mm > 12 || dd < 1 || ddErr1 || ddErr2_1 || ddErr3 || ddErr4 ||
//				ddErr5 || ddErr6 || ddErr7 || ddErr8 || ddErr9 || ddErr10 || ddErr11 || ddErr12;
//		
//		if (mm == 2) {
//			date = dd + 31;
//		} else if (mm == 3) {
//			date = dd + 59;
//		} else if (mm == 4) {
//			date = dd + 90;
//		} else if (mm == 5) {
//			date = dd + 120;
//		} else if (mm == 6) {
//			date = dd + 151;
//		} else if (mm == 7) {
//			date = dd + 181;
//		} else if (mm == 8) {
//			date = dd + 212;
//		} else if (mm == 9) {
//			date = dd + 243;
//		} else if (mm == 10) {
//			date = dd + 273;
//		} else if (mm == 11) {
//			date = dd + 304;
//		} else if (mm == 12) {
//			date = dd + 334;
//		} else {
//			date = dd;
//		}
//		
//		//System.out.print(date);
//		
//		
//		boolean yy = yyyy % 400 == 0 || (yyyy % 4 == 0 && yyyy % 100 != 0);
//		
//		if (!yy) {
//		if (ddErr0) {
//			System.out.println("날짜를 다시입력하세요");
//		} else if (date >= 34 && date < 94 ) {
//			System.out.println("봄");
//		} else if (date >= 94 && date < 34) {
//			System.out.println("여름");
//		} else if (date >= 219 && date < 94) {
//			System.out.println("가을");
//		} else if (date >= 311) {
//			System.out.println("겨울");
//		} else if (date < 34) {
//			System.out.println("겨울");
//		}
//		} else {
//			if (ddErr0_1) {
//				System.out.println("날짜를 다시입력하세요");
//			} else if (date >= 34 && date < 94 + 1) {
//				System.out.println("봄");
//			} else if (date >= 94 + 1 && date < 219 + 1) {
//				System.out.println("여름");
//			} else if (date >= 219 + 1 && date < 311 + 1) {
//				System.out.println("가을");
//			} else if (date >= 311 + 1) {
//				System.out.println("겨울");
//			} else if (date < 34) {
//				System.out.println("겨울");
//			}
//		System.out.printf("%d년 %d월 %d일", yyyy, mm, dd);
//		}
//		System.out.println("---------");
//		
//		switch (mm) {
//			case 1:
//				System.out.println("겨울");
//				break;
//			case 2, 3, 4:
//				if (mm ==2 && dd < 3) {
//					System.out.println("겨울");
//				} else {
//					System.out.println("봄");
//				}
//			case 5, 6, 7:
//				if (mm == 5 && dd < 5) {
//					System.out.println("봄");
//				} else {
//					System.out.println("여름");
//				}
//			case 8, 9, 10:
//				if (mm == 8 && dd < 7) {
//					System.out.println("여름");
//				} else {
//					System.out.println("가을");
//				}
//			case 11, 12:
//				if (mm == 11 && dd < 7) {
//					System.out.println("가을");
//				}
//		
//		}
		
		
	}
	

}
