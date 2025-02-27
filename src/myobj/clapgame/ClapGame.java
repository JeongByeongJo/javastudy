package myobj.clapgame;

import java.util.Scanner;

public class ClapGame {
	
	Scanner sc = new Scanner(System.in);
	
	final int[] CLAP_NUMBERS = {3, 6, 9};
	final static String[] WRONG_ANSWERS = {"앗", "...!", "꿽헽궭"};
	
	ClapGamePlayer[] players = {
			new ClapGamePlayer("플레이어"),
			new ClapGamePlayer("컴퓨터")
	};
	
	public ClapGame() {
	
	}
	
	// 플레이어 순서를 섞는 메서드
	void shufflePlayer() {
		for (int i = 0; i < 10; ++i) {
			int ranIndex = (int)(Math.random() * players.length);
			ClapGamePlayer temp = players[0];
			players[0] = players[ranIndex];
			players[ranIndex] = temp;
		}
	}
	
	// 컴퓨터가 답을 만들게 하는 메서드
	String geneateComputersAnswer(int turn) {
		if((int)(Math.random() * 100) < 85) {
			return getAnswer(turn);
		} else {
			return WRONG_ANSWERS[(int)(Math.random() * WRONG_ANSWERS.length)];
		}
	}
	
	// 지금 턴이 몇 턴인지 알려주면 정답을 알려주는 메서드
	String getAnswer(int turn) {
		String answer = "";
		
		int num = turn;
		while (num > 0) {
			int digit = num % 10;
			
			for (int i = 0; i < CLAP_NUMBERS.length; ++i) {
				if (digit == CLAP_NUMBERS[i]) {
					answer += "짝";
					break;
				}
			}
			
			num /= 10;
		}
		
		if (answer.length() == 0) {
			return "" + turn;
		} else {
			return answer;
		}
		
		//return answer.length() == 0 ? "" + turn : answer; // <- 위의 if문을 삼항연산으로 만든거다
	}
	
	boolean checkAnswer(String correctAnswer, String userAnswer) {
		// for문 안에 length()를 하면 length()를 조건 케츠할때마다 하게 되므로
		// 밖에서 한번만 진행할 수 있으면 그렇게 하는것이 더 바람직하다.
		int len = correctAnswer.length();
		
		for (int i = 0; i < len; ++i) {
			char ch1 = correctAnswer.charAt(i);
			char ch2 = userAnswer.charAt(i);
			
			if (ch1 == '짝') {
				if (ch2 != '짝' || ch2 != 'ㅉ') {
					return false;				
				}
			} else if (ch1 != ch2) {
				return false;
			}
		}
		return true;
	}
	
	// 게임 플레이 메서드
	public void start() {
		int turn = 1;
		int currentPlayer, nextPlayer;
		//String answer;
		shufflePlayer();
		
		while (true) {
			currentPlayer = turn % 2;
			nextPlayer = (turn + 1) % 2;
			// 이번턴의 정답
			String answerOfThisTurn = getAnswer(turn);
			
			System.out.printf("현재 %d턴 입니다. (정답: %s)\n", turn, getAnswer(turn));
			
			System.out.printf("\"%s\"님의 차례입니다.\n", players[currentPlayer].name);
			
			// 플레이어가 내는 정답
			String playersAnswer;
			
			if (players[currentPlayer].name.equals("플레이어")) {
				// 플레이어 차례일 때 플레이어의 입력을 기다림
				System.out.print("> ");
				playersAnswer = sc.next();				
			} else {
				// 컴퓨터 차례일 때 (내가 정답을 만들어야 함, 85% 확률로 정답)
				playersAnswer = geneateComputersAnswer(turn);
				System.out.printf("> %s\n", playersAnswer);
			}
			
			if (!checkAnswer(answerOfThisTurn, playersAnswer)) {
				players[currentPlayer].loss();
				players[nextPlayer].win();
				System.out.println("================");
				players[currentPlayer].print();
				players[nextPlayer].print();
				System.out.println("================");
				System.out.println("게임을 다시 시작합니다.");
				turn = 1;
				shufflePlayer();
				continue;
			}
			// 정답 체크 후 승/패 반영
						
			++turn;
		}
		
	}

}
