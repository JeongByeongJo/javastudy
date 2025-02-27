package myobj;

import java.util.Scanner;

/*
	컴퓨터와 번갈아가면서 진행하는 369게임을 만들어보세요.
	
	1. 컴퓨터와 사용자의 1대1 대결로 진행
	2. 먼저하는 사람은 랜덤
	3. 사용자는 3, 6, 9가 포함된 숫자에는 "짝" 또는 "ㅉ"을 입력해야한다.
	4. 컴퓨터는 자기 차례가 되면 85%확률로 정답을 말하고 15% 확률로 오답을 말한다.
	5. 오답을 말하는 쪽이 패배하고 게임이 끝난다.	
*/	
public class Game369 {
	Scanner sc = new Scanner(System.in);
	
	public int[] clapNum = {3, 6, 9};
	Game369Player[] players = {
			new Game369Player("플레이어"),
			new Game369Player("컴퓨터"),
	};
	char[] clap369 = {'짝', 'ㅉ'};
	String comReact = "꿿";
	
	
	public Game369() {		
	}
	
	
	//플레이어 순서 섞기 메서드
	void shufflePlayer() {
		int ranIndex = (int)(Math.random() * players.length);
		for (int i = 0; i <= ranIndex; ++i) {
			Game369Player temp = players[0];
			players[0] = players[1];
			players[1] = players[0];
		}
	}
	
	// 매 턴 답만들기 메서드
	public String correctAnswer(int currentTurn) {
		String answer = "";
		
		int num = currentTurn;
		while(num > 0) {
			int digit = num % 10;
			for (int i = 0; i < clapNum.length; ++i) {
				if (digit == clapNum[i]) {
					answer += "짝";
				}				
			}
			num /= 10;			
		}
		if(answer.length() == 0) {
			return answer = currentTurn + "";
		} else {
			return answer;
		}
	}
	
	String comAnswer(int currentTurn) {
		if ((Math.random()*100) < 85) {
			return correctAnswer(currentTurn);
		} else {
			return comReact;
		}
	}
	
	public void start() {
		int currentTurn = 1;
		String answer;
		int startNum = (int)(Math.random()*2);
		boolean correctAnswer = true;
		
		while(correctAnswer) {
			System.out.println(startNum);
			int turn = startNum % 2;
			if (turn == 1) {
				System.out.print("내 차례 > ");
				answer = sc.next();				
			} else {
				answer = comAnswer(currentTurn);
				System.out.printf("컴퓨터 차례 > %s\n", answer);
			}
			
			if (!correctAnswer(currentTurn).equals(answer)) {
				if(startNum % 2 == 1) {
					System.out.println("당신의 패배입니다.");
					players[0].loss();
					players[1].win();
				} else {
					System.out.println("당신의 승리입니다.");
					players[1].loss();
					players[0].win();
				}			
				correctAnswer = false;
			}
			
			++currentTurn;
			++startNum;
		}
		
	}

}
