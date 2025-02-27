package quiz;

import java.util.Arrays;
import java.util.Random;

public class ex1 {
	
	public static void main(String[] args) {
		
Random ran = new Random();
		
		int[] ranArr = new int[30];
		int len = ranArr.length;
		int[] tempArr = new int[len];
		
		int[] sortArr = new int[len];
		
		for (int i = 0; i < len; ++i) {
			ranArr[i] = ran.nextInt(1, 1001);
			tempArr[i] = ranArr[i];
			System.out.println(ranArr[i]);
		}
		System.out.println("----------");		
		
		for (int j = 0; j < len; ++j) {
			int MAX = 1000;
			int small = MAX;
			for (int i = 0; i < len; ++i) {
				if (small > tempArr[i]) {
					small = tempArr[i];
				}			
			}
			sortArr[j] = small;
			for (int i = 0; i < len; ++i) {
				if (tempArr[i] == small) {
					tempArr[i] = 1001;
					break;
				}				
			}				
		}
		for (int i = 0; i < len; ++i) {			
			System.out.println(sortArr[i]);
		}
		System.out.println("----------");
		
		for (int i = 0; i < len; ++i) {			
			tempArr[i] = ranArr[i];
			System.out.println(ranArr[i]);
		}
		System.out.println("----------");
		for (int i = 0; i < len; ++i) {
			for (int j = 0; j < i; ++j) {
				if (tempArr[i] < tempArr[j]) {
					int temp = tempArr[j];
					tempArr[j] = tempArr[i];
					tempArr[i] = temp;
				}
			}		
		}		
		for (int i = 0; i < len; ++i) {			
			sortArr[i] = tempArr[i]; 
			System.out.println(sortArr[i]);
		}	
		System.out.println("----------");
		System.out.println("#### 선생님 풀이 ####");
		
		int[] origin = new int[30];
		int[] sorted = new int[30];
		
		for (int i = 0; i < origin.length; ++i) {
			int ranNum = (int)(Math.random() * 1000 + 1);
			origin[i] = ranNum;
			sorted[i] = ranNum;			
		}	
		
		// boolean[]은 false로 초기화 된다.
		boolean[] used = new boolean[origin.length];
		
		// 1. 원본 배열에서 가장 작은값을 찾아서 순서대로 끼운다.
		
		for (int i = 0; i < origin.length - 1; ++i) { // 제일 작은값을 -1개 만큼 찾으면 마지막 1개는 제일 큰 수이다.
			// 제일 작은 값 찾기
			int min = 1000;
			int min_index = 0;
			
			for (int j = 0; j < origin.length; ++j) {
				// 제일 작은 값으로 뽑힌 적이 없고
				// 현재 찾은 제일 작은값보다 더 작은 숫자일 때 교체
				if(!used[j] && min > origin[j]) {
					min = origin[j];					
					min_index = j;
				}
			}
			// 찾은 제일 작은 값을 넣기
			sorted[i] = min;
			used[min_index] = true;
		}
		
		System.out.println("원본: " + Arrays.toString(origin));
		System.out.println("정렬결과: " + Arrays.toString(sorted));
		
	}//main

}
