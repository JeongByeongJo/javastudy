
public class B03_Operator2 {
	
	/*
	 	# 비교 연산자
	 	
	 	- 두 값의 크기를 비교하는 연산자들
	 	- 비교 연산의 결과는 항상 참(true) 또는 거짓(false)이다.
	 	- 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 처리한다.
	 	
	 	# 논리 연산자
	 	
	 	- 두 boolean 값으로 연산하는 연산자
	 	- && : 두 값이 모두 true일 때 true (AND)
	 	- || : 두 값 중 하나만 true여도 true (OR)
	 	- ! : true면 false, false면 true (NOT)
	 */
	public static void main(String[] args) {
		int a = 27, b = -10;
		
		System.out.println(a > b); // > : 왼쪽이 크면 true
		System.out.println(a < b); // < : 오른쪽이 크면 true
		System.out.println(a >= b); // >= : 왼쪽이 크거나 같으면 true
		System.out.println(a <= b); // <= : 오른쪽이 크거나 같으면 true
 		System.out.println(a == b); // == : 두 값이 같으면 true
 		System.out.println(a != b); // != : 두 값이 다르면 true
 		 		
 		// 산술 연산을 비교 연산보다 먼저 진행하기 때문에 굳이 소괄호가 필요 없다.
 		System.out.println(a + b > a * b);
		
 		// System.out.println(10 < a <30); 앞에 10<a -> true, 뒤가 true<30 이라서 에러 
 		System.out.println("#### AND 연산 ####");
 		System.out.println(true && true);
 		System.out.println(true && false);
 		System.out.println(false && true);
 		System.out.println(false && false);
 		
 		System.out.println("#### OR 연산 ####");
 		System.out.println(true || true);
 		System.out.println(true || false);
 		System.out.println(false || true);
 		System.out.println(false || false);
 		
 		System.out.println("#### NOT 연산 ####");
 		System.out.println("!true: " + !true);
 		System.out.println("!false: " + !false);
 		
 		System.out.println();
 		a = -9;
 		
 		// ex> a가 10보다 큰 수인가요?
 		System.out.println(a > 10);
 		
 		// ex> a가 10보다 크고 30보다 작은 수 인가요?
 		System.out.println(a > 10 && a < 30);
	}

}
