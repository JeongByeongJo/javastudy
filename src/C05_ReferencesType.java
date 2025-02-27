
public class C05_ReferencesType {
	/*
		# 기본형 데이터 타입 (primitive)
		
		- 소문자로 시작하는 타입들
		  (int, float, double, boolean, byte, ...)
		- 기본형 데이터 타입 변수에는 실제 값이 저장된다.
		- 기본형 데이터 타입에는 .을 찍어 사용할 수 없다.
		
		
		# 참조형 데이터 타입 (references)
		
		- String
		- 배열
		- 그 외 모든 클래스들
		- 참조형 데이터 타입 변수에는 인스턴스를 가리키는 주소값이 저장된다.
		- 참조형 변수에는 .을 찍어 변수에 저장된 주소를 참조할 수 있다.
		
		# null
		
		- 참조형 변수가 현재 가리키는 것이 없다는 것을 표현하기 위한 값
		- 참조형 변수를 초기화하는 용도로 많이 사용된다.
	*/
	public static void method1(int num) {
		num = 100;
	}
	
	public static void method2(Book book) {
		//book = new Book();  // <- 이거 하면 5000은 새로운 주소로 간다.
		book.price = 5000;
	}
	
	public static void method3(String str) {
		// String은 book처럼 .찍고 변화시킬 만한 필드가 없다.
		str = "아메리카노"; //"아메리카노" =  new String("아메리카노") -> 편히 쓰라고 줄여준거다.
		str = new String("김밥");
	}
	public static void method4(int[] arr) {
		arr[3] = 9;
	}
	
	
	public static void main(String[] args) {
		// 기본형의 경우 메서드의 매개변수에 값 5를 전달한다.
		int num = 5;		
		method1(num);
		System.out.println("num: " + num);
		
		// 참조형의 경우 메서드의 매개변수에 
		// book에 저장되어 있던 값인 인스턴스 주소를 전달한다.
		Book book = new Book();		
		book.price = 2000;
		method2(book);
		System.out.println("book.price: " + book.price);
		
		// 문자열
		String str = "아이스티";
		method3(str);
		System.out.println("str: " + str);
		
		// 배열
		int[] arr = new int[10];
		method4(arr);
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
		
		Book[] books = new Book[10];
		
		books[0] = new Book();
		
		System.out.println(books[0]);
		System.out.println(books[1]);
		System.out.println(books[2]);
		
	}

}
