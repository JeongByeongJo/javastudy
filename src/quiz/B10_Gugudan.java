package quiz;

public class B10_Gugudan {
	/*
	 	1. 구구단을 다음과 같이 가로로 출력해보세요.
	 	
	 	2단: 2x1=2 2x2=4 ...
	 	3단: 3x1=3 3x2=6 ...
	 	4단: ...
	 	
	 	2. 구구단을 다음과 같이 세로로 출력해보세요.
	 	
	 	2단		3단		4단		...
	 	2x1=2	3x1=3	4x1=4	...
	 	2x2=4	3x2=6	4x2=8	...
	 */
	public static void main(String[] args) {
		
		//1.
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단: ", dan);
			
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%2d ", dan, gop, dan*gop);				
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------------");
		
		//2.
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d단\t", dan);
		}
		System.out.println();
		for(int gop = 1; gop <= 9; ++gop) {
			for(int dan = 2; dan <= 9; ++dan)
				System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("**선생님 풀이**");
		// 선생님 풀이
		//1.
		for (int dan = 2; dan <= 9; ++dan) {
			// 줄의 시작
			System.out.printf("%d단: ", dan);
			
			for(int gop = 1; gop <= 9; ++gop) {
				System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);				
			}
			System.out.println();
			// 줄의 끝
		}
		//2.
		for (int line = 0; line <= 9; ++line) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (line == 0) {
					System.out.printf("%d단\t\t", dan);
				} else {
					System.out.printf("%d x %d = %d\t", dan, line, dan * line);					
				}
			}
			System.out.println();			
		}
		
	} //main

}
