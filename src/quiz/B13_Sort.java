package quiz;

import java.util.Arrays;
import java.util.Random;

public class B13_Sort {
	/*
	 	1 ~ 1000 사이의 랜덤 정수 값이 30개 들어있는 배열을 하나 생성한 후
	 	해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성하여
	 	원본 배열과 함께 출력해주세요.	 	
	*/
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
		System.out.println("(1)----------");
		int MIN = 1;
		
		for (int j = 0; j < len; ++j) {
			int bigNum = MIN;
			for (int i = 0; i < len; ++i) {
				if (bigNum < tempArr[i]) {
					bigNum = tempArr[i];
				}			
			}
			sortArr[len-j-1] = bigNum;
			for (int i = 0; i < len; ++i) {
				if (tempArr[i] == bigNum) {				
					tempArr[i] = 0;
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
		System.out.println("(2)----------");
		
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
		
		for (int i = 0; i < len; ++i) {			
			tempArr[i] = ranArr[i];
			System.out.println(ranArr[i]);
		}
		System.out.println("(3)----------");
		
		for (int i = 0; i < len; ++i) {
			int min = tempArr[i];
			int min_index = i;
			
			for (int j = i + 1; j < len; ++j) {
				if (min > tempArr[j]) {
					min = tempArr[j];
					min_index = j;
				}				
			}
			tempArr[min_index] = tempArr[i];
			tempArr[i] = min;
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
		
		// 붙어있는 두 값을 연쇄적으로 비교하며 제일 큰 값을 맨 뒤로 보내는 방식
		for (int i = 0; i < sorted.length - 1; ++i) {
			
			for (int j = 1; j < sorted.length - i; ++j) {
				int left = j - 1;
				int right = j;
				if(sorted[left] > sorted[right]) {
					int temp = sorted[left];
					sorted[left] = sorted[right];
					sorted[right] = temp;
					
				}
			}
			
		}
		
		
//-----------------------------------------------------------------------------------------------------		
//		// #1번그림풀이#
//		// 제일 작은 값 찾아서 바꾸기는 29번(len - 1) 해야함
//		for (int i = 0; i < sorted.length - 1; ++i) {
//			int min = sorted[i];
//			int min_index = i;
//			
//			// 제일 작은 값 찾기
//			// 과정이 진행될때마다 앞부분은 점점 볼 필요가 없어짐
//			for (int j = i + 1; j < sorted.length; ++j) {
//				if (min > sorted[j]) {
//					min = sorted[j];
//					min_index = j;
//				}
//			}
//			
//			// 제일 작은 값을 찾았다면 해당 값과 제일 앞(i)을 교환
//			sorted[min_index] = sorted[i];
//			sorted[i] = min;			
//		}
		
//------------------------------------------------------------------------------------------------------
		
//		// boolean[]은 false로 초기화 된다.
//		boolean[] used = new boolean[origin.length];
//		
//		// 1. 원본 배열에서 가장 작은값을 찾아서 순서대로 끼운다.
//		
//		for (int i = 0; i < origin.length; ++i) { 
//			// 제일 작은 값 찾기
//			int min = 1000;
//			int min_index = 0;
//			
//			for (int j = 0; j < origin.length; ++j) {
//				// 제일 작은 값으로 뽑힌 적이 없고
//				// 현재 찾은 제일 작은값보다 더 작은 숫자일 때 교체
//				if(!used[j] && min > origin[j]) {
//					min = origin[j];					
//					min_index = j;
//				}
//			}
//			// 찾은 제일 작은 값을 넣기
//			sorted[i] = min;
//			used[min_index] = true; // 제일 작은거 넣고 그 다음 작은 것을 찾기 위한 마크
//		}
		
		System.out.println("원본: " + Arrays.toString(origin));
		System.out.println("정렬결과: " + Arrays.toString(sorted));
		
	}// main

}
