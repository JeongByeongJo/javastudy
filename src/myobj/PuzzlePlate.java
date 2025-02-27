package myobj;

import java.util.Arrays;
import java.util.Random;

public class PuzzlePlate {
	Random ran = new Random();
	
	public int puzzleSize = 4;
	public int puzzleLength = puzzleSize * puzzleSize;
	
	public int[][] puzzlePlate = new int[puzzleSize][puzzleSize];
	public int[][] mixedPuzzlePlate = new int[puzzleSize][puzzleSize];	
	
	// 정답 확인을 위한 답안지 만들기
	public void matchingPuzzle() {
		int num = 0;
		for (int i = 0; i < puzzlePlate.length; ++i) {
			for (int j = 0; j < puzzlePlate[i].length; ++j) {
				puzzlePlate[i][j] = ++num; 
			}			
		}
		puzzlePlate[puzzleSize-1][puzzleSize-1] = 0;
		//printf(puzzlePlate);		
	}
	
	// 게임 플레이를 위한 퍼즐판 숫자 섞기(우하단은 공란으로 바꿔야 한다.)	
	public void puzzleMix() {		
		for (int i = 0; i < puzzleLength - 1; ++ i) {
			mixedPuzzlePlate[i / puzzleSize][i % puzzleSize] = (int)(Math.random() * (puzzleLength - 1) + 1);
			for (int j = 0; j < i; ++j) {
				if (mixedPuzzlePlate[i / puzzleSize][i % puzzleSize] == mixedPuzzlePlate[j / puzzleSize][j % puzzleSize]) {
					--i;
					break;
				}
			}
		}		
		printf(mixedPuzzlePlate);

		//return mixedPuzzlePlate;
	}	
	
	public void changePuzzleSize(int puzzleSize) {
		if (puzzleSize < 2) {
			System.out.println("그것은 퍼즐이 아닙니다..");
			return;
		}
		
		if (this.puzzleSize != puzzleSize) {
			this.puzzleSize = puzzleSize;
			this.puzzleLength = puzzleSize * puzzleSize;
		}	
		
		puzzlePlate = new int[puzzleSize][puzzleSize];
		mixedPuzzlePlate = new int[puzzleSize][puzzleSize];
		
		matchingPuzzle();
		puzzleMix();
		
		System.out.printf("게임 크기가 %dX%d 로 변경되었습니다.\n", puzzleSize, puzzleSize);
	}
	
	
	public void print(int[][] puzzle) {	
		for (int i = 0; i < mixedPuzzlePlate.length; ++i) {			
			System.out.println(Arrays.toString(puzzle[i]));
		}
	}
	
	public void printf(int[][] puzzle) {
		for (int i = 0; i < puzzlePlate.length; ++i) {
			for (int j = 0; j < puzzlePlate[i].length; ++j) {
				if(puzzle[i][j] == 0) {
					System.out.printf("|%2s|", " ");
				} else {
					System.out.printf("|%2d|", puzzle[i][j]);					
				}
			}
			System.out.println("");				
		}
	}


}
