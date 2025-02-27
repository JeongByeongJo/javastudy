package myobj;

import java.util.Arrays;
import java.util.Scanner;

public class PuzzleMove {
	Scanner sc = new Scanner(System.in);
	PuzzlePlate pp = new PuzzlePlate();
	
	int[] canMove = new int[pp.puzzleSize];
	public int zeroRowIndex;
	public int zeroColIndex;
	public int rowIndex;
	public int columnIndex;
	
	
	public void findPuzzle(int puzzle[][], int puzzleNum) {
		for (int i = 0; i < pp.mixedPuzzlePlate.length; ++i) {
			for (int j = 0; j < pp.mixedPuzzlePlate[i].length; ++j) {
				if (puzzle[i][j] == puzzleNum) {
					rowIndex = i;
					columnIndex = j;					
				}
			}
		}
	}
	
	public void findZero(int[][] puzzle) {//빈칸의 위치 찾기
		for (int i = 0; i < pp.mixedPuzzlePlate.length; ++i) {
			for (int j = 0; j < pp.mixedPuzzlePlate[i].length; ++j) {
				if (puzzle[i][j] == 0) {
					zeroRowIndex = i;
					zeroColIndex = j;					
				}
			}
		}
		pp.printf(puzzle);
	}
	
	public int inputNum() {
		System.out.println("빈칸으로 이동할 퍼즐 숫자를 입력해주세요.");
		System.out.print("> ");
		int num = sc.nextInt();
		
		while (num > pp.puzzleLength) {
			System.out.println("이동할 퍼즐 숫자를 다시 입력해주세요.");
			System.out.print("> ");
			num = sc.nextInt();
		}
		return num;
	}
	
	public int adjoinNum(int puzzle[][], int puzzleNum) {
		this.findPuzzle(puzzle, puzzleNum);
//		System.out.println("빈칸으로 이동할 퍼즐 숫자를 입력해주세요.");
//		System.out.print("> ");
//		puzzleNum = sc.nextInt();
		
		while (Math.abs(zeroRowIndex - rowIndex) != 0
				&& Math.abs(zeroColIndex - columnIndex) != 0) {
			System.out.println("이동할 수 없는 숫자입니다. 다시 입력해주세요.");
			System.out.print("> ");
			puzzleNum = sc.nextInt();
			this.findPuzzle(puzzle, puzzleNum);
		}	
		
		return puzzleNum;
	}
	
	// 빈칸과 이동 숫자 위치 바꾸기
	public void movePuzzle(int puzzle[][], int puzzleNum) {
		this.findPuzzle(puzzle, puzzleNum);
		int temp = puzzle[rowIndex][columnIndex];
		puzzle[rowIndex][columnIndex] = puzzle[zeroRowIndex][zeroColIndex];
		puzzle[zeroRowIndex][zeroColIndex] = temp;
				
		pp.printf(puzzle);
	}

}
