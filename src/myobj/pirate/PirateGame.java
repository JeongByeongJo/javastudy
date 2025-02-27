package myobj.pirate;

import java.util.Scanner;

public class PirateGame {
	Scanner sc = new Scanner(System.in);
	
	boolean TEST_MODE = false;
	
	Barrel barrel;
	PirateGamePlayer[] players;
	int turn;
	boolean brokenExist;
	
	final static int DEFAULT_BARREL_SIZE = 20;
	final static int DEFAULT_PLAYER_LEN = 4;
	
	public PirateGame() {
		barrel = new Barrel();
		players = new PirateGamePlayer[4];
	}
	
	void setPlayers() {
		for (int i = 0, len = players.length; i < len; ++i) {
			System.out.printf("%d번째 플레이어의 이름을 설정하세요.\n", i + 1);
			String name = sc.next();
			players[i] = new PirateGamePlayer(name);
		}
	}
	
	public void endgameProcess() {
		// 점수순으로 플레이어 순위 결정(정렬)
		int len = players.length;
		for (int i = 0; i < len - 1; ++i) {			
			for (int j = 1; j < len - i; ++ j) {
				PirateGamePlayer left = players[j - 1];
				PirateGamePlayer right = players[j];
				if (left.getScoer() < right.getScoer()) {
					players[j - 1] = right;
 					players[j] = left;							
				}
			}			
		}
		
		// 순위에 따라 소지금 반영
		players[0].addMoney(1000);
		players[1].addMoney(500);
		players[2].addMoney(-500);
		players[3].addMoney(-1000);
		
		//순위 및 소지금 출력
		for (int i = 0; i < len; ++i) {
			PirateGamePlayer p = players[i];
			
			System.out.printf("%d위: %s(%d점)/%d원\n",
					i + 1, p.getName(), p.getScoer(), p.getMoney());			
		}
		// 소지금이 -가 된 있다면 게임 종료
		for (int i = 0; i < len; ++i) {
			brokenExist |= players[i].getMoney() < 0;
		}
		
		// 플레이어들의 점수 0점으로 초기화
		for (int i = 0; i < len - 1; ++i) {	
			players[i].setScoer(0);
		}
	}
	
	public void start() {		
		setPlayers();
		brokenExist = false;
		
		// 파산한 사람이 없으면 게임을 계속한다.
		while(!brokenExist) {
			barrel.reset();
			turn = 1;
			
			boolean pirateLaunched = false;
			
			while (!pirateLaunched) {
				
				PirateGamePlayer p = players[turn % players.length];
				
				System.out.printf("\"%s\"님이 찌르실 차례입니다. (현재 %d점)\n",
						p.getName(), p.getScoer());
				
				if (TEST_MODE) {
					barrel.testPrint();
				} else {
					barrel.print();
				}
				
				while (true) {
					System.out.printf("%d ~ %d > ", 1, barrel.size);
					int index =	sc.nextInt() - 1;
					
					if (index < 0 || index >= barrel.size) {
						System.out.println("범위를 벗어난 번호입니다. 잘 보고 골라주세요.");
						continue;
					}
					
					
					char value = barrel.stab(index);
					
					if (value == 'O') { // 살아남음 (점수 올려야 함)
						p.addScore(100 + 10 * turn);
						break;
					} else if (value == 'X') { // 지금 찌른 사람이 패배
						p.setScoer(0);
						pirateLaunched = true;
						System.out.println("통아저씨가 하늘로 날아갔습니다.");
						System.out.println(p.getName() + "님의 패배입니다.");
						
						// 점수에 따라 소지금 변경하기
						endgameProcess();
						
						break;
					} else if (value == 'S') { // 다시 찌를 기회를 줘야 함
						System.out.println("찔럿던 위치입니다. 잘 보고 골라주세요.");
					}				
				}
				++turn;
			}
			
			if (!brokenExist) {				
				// 게임을 계속 하시겠습니까?
				System.out.println("계속하시겠습니까(그만하려면 N)?");
				System.out.print("> ");
				String con = sc.next();
				
				if (con.charAt(0) == 'N') {
					System.out.println("게임을 종료합니다.");
					break;
				}
			}
			System.out.println("게임을 종료합니다.");
		}
	}


}
