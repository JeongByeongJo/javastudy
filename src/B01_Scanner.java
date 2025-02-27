import java.util.Scanner;

public class B01_Scanner {
	
	/*
		# java.util.Scanner 클래스
		
		- 사용자로부터 프로그램으로 입력을 받을 수 있는 여러 기능들이 모여있는 클래스
	    - 새 스캐너를 생성한 후 해당 스캐너에 내장되어있는 기능을 사용해 입력을 받을 수 있다.
	    - 새 스캐너를 생성할 때 어느곳으로부터 입력을 받을지 설정할 수 있다.
	    
	      System : 현재 운영체제의 콘솔
	      System.out : 현재 운영체제의 콘솔로 데이터를 내보낼수 있는 통로
	      System.in : 현재 운영체제의 콘솔로부터 데이터를 받아오는 통로
	      
	    # 생성된 스캐너에 내장되어있는 기능들
	    
	      (1) nextInt() : 입력통로에 있는 정수를 하나 꺼낸다. // 여러 숫자 입력이 가능하며, 그 중 가장 앞 숫자만 꺼낸다.
	          입력통로에 아무것도 없으면 입력을 기다린다. 
	          
	      (2) next다른타입() : 입력통로에 있는 해당 타입 값를 꺼낸다.
	          입력통로에 아무것도 없으면 입력을 기다린다.
	          String타입과 char타입은 없다. 
	          
	      (3) next() : 한 단어 단위로 입력 통로에 있는 값을 문자열 형태로 꺼낸다.
	      	  (공백, \t, \n 을 기준으로 한 단어를 구분한다.)
	          입력통로에 아무것도 없으면 입력을 기다린다.
	       
	      (4) nextLine() : 한 줄 단위로 입력 통로에 있는 값을 문자열 형태로 꺼낸다.
	      	  (\n을 만나기 전까지의 모든 내용을 한번에 꺼내버린다.)
	      	  입력통로에 아무것도 없으면 입력을 기다린다.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Ctrl + Shift + o
		
//		System.out.print("아무거나 신나게 입력해보세요 >> ");
//		String line = sc.nextLine();
//		
//		System.out.println(line);
		
//		System.out.print("아무거나 신나게 입력해보세요 >> ");
//		String word1 = sc.next();
//		String word2 = sc.next();
//		String word3 = sc.next();
//		
//		System.out.println(word1);
//		System.out.println(word2);
//		System.out.println(word3);
				
			
		// Ctrl + / : 블록 지정한 범위의 코드들을 한번에 주석처리 및 해제
		System.out.print("int 범위의 정수를 입력해주세요 >> \n");
		int a = sc.nextInt(); // 여러 숫자 입력이 가능하며, 그 중 가장 앞 숫자만 꺼낸다.
			
		String trash = sc.nextLine();
		System.out.println("숫자 하나 꺼내고 남은 찌꺼기들: " + trash);
		
		System.out.print("short 범위의 정수를 입력해주세요 >> \n");
		short b = sc.nextShort();
				
		String trash1 = sc.nextLine();
		System.out.println("숫자 하나 꺼내고 남은 찌꺼기들: " + trash1);
		
		System.out.print("byte 범위의 정수를 입력해주세요 >> \n");
		byte c = sc.nextByte();
			
		String trash2 = sc.nextLine();
		System.out.println("숫자 하나 꺼내고 남은 찌꺼기들: " + trash2);
		System.out.print("float 범위의 정수를 입력해주세요 >> \n");
		float d = sc.nextFloat();
				
		String trash3 = sc.nextLine();
		System.out.println("숫자 하나 꺼내고 남은 찌꺼기들: " + trash3);
		System.out.print("double 범위의 정수를 입력해주세요 >> \n");
		double e = sc.nextDouble();
		String trash4 = sc.nextLine();
		System.out.println("숫자 하나 꺼내고 남은 찌꺼기들: " + trash4);
		
		System.out.printf("입력하신 숫자의 모든 합은 %.3f입니다.\n", a + b + c + d + e);
				
		System.out.printf("입력하신 숫자는 \"%d\"입니다.\n", a);
		System.out.printf("입력하신 숫자는 \"%d\"입니다.\n", b);
		System.out.printf("입력하신 숫자는 \"%d\"입니다.\n", c);
		System.out.printf("입력하신 숫자는 \".3%f\"입니다.\n", d);
		System.out.printf("입력하신 숫자는 \".3%f\"입니다.\n", e);
		
	}

}
