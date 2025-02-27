package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_RspGame {
	/*
	 	컴퓨터랑 진행할 수 있는 가위바위보 게임을 만들어보세요
	 	
	 	1. 전적이 계속해서 기록되어야 한다.
	 	
	 	2. 연승하는 경우 몇 연승중인지 표시된다.
	 	
	 	3. 가위, 바위, 보 대신 종료를 입력하면 게임이 종료된다.
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int countWin = 0;
		int countDraw = 0;
		int countLose = 0;
		int wins = 0;		
		
		for (;;) {
			int comRcp = ran.nextInt(1, 4);				
			System.out.println("가위 바위 보!>  ");
			String userRcp = sc.next();
			//System.out.println(comRcp);
			if (userRcp.equals("종료")) {
				break;
			}// if end
			if (!(userRcp.equals("가위") || userRcp.equals("바위") || userRcp.equals("보") || userRcp.equals("종료"))) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}// if end
			if (userRcp.equals("가위")) {
				if (comRcp == 1) {
					countDraw++;
					System.out.println("비겼습니다.");
					wins = 0;
				} else if (comRcp == 2) {
					countLose++;
					System.out.println("졌습니다.");
					wins = 0;
				} else if (comRcp == 3) {
					countWin++;
					System.out.println("이겼습니다.");
					wins++;
				}
			} else if (userRcp.equals("바위")) {
				if (comRcp == 1) {
					countWin++;
					System.out.println("이겼습니다.");
					wins++;
				} else if (comRcp == 2) {
					countDraw++;
					System.out.println("비겼습니다.");
					wins = 0;
				} else if (comRcp == 3) {
					countLose++;
					System.out.println("졌습니다.");
					wins = 0;
				}			
			} else if (userRcp.equals("보")) {
				if (comRcp == 1) {
					countLose++;
					System.out.println("졌습니다.");
					wins = 0;
				} else if (comRcp == 2) {
					countWin++;
					System.out.println("이겼습니다.");
					wins++;
				} else if (comRcp == 3) {
					countDraw++;
					System.out.println("비겼습니다.");
					wins = 0;
				}
			}// if end
			
			System.out.printf("%d승, %d무, %d패 중입니다.\n", countWin, countDraw, countLose);
			
			if (wins > 1) {
				System.out.println(wins + "연승 중입니다.");
			}// if end
		} //for end
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		// 선생님 풀이
		
		int win = 0, draw = 0, lose = 0;
		int winStreak = 0;
		
		boolean DEBUG_MODE = false;
		
		while (true) {
			int comValue = ran.nextInt(3); // 0: 가위, 1: 바위, 2: 보
			
			if(DEBUG_MODE) {
			System.out.println("(테스트용) 컴퓨터: " + comValue);
			}
			
			System.out.print("가위, 바위, 보 >> ");
			String user = sc.next();
			
			if (user.equals("종료")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			int userValue;
			switch (user) {
				case "가위":
					userValue = 0;
					break;
				case "바위":
					userValue = 1;
					break;
				case "보":
					userValue = 2;
					break;
				default:
					userValue = -1;
					break;
			}
			
			if (userValue == -1) {
				System.out.println("제대로 입력해주세요...");
				continue;
			}
			
			String com = "";
			
			switch (comValue) {
				case 0:
					com = "가위";
					break;
				case 1:
					com = "바위";
					break;
				case 2:
					com = "보";
					break;
			}
			System.out.printf("컴퓨터가 '%s'를 냈습니다.\n", com);
			
			if (userValue == comValue) {
				++draw;
				winStreak = 0;
				System.out.println("비겼습니다.");
			} else if ((userValue + 1) % 3 == comValue) {
				++lose;
				winStreak = 0;
				System.out.println("당신의 패배있니다.");
			} else {
				++win;
				++winStreak;
				System.out.println("당신의 승리입니다.");
			}
			
			System.out.printf("<전적> %d승 %d무 %d패 (%d연승중)\n", win, draw, lose, winStreak);
		}
		
		
	}// main

}
