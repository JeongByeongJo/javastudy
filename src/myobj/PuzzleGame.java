package myobj;

import java.util.Scanner;

public class PuzzleGame {
	Scanner sc = new Scanner(System.in);

	PuzzlePlate pp = new PuzzlePlate();
	PuzzleMove pm = new PuzzleMove();	
		
	public boolean checkPuzzle (int[][] puzzle) {
		int count = 0;
		for (int i = 0; i < pp.puzzlePlate.length; ++i) {
			for (int j = 0; j < pp.puzzlePlate[i].length; ++j) {
				if(pp.puzzlePlate[i][j] == puzzle[i][j]) {
					++count;
				}
			}			
		}
		if (count == pp.puzzleLength) {
			return true;
		} else {
			return false;
		}
	}
	
	public void play() {
		pp.puzzleMix();
		pp.matchingPuzzle();
		pm.findZero(pp.mixedPuzzlePlate);
		
		boolean matching = false;
		while(!matching) {						
			pm.movePuzzle(pp.mixedPuzzlePlate, pm.adjoinNum(pp.mixedPuzzlePlate, pm.inputNum()));
			pm.findZero(pp.mixedPuzzlePlate);
			
			
			matching = checkPuzzle(pp.mixedPuzzlePlate);
		}
		System.out.println("대단하군요! 퍼즐을 맞추셨습니다.");
	}
	
	public void setting() {
		System.out.print("퍼즐 사이즈를 X*X 로 변경 > ");
		int size = sc.nextInt();
		pp.changePuzzleSize(size);
	}
	
	public void start() {
		boolean gameStart = true;
		while (gameStart) {
			System.out.println("=================================");
			System.out.println("           숫자 퍼즐 게임");
			System.out.println("=================================");
			System.out.println("1. 시작하기    2. 설정     3. 그만하기");
			int cmd = sc.nextInt();
			
			switch (cmd) {
				case 1:
					play();
					break;
				case 2:
					setting();
					play();
					break;
				case 3:
					gameStart = false;					
				default:
					break;			
			}			
		}
	}
}
