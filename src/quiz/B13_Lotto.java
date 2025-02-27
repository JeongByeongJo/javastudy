package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_Lotto {
	/*
		(1) 1 ~ 45 의 중복 없는 랜덤 숫자 7개인 로또 당첨번호 배열을 생성해보세요.
			(7개 중 마지막으로 나온 숫자가 보너스 번호)
		
		(2) 1등 또는 2등에 당첨될 때까지 6개의 랜덤 로또 번호를 계속 생성하여 몇 번만에 당첨되었는지 출력해보세요.
		
			- 보너스 번호를 제외하고 6개 다 맞으면 1등
			- 보너스 번호가 포함된채로 6개가 다 맞으면 2등
	*/
	public static void main(String[] args) {		
		Random ran = new Random();		

		int[] lottoNum = new int[45];
		
		for (int i = 0; i < 45; ++i) {
			lottoNum[i] = i + 1;
		}
		
		char[] sfLottoNum = new char[45];
		
		int a = 0;
		while (a < 45) {
			char ch = (char) lottoNum[a];
			int ranIndex = ran.nextInt(45);
			
			if (sfLottoNum[ranIndex] == 0) {
				sfLottoNum[ranIndex] = ch;
			} else {
				continue;
			}
			
			++a;
		}
		//System.out.println((int) sfLottoNum[3]);
		int[] winNum = new int[7];
		
		for (int j = 0; j < 7; ++j) {
			winNum[j] = sfLottoNum[j];
			//System.out.print(winNum[j] + " ");
		}
		System.out.println();
		//System.out.println((int) lottoNum[3]);
		
		int b = 0;
		while(true) { 
			b++;	
			char[] sfuserNum = new char[45];
		
			int l = 0;
			while (l < 45) {
				char ch = (char) lottoNum[l];
				int ranIndex = ran.nextInt(45);
				
				if (sfuserNum[ranIndex] == 0) {
					sfuserNum[ranIndex] = ch;
				} else {
					continue;
				}
				
				++l;
			}
			//System.out.println((int) sfuserNum[1]);
			
			int[] userNum = new int[6];
			
			for (int j = 0; j < 6; ++j) {
				userNum[j] = sfuserNum[j];
				//System.out.print(userNum[j] + " ");
			}
			System.out.println();
			int count1st = 0;
			for (int j = 0; j < 6; ++j) {
				for (int k = 0; k < 6; ++k) {
					if (userNum[j] == winNum[k]) {
						count1st++;
						break;
					}				
				}			
			}
			//System.out.println(count1st);
			
			int count2nd = 0;
			for (int j = 0; j < 6; ++j) {
				if (userNum[j] == winNum[6]) {	
					for (int jj = 0; jj <6; ++jj) {
						for (int k = 0; k < 6; ++k) {
							if (userNum[jj] == winNum[k]) {
								count2nd++;
								break;
							}
						}				
					}			
				}
			}
			
			
			
			if (count1st == 6) {
				System.out.println("1등");
				for (int t = 0; t < 6; ++t) {
					System.out.print(winNum[t] + " ");				
				}
				System.out.println();
				System.out.println("보너스 번호: " + winNum[6]);
				for (int t = 0; t < 6; ++t) {				
					System.out.print(userNum[t] + " ");
				}
				System.out.println("구매횟수: " + b);
				break;
			}
			if (count2nd == 5) {
				System.out.println("2등");
				for (int t = 0; t < 6; ++t) {
					System.out.print(winNum[t] + " ");				
					}
				System.out.println();
				System.out.println("보너스 번호: " + winNum[6]);
				for (int t = 0; t < 6; ++t) {				
					System.out.print(userNum[t] + " ");
				}
				System.out.println("구매횟수: " + b);
				//break;	
			}
		}		
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		
		int[] winNums = new int[7];
		int[] guessNums = new int[6];
		
		for (int i = 0; i < winNums.length; ++i) {
			//i번째에 뽑은 숫자를 저장
			winNums[i] = (ran.nextInt(45)+1);
			// j: i번째 이전에 뽑은 숫자들의 인덱스
			for (int j = 0; j < i; ++j) { // i가 0일때는 for문이 작동안한다.(0 < 0)
				if (winNums[i] == winNums[j]) {
					// 같은 숫자를 발견했으므로 다시 뽑아야 한다.
					--i;
					break;
				}
			}
		}
		
		// Arrays.toString(배열): 해당 배열의 내용을 문자열 형태로 반환
		System.out.println("당첨번호: " + Arrays.toString(winNums));
		System.out.println("보너스 번호: " + winNums[6]);
		
		boolean winnerExist = false;
		int buyCount = 0;
		while (!winnerExist) {
			buyCount++;
			//1. 중복없는 랜덤 6개 번호 배열 생성
			for (int i = 0; i < guessNums.length; ++i) {
				guessNums[i] = (int) (Math.random() * 45 + 1);
				
				for (int j = 0; j < i; ++j) {
					if (guessNums[i] == guessNums[j]) {
						--i;
						break;
					}
				}
			}
			
			int winCount = 0;
			boolean hasBonus = false;
			
			System.out.println("구매번호: " + Arrays.toString(guessNums));
			//2. 생성한 배열과 winNums 배열을 비교하여 당첨자 찾기
			for (int i = 0; i < guessNums.length; ++i) {
				for (int j = 0; j < winNums.length; ++j) {
					if (guessNums[i] == winNums[j]) {
						++winCount;
						if (j == 6) {
							hasBonus = true;
						}
						break;
					}
				}				
			}
			
			if (winCount == 6 && hasBonus) {
				System.out.println("2등 당첨!");				
			} else if (winCount == 6) {
				System.out.println(buyCount + "회 만에 1등 당첨!");
				winnerExist = true;
			}
		}
		System.out.println("당첨번호: " + Arrays.toString(winNums));
		System.out.println("구매번호: " + Arrays.toString(guessNums));

	}//main
	

}
