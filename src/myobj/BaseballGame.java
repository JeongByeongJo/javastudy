package myobj;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	
	int numLen = 4;
	
	public int[] correctAnswerArr = new int[numLen];
	public int[] userAnswerArr = new int[numLen];
	public char[] answerArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};	
	
	// 중복없는 숫자 만들기
	public int[] generateCorrctAnswer() {				
		for (int i = 0; i < correctAnswerArr.length; ++i) {
			correctAnswerArr[i] = ran.nextInt(10);			
			for (int j = 0; j < i; ++j) { 
				if (correctAnswerArr[i] == correctAnswerArr[j]) {					
					--i;
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(correctAnswerArr));
		return correctAnswerArr;
	}
	
	// 플레이어 입력
	int[] userAnswerArray() {
		
		System.out.print("4자리 숫자 입력> \n");
		String userAnswer = sc.next();
		
		while (userAnswer.length() != 4) {
			System.out.print("4자리를 숫자 입력해주세요> \n");
			userAnswer = sc.next();			
		}		
		
		for (int i = 0; i < numLen; ++i) {
			char ch = userAnswer.charAt(i);
			for (int j = 0; j < answerArr.length; ++j) {
				if (ch == answerArr[j]) {
					userAnswerArr[i] = j;
				}
			}
		}			
		return userAnswerArr;
	}
	
	// 스크라이크 볼 판정
	//스트라이크 판정
	public int checkStrike (int[] correctAnswerArr, int[] userAnswerArr) {
		int strikeCount = 0;
		for (int i = 0; i < numLen; ++i) {
			if (correctAnswerArr[i] == userAnswerArr[i]) {
				++strikeCount;
			}
		}
		return strikeCount;
	}
	
	// 볼 판정
	public int checkBall (int[] correctAnswerArr, int[] userAnswerArr) {
		int ballCount = 0;
		for (int i = 0; i < numLen; ++i) {
			for (int j = 0; j < numLen; ++j) {
				if (!(correctAnswerArr[i] == userAnswerArr[i]) && correctAnswerArr[i] == userAnswerArr[j]) {
					++ballCount;
				}				
			}
		}
		return ballCount;
	}
	
	//게임시작	
	public void start() {
		int chance = 9;
		
		generateCorrctAnswer();
		int strikeCount;
		int ballCount;
		
		while (chance > 0) {		
			userAnswerArr = userAnswerArray();
			
			strikeCount = checkStrike(correctAnswerArr, userAnswerArr);
			ballCount = checkBall(correctAnswerArr, userAnswerArr);
			
			if (strikeCount == numLen) {
				System.out.println("승리! 축하합니다.");
				break;
			}
			
			System.out.printf("%d Strike, %d Ball (남은 기회 %d)\n", strikeCount, ballCount, chance - 1);
			
			--chance;
			
			if (chance == 0) {
				System.out.println("플레이어의 패배");				
				System.out.println("정답은 " + Arrays.toString(correctAnswerArr));
			}
		}
	}	
	
}
