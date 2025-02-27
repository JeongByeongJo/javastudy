
public class C01_FunctionOverloading {
	/*
		# 함수 오버로딩
		
		- 같은 이름의 함수를 다양한 버전으로 여러개 만드는 것
		- 같은 이름으로 다른 버전이 되기 위해서는
		  **매개변수의 개수 또는 타입이 달라야 한다.**
		- 함수의 리턴타입이 다른것만으로는 다른 버전으로 인정되지 않는다.
	*/
	public static int add(int num) {
		return num + 10;
	}
	
	// 리턴타입만으로는 오버로딩이 불가능하다.
//	public static float add(int num) {  
//		return num + 10;
//	}	
	
	public static double add(double num) {
		return num + 33.33;		
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}	
	
	public static void main(String[] args) {
		System.out.println(add(123));
		System.out.println(add(123.00));
		System.out.println(add(10,15));
		
	}

}
