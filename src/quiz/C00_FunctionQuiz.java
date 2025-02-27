package quiz;

import java.util.Arrays;

public class C00_FunctionQuiz {
	/*
	 	# 다음 함수를 정의하고 올바르게 동작하는지 테스트 해보세요.
	 	
	 	1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	 	2. 전달한 문자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	3. 숫자를 하나 전달하면 문자열 "짝수입니다." 또는 "홀수입니다"를 반환하는 함수
	 	4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	 	5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	 	6. 메세지와 횟수를 전달하면 해당 메시지를 전달한 횟수만큼 반복하는 함수	 	
	*/
	
	//1.	
	public static boolean capitalAlphabet(char ch) {
		if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ) {
			return true;
		} else {
			return false;
		}
	}
	
	//2.
	public static boolean threeTimes(int i) {
		if (i % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//3.
	public static String oddEven(int i) {
		if (i % 2 == 0) {
			return "짝수입니다.";
		} else {
			return "홀수입니다.";
		}
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] aliquot(int i) {
		int count = 0;
		for (int j = 1; j <= i; ++j) {
			if(i % j == 0) {
				++count;
			}
		}
		int[] aquot = new int[count];
		int k = 0;
		for (int j = 1; j <= i; ++j) {
			if(i % j == 0) {
				aquot[k++] = j;			
			}
		}
		return aquot;
	}
	
	//5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean primeNum(int i) {
		int count = 0;
		for (int j = 2; j < i; ++j) {
			if (i % j == 0) {
				++count;
			}
		} 
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//6. 메세지와 횟수를 전달하면 해당 메시지를 전달한 횟수만큼 반복하는 함수
	public static void repeatMsg(String msg, int i) {
		for(int j = 0; j < i; ++j) {
			System.out.print(msg);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		//1.
		System.out.println(capitalAlphabet('d'));
		
		//2.
		System.out.println(threeTimes(6));
		
		//3.
		System.out.println(oddEven(9));
		
		//4.
		System.out.println(Arrays.toString(aliquot(3)));
		
		//5.
		System.out.println(primeNum(67));
		
		//6. 
		repeatMsg("아이고", 2);
		
		System.out.println(isPrime(12));
		
		// return 타입이 boolean인 함수는 조건 자리에 사용될 수 있다.
		if (isPrime(15)) {
			System.out.println("소수입니다.");			
		} else {
			System.out.println("소수가 아닙니다.");
		}

	}
	
	// 선생님 풀이
	//1.	
	public static boolean isAlphabet(char ch) {
		return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z';
	}
	
	//2.
	public static boolean isMul3(int num) {
		return num % 3 == 0;			
	}
	
//3.
	public static String evenOdd(int num) {
		if (num % 2 == 0) {
			return "짝수입니다.";
		} else {
			return "홀수입니다.";
		}
	}
	
	// 4. 숫자를 전달하면 해당 숫자의 모든 약수를 int[]로 반환하는 함수
	public static int[] getDivisors(int num) {
		if (num <0) {
			num = Math.abs(num);
		}
		
		int count = 0;
		
		for (int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				++count;
			}
		}
		
		int[] divisors = new int[count];
		int index = 0;
		for (int i = 1; i <= num; ++i) {
			if(num % i == 0) {
				// ++이 뒤에 붙었으므로 대입 이후에 값이 증가함
				divisors[index++] = i;			
			}
		}
		
		return divisors;
	}
	
	//5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean isPrime(int num) {
		double root = Math.sqrt(num);
		for (int i = 2; i < root; ++i) {
			if (num % i == 0) {
				return false;				
			}
		}
		return true;
	}
	
	//6. 메세지와 횟수를 전달하면 해당 메시지를 전달한 횟수만큼 반복하는 함수
	public static void repeatMessage(String message, int repeat) {
		for(int i = 0; i < repeat; ++i) {
			System.out.print(message);
		}
		System.out.println();
	}

}
