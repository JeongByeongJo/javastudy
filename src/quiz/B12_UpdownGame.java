package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_UpdownGame {
	/*
	 	# 다음과 같은 게임을 만들어보세요
	 	
	 	1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자가 정답으로 설정된다.
	 	
	 	2. 사용자가 원하는 숫자를 입력하면 정답이 Up인지 Down인지 알려준다.
	 	
	 	3. 5번 안에 정답을 못맞추면 정답이 뭐였는지 알려주고 게임이 종료된다.
	 	
	 	4. 사용자가 정답을 맞추면 축하해주고 게임이 종료된다.
	 	
	 	5. 만약 사용자가 유효하지 않은 숫자를 입력했다면 기회가 소진되지 않고
	 	   다시 입력할 수 있는 기회를 준다.
	 	   (유효하지 않은 숫자: 1~100의 범위를 벗어나거나 또는 이미 좁혀놓은 범위를 벗어나는 숫자) 	
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int answer = ran.nextInt(1, 101);
		//System.out.println(answer);
		
		int chance = 5;
		int guessCeil = 101; // *********또*********
		int guessFloor = 0; /// *********또**********
		
		
		while (chance > 0) {			
			System.out.printf("%d ~ %d > (남은횟수: %d)", guessFloor+1, guessCeil-1, chance);
			int guess = sc.nextInt();
			
			if (guess <= guessFloor || guess >= guessCeil) {
				System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
				continue; //컨티뉴 사용법 : continue 이하 코드를 실행하지 않는다.
			}
			
			if (answer == guess) {
				System.out.println("정답입니다! 축하합니다!!");
				break;
			} else if (guess > answer) {
				System.out.println("Down!");
				guessCeil = guess;
			} else if (guess < answer) {
				System.out.println("Up!");
				guessFloor = guess;
			}		 
			--chance;
			
			if (chance == 0) {
				System.out.printf("정답은 %d이었습니다.\n", answer);
			}
		}
		System.out.printf("게임 종료");
		
		
	}// main

}
