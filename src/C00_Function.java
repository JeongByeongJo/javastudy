
public class C00_Function {
	/*
		# 함수 (Function)
		
		- 기능을 미리 정의해두고 나중에 불러서 사용하는 것
		- 함수는 미리 정의만 해둔 것이기 때문에 어딘가에서 호출하지 않는다면
		  아무것도 실행되지 않는다.
		  
		# 함수의 리턴 타입
		
		 - 함수의 이름 앖에 붙이는 타입은 해당 함수를 호출하고 난 후에
		   반환되는 값으 타입을 의미한다.
		 - void : 아무것도 리턴하지 않음
		 - int : 이 함수를 실행한 후에는 반드시 int값이 반환된다.
		 - String : 이 함수를 실행한 후에는 반드시 String값이 반환된다.
		 - ...(그 외 다른 모든 타입들도 마찬가지다)
		 
		 # 함수의 매개변수 (Parameter)
		 
		 - 함수를 호출할 때 함수에 원하는 값을 전달하기 위해 만들어 두는 변수
		 - 호출하면서 ()에 값을 순서대로 매개변수에 전달해야 하고,
		   이 때 순서대로 전달하는 값을 인자(Argument)라고 부른다.
		 - 매개변수의 개수와 타입의 제한이 없다.
		 - 인자가 가변적일때 ...을 활용하면 1개 이상의 인자를 받을 수 있다.
		 - 가변인자는 매개변수의 맨 뒤에만 사용할 수 있다.(printf도 가변인자를 가진 함수다(앞엔 String, 뒤엔 여러개 요소)
		 
		 # return
		 
		 - void 타입이 아닌 함수에서는 반드시 실행되어야 한다.
		 - 함수 내에서 return을 만나는 즉시 해당 함수를 종료하고
		   해당 함수를 호출한 곳으로 값을 보낸다.
	*/
	
	public static void rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >♡");
	}
	
	// void타입 이외의 함수들은 반드시 값을 return(반환)해야 한다.
	public static int abc() {
		rabbit();
		System.out.println("abc함수입니다~");
		return -1; // return: 실행중인 함수를 즉시 종료하고 해당 값을 반환한다.(리턴 밑에 코드는 실행되지 않는다.)
	}
	
	// 함수에서는 매개 변수를 활용해 기능을 미리 구현해 둘 수 있다.
	public static void isAdult(int age) {
		System.out.printf("나이: %d\n", age);
		
		if (age >= 19) {
			System.out.println("성인입니다.");			
		} else {
			System.out.println("미성년자입니다.");
		}
	}	
	
	public static void calcAge(int birthYear) {
		System.out.println("태어난 해: " + birthYear);
		System.out.println("나이: " + (2025 - birthYear + 1));
	}
	
	public static boolean passExam(int a, int b, int c, int d, int e) {
		if (a < 60 || b < 60 || c < 60 || d < 60 || e < 60) {
			System.out.println("[System] 과락하셨습니다...");
			return false;
		} else {
			System.out.println("[System] 합격하셨습니다!!");
			return true;
		}
	}
	
	public static void repeat(char ch, int times) {
		for (int i = 0; i < times; ++i) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	// 몇 개의 숫자가 오더라도 평균을 내주는 함수
	// ...매개변수는 몇 개 올지 모르는 인자 값들을 배열에 담아놓는다. 
	public static double makeAvg(int... nums) {
		int len = nums.length;
		int sum = 0;
		for (int i = 0; i < len; ++i) {
			sum += nums[i];
		}
		return sum / (double) len;
	}
	
	public static void main(String[] args) {
		System.out.println("메인함수!");
		
		// 함수는 크게 두 가지 종류가 있다.
		// 실행하고 값이 그 자리에 돌아오는 함수와
		// 실행하고 값이 그 자리에 돌아오지 않는 함수
		long n = Math.round(10.55);
		//String s = System.out.println("바보");
		
		int a = abc();		
		abc();
		System.out.println(a);
		System.out.println(abc());
		
		isAdult(33);
		isAdult(7);		
		
		for (int y = 1950; y <= 2025; ++y) {
			calcAge(y);
		}
		
		passExam(70, 77, 90, 65, 60);
		
		repeat('=', 20);
		repeat('+', 30);
		
		double avg = makeAvg(5, 6, 1, 30);
		
		System.out.println(avg);
		
		// 가변인자를 사용하는 함수의 대표적인 예
		System.out.printf("%d %d %d printf\n", 1, 2, 3, 4, 5, 6);
	}

}
