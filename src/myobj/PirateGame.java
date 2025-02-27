package myobj;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
통아저씨 게임을 만들어보세요.

1. 게임이 시작되면 꽝 자리가 정해진다
2. 플레이어는 아저씨가 튀어나올때까지 돌아가면서 계속 자리를 선택해야 한다.(플레이어는 4명으로 고정한다.
3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다.(꽝의 위치는 매 판 시작시 랜덤으로 설정된다.)
4. 아저씨가 발사되면 해당 플레이어의 점수를 깍고 나머지의 점수를 찌르는데 성공한 횟수에 비례하여 증가시킨다.
   (기본점수 20점, 찌르기 실패: -2, 찌르기 성공: +1)
5. 각 게임이 끝날 때 순위에 따라 소지금이 변동된다. (1위 +1000, 2위 +500, 3위 -500, 4위 -1000)
6. 게임을 그만하겠다고 하거나 또는 한 사람의 점수가 -가 된다면 게임이 종료된다.
   게임이 종료되면서 최종 스코어를 출력해준다
   (이름, 점수, 남은 소지금(+얼마 벌었나) 등)
*/
public class PirateGame {
	
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	PirateGameBarrel barrel = new PirateGameBarrel();
	PirateGamePlayer player = new PirateGamePlayer();
	
	public void play() {
		int turn = 0;
		int count = 0;
		
		barrel.makeBoomHole();
		barrel.stabbedHole();
		
		while(true) {
			int currentTurn = turn % 4;			
			System.out.printf("%d번 플레이어 차례 > ", currentTurn + 1);
			int userAnswer = sc.nextInt();
			
			if (userAnswer < 0 || userAnswer > 19) {
				System.out.print("범위를 벗어났습니다. > \n");
				continue;						
			}
			
			stab(userAnswer, count, currentTurn);
			
			++player.count[currentTurn];
			
			for (int i = 0; i < barrel.boomHole.length; ++i) {
				if (userAnswer == barrel.boomHole[i]) {
					boom(currentTurn, count);
					count = -1;
					break;
				} 
			}
			
			++turn;
			++count;
		}
					
	}	
	
	// 찌르기!
	public void stab(int userAnswer, int count, int currentTurn) {
		boolean stabbedHole = true;
		while (stabbedHole) {			
			stabbedHole = false;
			barrel.stabbedHole[count] = userAnswer;
			for(int i = 0; i < count; ++i) {			
				if(barrel.stabbedHole[i] == userAnswer) {
					System.out.print("이미 찌른 자리입니다. > ");
					userAnswer = sc.nextInt();
					barrel.stabbedHole[count] = userAnswer;	
					stabbedHole = true;
				}
			}
		}
		player.score[currentTurn] += (count + 1);
		System.out.println(Arrays.toString(barrel.stabbedHole));
	}
			
	// 터졌다!(점수까지)
	public void boom(int currentTurn, int count) {
		System.out.println("통아저씨가 칼에 찔렸다!");
		System.out.println("통아저씨가 통 밖으로 튀어나왔다.");
		player.score[currentTurn] -= player.count[currentTurn];
//		for (int i = 0; i < player.score.length; ++i) {
//			player.score[i] += player.count[i];
//			player.count[i] = 0;
//		}
		player.score[currentTurn] -= 10;
		System.out.println(Arrays.toString(player.score));
		barrel.makeBoomHole();
		barrel.stabbedHole();
		
		
	}
	
	// 점수를 상금으로
	public void scoreToCash() {
		for (int i = 0; i < player.PLAYER_NUMBER; ++i) {
			int index = -1;
			for(int j = 0; j < player.PLAYER_NUMBER; ++j) {
				if (player.score[i] < player.score[j]) {
					index = j;
				}				
			}
			player.first(index);
		}
	}

	
	public void start() {
		while (true) {
			System.out.println("=======================");
			System.out.println("      통아저씨 게임");
			System.out.println("=======================");
			System.out.println("1. 시작하기\t2. 종료하기");
			int cmd = sc.nextInt();
			
			switch (cmd) {
				case 1:					
					play();						
					break;
				case 2:					
					break;
				default:
					break;			
			}			
		}
		
	}

}
