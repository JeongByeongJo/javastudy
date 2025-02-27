

public class B08_CharAt {
	
	/*
	 	# "문자열".charAt(숫자);
	 	
	 	- 해당 문자열에서 원하는 번째의 문자를 char 타입으로 꺼내오는 메서드
	 	- 시작 인덱스는 0이다.
	 	- 마지막 글자는 문자 개수 -1 이다.
	 	
	 	# "문자열".length();
	 	
	 	- 해당 문자열의 전체 문자 개수(길이)를 알려주는 메서드
	 	- 해당 문자열의 길이를 int 타입으로 알려준다.
	 */
	public static void main(String[] args) {
		Math.pow(2, 2); //앞에 코드와 관계없이 작동하는 것이 함수
		
		"Happy".charAt(2); // 앞에 코드에 따라 결과값이 달라지는 것이 메서드
		"안녕하세요".charAt(2);
		System.out.println("안녕하세요".charAt(4));
				
		System.out.println("Happy Birthday!!");
		System.out.println("Happy Birthday!!".charAt(0));
		
		System.out.println("Happy Birthday!!".length());
		System.out.println("Happy Birthday!!".charAt(15));
		
		
		String str = "Merry Christmas~~!!";
				
//		System.out.print(str.charAt(3));
//		System.out.print(str.charAt(4));
//		System.out.print(str.charAt(5));
//		System.out.print(str.charAt(6));
//		System.out.print(str.charAt(7));
//		System.out.print(str.charAt(8));
		
		// 반복문과 index를 함께 활용하여 문자열의 일부를 활용할 수 있다.
		for (int i = 3; i <= 8; ++i) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
	}

}
