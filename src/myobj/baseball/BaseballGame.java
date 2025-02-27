package myobj.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
	Scanner sc = new Scanner(System.in);
	BaseballGameAnswer answer = new BaseballGameAnswer();
	
	final boolean DEBUG_MODE = false;
	
	void setting() {
		System.out.println("게임 크기를 몇으로 수정하시겠습니까?");
		System.out.print("> ");
		answer.changeGameSize(sc.nextInt());
	}
	
	
	void play() {
		answer.roll();
		int chance = 9;
		
		while (chance > 0) {
			
			if (DEBUG_MODE) {
				answer.print();
			}
			
			System.out.printf("%d자리 숫자를 맞춰보세요.\n", answer.game_size);
			
			System.out.printf("남은기회 %d회 > ", chance);
			String userAnswer = sc.next();
			int[] result = answer.check(userAnswer);			
			
			if (result != null) {
				System.out.printf("%d Strike, %d Ball\n", result[0], result[1]);
			} else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}			
			
			if (result[0] == answer.game_size) {
				System.out.println("축하합니다. 정답입니다.");
				break;
			}
			--chance;
		}
	}
	
	public void Start() {
		while (true) {
			System.out.println("=======================");
			System.out.println("      숫자 야구 게임");
			System.out.println("=======================");
			System.out.println("1. 시작하기\t2. 설정");
			int cmd = sc.nextInt();
			
			switch (cmd) {
				case 1:
					play();
					break;
				case 2:
					setting();
					break;
				default:
					break;			
			}			
		}
	}

}
