package quiz;

import java.util.Arrays;
import java.util.Random;

public class exex {
	/*
 	1 ~ 1000 사이의 랜덤 정수 값이 30개 들어있는 배열을 하나 생성한 후
 	해당 배열의 내용을 작은 값부터 차례대로 저장한 새로운 배열을 생성하여
 	원본 배열과 함께 출력해주세요.	 	
	 */
	public static void main(String[] arga) {
		Random ran = new Random();
		
		int[] arr = new int[30];
		int[] sortedArr = new int[arr.length];
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 1000 + 1);			
			sortedArr[i] = arr[i];
		}
		
		boolean[] chkArr = new boolean[arr.length];
		
		for (int i = 0; i < arr.length; ++i) {
			int min = 1001;
			int min_index = 0;
			for (int j = 0; j < arr.length; ++j) {
				if (!chkArr[j] && min > arr[j]) {
					min = arr[j];
					min_index = j;
				}				
			}
			chkArr[min_index] = true;
			sortedArr[i] = min;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 1000 + 1);			
			sortedArr[i] = arr[i];
		}
		
		for (int i = 0; i < arr.length - 1; ++i) {
			int min = sortedArr[i];
			int min_index = i;
			for (int j = i + 1; j < arr.length; ++j) {
				if (min > sortedArr[j]) {
					min = sortedArr[j];
					min_index = j;
				}
			}
			sortedArr[min_index] = sortedArr[i];
			sortedArr[i] = min;
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortedArr));
		
	}//main
	
}
