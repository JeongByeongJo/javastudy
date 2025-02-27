package quiz;

import java.util.Arrays;
import java.util.Random;

public class B14_Array2Quiz {
	
	public static void main(String[] args) {
		int[][] myArr = {
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0},
				new int[5],
				{0, 0, 0, 0, 0, 0, 0},
		};
		
		// 1. myArr의 모든 요소의 값을 100 ~ 200의 랜덤 정수로 바꾸기		
		// 2. 랜덤으로 바뀐 모든 요소의 총합과 평균을 구하기		
		// 3. 각 행(raw)의 총합을 구해서 출력하기		
		// 4. 각 열(column)의 총합을 구해서 출력하기
		
		Random ran = new Random();
		
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = ran.nextInt(100, 201);
				sum += myArr[i][j];
				count++;
				System.out.println(myArr[i][j]);
			}
			System.out.println();
		}
		double avg = sum / (double)count;
		
		System.out.println("************");
		int max_column_length = 0;
		for (int i = 0; i < myArr.length; ++i) {
			int column_length = 0;
			for (int j = 0; j < myArr[i].length; ++j) {
				++column_length;
			}
			if (max_column_length < column_length) {
				max_column_length = column_length;				
			}
		}
		System.out.println(max_column_length);
		System.out.println("************");	
		
		System.out.println("************");
		max_column_length = 0;
		for (int i = 0; i < myArr.length; ++i) {
			max_column_length = Math.max(max_column_length, myArr[i].length);
		}
		System.out.println(max_column_length);
		System.out.println("************");	
		
		int[][] tempArr = new int[max_column_length][max_column_length];
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				tempArr[i][j] = myArr[i][j];
				//System.out.println(tempArr[i][j]);
			}
			//System.out.println();
		}
		
		int[] row_sum = new int[myArr.length];
		
		for (int i = 0; i < myArr.length; ++i) {
			
			for (int j = 0; j < myArr[i].length; ++j) {				
				row_sum[i] += myArr[i][j];				
			}			 
		}
		
		int[] column_sum = new int[max_column_length];
		for (int i = 0; i < tempArr.length; ++i) {		
			for (int j = 0; j < tempArr[i].length; ++j) {				
				column_sum[i] += tempArr[j][i];				
			}			 
		}
		
		System.out.printf("모든 요소의 총합: %d, 평균: %.2f\n", sum, avg);
		System.out.println("---------------");
		for (int i = 0; i < row_sum.length; ++i) {
			System.out.printf("%d행의 총합: %d\n", i + 1, row_sum[i]);
		}
		System.out.println("---------------");
		for (int i = 0; i < column_sum.length; ++i) {
			System.out.printf("%d열의 총합: %d\n", i + 1, column_sum[i]);
		}
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		// 잘 들어갔나 확인
		for (int i = 0; i < myArr.length; ++i) {
			System.out.println(Arrays.toString(myArr[i]));
		}
		
		
		//총합 평균
		sum = 0;
		count = 0;
		
		for (int i = 0; i < myArr.length; ++i) {
			count += myArr[i].length;
			for (int j = 0; j < myArr[i].length; ++j) {
				sum += myArr[i][j];
			}
		}
		System.out.printf("총합: %d, 평균: %.2f\n", sum, sum / (double) count);
		
		// 각 행의 총합
		int maxColumnSize = 0;
		
		for (int i = 0; i < myArr.length; ++i) {
			maxColumnSize = Math.max(maxColumnSize, myArr[i].length);
		}
		int[] rowSum = new int[myArr.length];
		int[] colSum = new int[maxColumnSize];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				rowSum[i] += myArr[i][j];
				colSum[j] += myArr[i][j];
			}
		}
		System.out.println("행의 합: " + Arrays.toString(rowSum));
		System.out.println("행의 합: " + Arrays.toString(colSum));
		
	}// main

}
