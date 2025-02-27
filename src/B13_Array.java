
public class B13_Array {
	/*
	 	# 배열 (Array)
	 	
	 	- 같은 타입 변수를 여러개 선언하고 싶을 때 사용하는 문법
	 	- 배열을 선언할 때 선언과 동시에 배열의 크기를 정한다.
	 	- 배열의 크기는 한번 만들어진 이후에는 변경이 불가능하다.
	 	- 배열.length를 통해 해당 배열의 길이를 알 수 있다.
	 	- 배열의 각 변수를 방 번호(index)를 통해 구분한다.
	 	- 배열의 인덱스는 0번부터 시작하고 (length - 1)번 까지 있다.
	 	
	 	# 배열 선언 방식
	 	
	 	1. 타입[] 변수명 = {값1, 값2, 값3, ...}; -> 갯수 무제한
	 	2. 타입[] 변수명 = new 타입[크기]; -> 크기를 정해주는 방식
	 	3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3, ...}; 
	 	
	 	
	*/
	 public static void main(String[] args) {
		 int num = 123;
		 int[] nums = {30, 22, 3, 55, 8, 1, 99};
		 char[] chs = {'안', '녕', '하', '세', '요', '?'}; // 이게 바로 스트링에 알맹이다
		 boolean[] hasLicense = {true, false, false, true};
		 
		 nums[7] = 22;
		 
		 
		 
		 System.out.println(num);
		 System.out.println(nums); // -> 배열의 위치가 출력된다.(시작 주소)
		 System.out.println(nums[0]);
		 System.out.println(nums[1]);
		 System.out.println(nums[2]);
		 System.out.println(nums[3]);
		 System.out.println(nums[4]);
		 System.out.println(nums[5]);
		 System.out.println(nums[6]);
		 System.out.println(nums[7]);
		 
		 chs[3] = '삼';
		 
		 System.out.println(hasLicense);
		 System.out.println(hasLicense[2]);
		 System.out.println(chs); // char[]만 예외로 출력된다. 스택에 주소값이 저장되는 건 동일하지만, print가 예외적으로 이렇게 작동해주는거다. 
		 System.out.println(chs[2]);
		 System.out.println(chs[5]);
		 
		 // 배열.length로 해당 배열의 길이를 알 수 있다.
		 System.out.println(nums.length);
		 System.out.println(hasLicense.length);
		 System.out.println(chs.length);
		 
		 // 길이를 알면 for문을 쉽게 돌릴 수 있다.
		 for (int i = 0; i < nums.length; ++i) {
			 System.out.printf("nums[%d]: %d\n", i, nums[i]);
		 }
		 
		 // 2번째 배열 선언 방식은 해당 배열의 길이만 설정하고 값은 기본값으로 초기화 한다.
		 // (정수: 0, 실수: 0.0, 불: false, 참조형: null)		  
		 int[] math_scores = new int[5];
		 float[] heights = new float[15];
		 String[] messages = new String[10];
		 
		 math_scores[3] = 99;
		 
		 System.out.println(math_scores);
		 System.out.println(math_scores[2]);
		 System.out.println(heights);
		 System.out.println(heights[11]);
		 System.out.println(messages);
		 System.out.println(messages[3]);
		 
		 // 종종 필요한 일이 생기는 3번째 선언 방식
		 double[] avgs = new double[] {1.3, 2.9, 5.0};
		 
		 System.out.println(avgs);
		 System.out.println(avgs[2]);
	 }

}
