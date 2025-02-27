package myobj.baseball;

import java.util.Arrays;
import java.util.Random;

public class BaseballGameAnswer {
	Random ran = new Random();
	
	int game_size = 4;
	
	int[] answers = new int[4];
	
	public BaseballGameAnswer () {
		roll();
	}
	
	public void changeGameSize(int game_size) {
		if (game_size < 0 || game_size > 10) {
			System.out.println("그렇게는 못하겠습니다.");
			return;
		}
		
		if (this.game_size != game_size) {
			this.game_size = game_size;
			answers = new int[game_size];
		}	
		
		roll();
		System.out.println("게임 크기가 " + game_size + "로 변경되었습니다.");
	}
	
	// 숫자굴리기 (중복없는 랜덤숫자 생성하기)
	public void roll() {
		for (int i = 0; i < game_size; ++ i) {
			answers[i] = (int)(Math.random() * 10);
			for (int j = 0; j < i; ++j) {
				if (answers[i] == answers[j]) {
					--i;
					break;
				}
			}
		}
	}
	
	boolean checkNumeric(String userAnswer) {
		for(int i = 0, len = userAnswer.length(); i< len; ++i) {
			char ch = userAnswer.charAt(i);
			
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	/** 문자열로된 정답을 입력받으면 strike/ball을 반환해주는 메서드
	 * 
	 *  @return - strike와 ball로 구성된 배열을 반환한다.
	 *  index 0에 strike, index 1에 ball 수치가 담겨있다.
	 */
	public int[] check(String userAnswer) {
		if(!checkNumeric(userAnswer)) {
			return null;
		}
		
		if(userAnswer.length() != game_size) {
			return null;
		}
		
		int[] result = new int[2];		
		
		for (int i = 0; i < game_size; ++i) {
			int ch = userAnswer.charAt(i) - '0';
			
			for (int j = 0; j < game_size; ++j) {
				if (answers[j] == ch) {
					if (i == j) {
						++result[0];
					} else {
						++result[1];
					}
					break;
				}
				
			}
		}		
		return result;				
	}
	
	
	public void print() {
		System.out.println("현재 정답: " + Arrays.toString(answers));
	}

}
