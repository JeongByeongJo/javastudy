package quiz;

import java.util.Arrays;

public class C01_Range {
	/*
		1. 정수값을 전달받으면 0부터 해당 값 미만의 int[]을 생성하여 반환하는
		   range 함수를 만들어보세요.
		   
		   ex> range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
		   
		2. 정수값을 두 개 전달받으면 왼쪽 값부터 오른쪽 값으로 1씩 증가하거나 감소하는
		   int[]을 생성하여 반환하는 range 함수를 만들어보세요.
		   
		   ex> range(10, 15)의 결과 -> [10, 11, 12, 13, 14]
		       range(15, 10)의 결과 -> [15, 14, 13, 12, 11]
		       
		3. 정수값을 세 개 전달받으면 첫 번째 값부터 두번재 값으로 세 번째 값만큼
		   증가하거나 감소하는 int[]을 생성하여 반환하는 range 함수를 만들어보세요.
		   
		   ex>  range(10, 20, 2)의 결과 -> [10, 12, 14, 16, 18]
		   		range(40, 30, -3)의 결과 -> [40, 37, 34, 31]
		   		range(20, 10, 3)의 결과 -> []
	*/
	//1.
	public static int[] range(int num) {
		if (num < 0) {
			return new int[0];			 
		}
		int[] range = new int[num];
		for(int i = 0; i < num; ++i) {
			range[i] = i;
		}
		return range;
	}
	
	//2.
	public static int[] range(int num1, int num2) {
		int[] range = new int[Math.abs(num1 - num2)];
		if (num1 < num2) {
			for(int i = 0; i < Math.abs(num1 - num2); ++i) {
				range[i] = num1 + i;
			}			
		} else if (num1 > num2) {			
			for(int i = 0; i < Math.abs(num1 - num2); ++i) {
				range[i] = num1 - i;
			}				 
		}
		return range;		
	}
	
	//3.
	public static int[] range(int num1, int num2, int num3) {
		double count = (num2 - num1) / (double)(num3);
		int[] range = new int[(int)Math.ceil(count)];
		
		if (count < 0) {
			return new int[] {};
		}
		for (int i = 0; i < count; ++i) {
			range[i] = num1 + (num3 * i);
		}
		
		return range;
	}
	
	
	public static void main(String[] args) {

		//1.
		System.out.println(Arrays.toString(range(8)));
		
		//2.
		System.out.println(Arrays.toString(range(15, 10)));
		
		System.out.println(Arrays.toString(ranges(-3, 3)));
		
		//3.
		System.out.println(Arrays.toString(range(50, 39, -2)));
		
		System.out.println(Arrays.toString(ranges(50, 39, 2)));
	
		
	}// main
	// 선생님 풀이
	public static int[] ranges(int num) {
		if (num < 0) {
			return new int[] {};
		}
		
		int[] range = new int[num];
		
		for(int i = 0; i < num; ++i) {
			range[i] = i;
		}
		
		return range;
	}
	
	//2.
	public static int[] ranges(int start, int end) {
		int len = Math.abs(start - end);
		
		// 삼항연산자 - 조건문 ? 예 : 아니오; (조건문이 사실이면 '예', 거짓이면 '아니오'를 출력
		int increment = start > end ? -1 : 1;		
//		if (start > end) {
//			increment = -1;			
//		} else {
//			increment = 1;
//		}
		
		int[] range = new int[len];
		
		for(int i = 0; i < len; ++i) {
			range[i] = start + (increment * i);
		}
		return range;		
	}
	
	//3.
	public static int[] ranges(int start, int end, int increment) {
		int len = (end - start) / increment;
		
		// len가 음수인 경우 방향이 잘못된 것이므로 빈 배열을 반환
		if (len < 0) {
			return new int[0];
		}
		
		if ((end - start) % increment != 0) {
			++len;
		}
		
		int[] range = new int[len];
		
		for (int i = 0; i < len; ++i) {
			range[i] = start + (increment * i);
		}

		return range;
	}

}
