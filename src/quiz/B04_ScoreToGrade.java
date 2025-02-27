package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {
	/*
	 	국어, 영어, 수학 점수를 순서대로 입력받은 후
	 	평균 점수(소수점 2째자리까지)와 등급을 출력해주는 프로그램을 만들어보세요
	 	
	 	평균 점수 90점 이상 A
	 	평균 점수 80점 이상 B
	 	평균 점수 70점 이상 C
	 	평균 점수 60점 이상 D
	 	그 외 F
	 	
	 	※ 각 과목의 유효 점수는 0~100점이고, 유효하지 않은 점수가 하나라도 있다면 평균점수는 0점, 등급은 F로 나와야 한다.
	 */
	public static void main(String[] args) {
		
//		int kor, eng, mat;
//		double avg;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어 점수를 입력해주세요 > ");
//		kor = sc.nextInt();
//		System.out.print("영어 점수를 입력해주세요 > ");
//		eng = sc.nextInt();
//		System.out.print("수학 점수를 입력해주세요 > ");
//		mat = sc.nextInt();
//		
//		avg = (kor + eng + mat)/3.0;		
//		
//		if (!(kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100)) {
//			System.out.println("평균점수 0점, 등급 F");
//		} else if (avg >= 90) {
//			System.out.printf("평균점수 %.2f점, 등급 A\n", avg);
//		} else if (avg >= 80) {
//			System.out.printf("평균점수 %.2f점, 등급 B\n", avg);
//		} else if (avg >= 70) {
//			System.out.printf("평균점수 %.2f점, 등급 C\n", avg);
//		} else if (avg >= 60) {
//			System.out.printf("평균점수 %.2f점, 등급 D\n", avg);
//		} else {
//			System.out.printf("평균점수 %.2f점, 등급 F\n", avg);
//		}
//		
//		System.out.println("------------------------");
//		
//		if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || mat < 0 || mat > 100) {
//			System.out.println("평균점수 0점, 등급 F");
//		} else if (avg >= 90) {
//			System.out.printf("평균점수 %.2f점, 등급 A\n", avg);
//		} else if (avg >= 80) {
//			System.out.printf("평균점수 %.2f점, 등급 B\n", avg);
//		} else if (avg >= 70) {
//			System.out.printf("평균점수 %.2f점, 등급 C\n", avg);
//		} else if (avg >= 60) {
//			System.out.printf("평균점수 %.2f점, 등급 D\n", avg);
//		} else {
//			System.out.printf("평균점수 %.2f점, 등급 F\n", avg);
//		}
//		
//		System.out.println("------------------------");
//		
//		if (avg >= 90 && kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100) {
//			System.out.printf("평균점수 %.2f점, 등급 A\n", avg);
//		} else if (avg >= 90 || kor < 0 && kor > 100 && eng < 0 && eng > 100 && mat < 0 && mat > 100) {
//			System.out.printf("평균점수 0점, 등급 F1\n", avg);
//		} else if (avg >= 80 && kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100) {
//			System.out.printf("평균점수 %.2f점, 등급 B\n", avg);
//		} else if (avg >= 80 || kor < 0 && kor > 100 && eng < 0 && eng > 100 && mat < 0 && mat > 100) {
//			System.out.printf("평균점수 0점, 등급 F2\n", avg);
//		} else if (avg >= 70 && kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100) {
//			System.out.printf("평균점수 %.2f점, 등급 C\n", avg);
//		} else if (avg >= 70 || kor < 0 && kor > 100 && eng < 0 && eng > 100 && mat < 0 && mat > 100) {
//			System.out.printf("평균점수 0점, 등급 F3\n", avg);
//		} else if (avg >= 60 && kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100) {
//			System.out.printf("평균점수 %.2f점, 등급 D\n", avg);
//		} else if (avg >= 60 || kor < 0 && kor > 100 && eng < 0 && eng > 100 && mat < 0 && mat > 100) {
//			System.out.printf("평균점수 0f점, 등급 F4\n", avg);
//		} else if (avg < 60 && kor >= 0 && kor <= 100 && eng >= 0 && eng <= 100 && mat >= 0 && mat <= 100) {
//			System.out.printf("평균점수 %.2f점, 등급 F\n", avg);
//		} else if (avg < 60 || kor < 0 && kor > 100 && eng < 0 && eng > 100 && mat < 0 && mat > 100) {
//			System.out.printf("평균점수 0점, 등급 F\n", avg);
//		}		
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("국영수 점수 > ");
		int kor_score = sc.nextInt();
		int eng_score = sc.nextInt();
		int math_score = sc.nextInt();
		
		// 변수의 초기값을 잘 설정하면 절차를 줄일 수 있다.
		double avg_score = 0;
		char grade = 'F';
		
		// 구현해야 하는 조건이 많을 때 잘못된 값을 먼저 잡아내는 것이 좋다.
		// *기가막힌 불리언 활용법을 익혀라*
		boolean kor_has_problem = kor_score < 0 || kor_score > 100;
		boolean eng_has_problem = eng_score < 0 || eng_score > 100;
		boolean math_has_problem = math_score < 0 || math_score > 100;
		
		if (kor_score < 0 || kor_score > 100) {
			System.out.println("국어 점수에 문제가 있습니다.");			
		} 
		if (eng_score < 0 || eng_score > 100) {
			System.out.println("영어 점수에 문제가 있습니다.");
		} 
		if (math_score < 0 || math_score > 100) {
			System.out.println("수학 점수에 문제가 있습니다.");
		} 
		if (!kor_has_problem && !eng_has_problem && !math_has_problem) {
			avg_score = (kor_score + eng_score + math_score)/3.0;
			
			if (avg_score >= 90) {
				grade = 'A';
			} else if (avg_score >= 80) {
				grade = 'B';
			} else if (avg_score >= 70) {
				grade = 'C';
			} else if (avg_score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
		}
		
		System.out.printf("평균 점수: %.2f\t등급: %c\n", avg_score, grade);
	}

}
