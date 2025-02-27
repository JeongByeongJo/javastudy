import java.util.Arrays;

public class B14_Array2 {
	/*
		배열도 다른 배열의 요소가 될 수 있다.	
	*/
	public static void main(String[] args) {		
		int[] arr = {1, 2, 3, 4, 5};
		int[][] arr2 = {
				{1, 2, 3},
				{3, 3, 1, 1, 4, 4},
				{5, 55, 555},
				arr,
				arr,
				arr
		};		
		
		System.out.println(Arrays.toString(arr2));
		
		
		// char[]은 String과 유사하다.
		// char[][]은 String[]과 유사다.
		char[][] arr3 = {
				{'H', 'e', 'l', 'l', 'o'},
				{'G', 'o', 'o', 'd'},
				{'M', 'o', 'r', 'n', 'i', 'n', 'g'},
		};
		String[] arr4 = {
				"Hello",
				"Good",
				"Morning",
		};
		
		// int[][]의 값을 꺼내 활용하기
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		System.out.println(arr2[0][2]);
		System.out.println(arr2[1][0]);
		System.out.println(arr2[1][1]);
		System.out.println(arr2[1][2]);
		System.out.println(arr2[1][3]);
		
		// int[][]에 값을 대입하기
		arr2[0][0] = 9999;
		arr2[0][1] = 33;
		System.out.println(arr2[0][0]);
		System.out.println(arr2[0][1]);
		
		// arr2[3], arr2[4], arr2[5]는 같은 배열을 가리키고 있기 때문에
		// 하나의 값만 수정해도 모두 수정된 것처럼 보인다.
		
		arr2[3][0] = 7;
		System.out.println(arr2[3][0]);
		System.out.println(arr2[4][0]);
		System.out.println(arr2[5][0]);
		
		arr2[4][0] = 11;
		System.out.println(arr2[3][0]);
		System.out.println(arr2[4][0]);
		System.out.println(arr2[5][0]);
		
		/*
		 	# 배열이 변수와 다른 점
		 	
		 	- 배열 타입 변수에는 실제 배열을 가리키는 주소값(메모리상의 위치)이 들어있다.
		 	- 기본형 변수(소문자로 시작하는 타입의 변수)에는 값이 들어있다.
		*/
		int num1 = 10;
		int num2 = num1;
		
		num2 = 99;
		
		System.out.println(num1);
		
		// scores2를 수정했는데 scores1이 변한다.
		int[] scores1 = {30, 60, 77, 80, 25};
		int[] scores2 = scores1; // 집은 하나고 주소만 2개인 경우가 된다. 
		
		scores2[0] = 99; // 주소지에 찾아가 수정
		
		System.out.println(Arrays.toString(scores1)); // 주소지에 가서 내용을 출력하므로
		
		
		// n차원 배열은 n중 반복문을 사용해 모든 요소를 탐색할 수 있다.
		boolean[][] ezenLicenseList = {
				{true, true, false, true, false, false},
				{false, true, false, true},
				{true, true, true, true, true, true, true, true}
		};
		
		System.out.println(ezenLicenseList.length);
		System.out.println(ezenLicenseList[0].length);
		System.out.println(ezenLicenseList[1].length);
		System.out.println(ezenLicenseList[2].length);
		
		for (int i = 0; i < ezenLicenseList.length; ++i) {
			System.out.printf("#### %d번째 반 ####\n", i);
			for (int j = 0; j < ezenLicenseList[i].length; ++j) {
				System.out.printf("%d번째 사람: %s\n", j, ezenLicenseList[i][j]);
			}				
		}
		
		
	}

}
