
public class A06_Print {
	/*
	   # 콘솔에 출력하는 함수들
	   
	   1. println()
	   
	     - ()안에 전달한 데이터를 콘솔에 출력한다.
	     - 출력 후에 줄을 자동으로 바꿔준다 (출력의 맨 마지막에 \n을 추가한다)
	     - 아무것도 전달하지 않으면 줄만 바꿔준다.
	   
	   2. print()
	   
	     - ()안에 전달한 데이터를 콘솔에 출력한다.
	     - 아무것도 전달하지 않으면 사용할 수 없다.(에러)
	   
	   3. printf()
	   
	     - print format
	     - 서식을 사용해 데이터를 원하는 모양으로 출력할 수 있는 함수
	     - 출력하고 싶은 문자열의 형식을 먼저 지정한 후
	       데이터가 들어가야 하는 자리에 데이터를 순서대로 채워서 사용한다.
	     - printf()는 줄을 자동으로 바꿔주지 않기 때문에 주의해야 한다.
	     
	     * printf()에 사용할 수 있는 서식 문자의 종류
	     
	       %d : 해당 자리에 전달한 정수값을 10진수로 출력
	       %o : 해당 자리에 전달한 정수값을 8진수로 출력
	       %x : 해당 자리에 전달한 정수값을 16진수로 출력 (%X는 대문자)
	       %f : 실수 자리
	       %s : 문자열 자리
	       %c : 문자 자리
	       %% : 그냥 %를 출력하고 싶은 경우 (서식문자의 Escape)
	       
	     * 서식 문자 옵션 - 서식문자의 %와 문자 사이에 넣어서 사용
	     
	       %숫자d : 해당 숫자만큼 자릿수를 확보하면서 출력
	       %-숫자d : 해당 숫자만큼 자릿수를 확보한 후 왼쪽 정렬하여 출력
	       %0숫자d : 숫자만큼 자릿수를 확보한 후 빈자리에 0을 채워서 출력
	       %+d : 해당 숫자가 양수인 경우에도 양의부호 출력
	       %.숫자f : 실수의 소수점 아래 자릿수를 설정하여 출력(반올림)
	     
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		
		System.out.print("Hello!");
		System.out.print("Hello!");
		System.out.print("Hello!");
		System.out.print("Hello!");
		System.out.print("Hello!");
		System.out.println();
		
		int year = 2024;
		int month = 12;
		int date = 20;
		int hour = 10;
		int minute = 44;
		int second = 50;
		
		System.out.println("현재시간 - " + year + "년 " + month + "월 "
				+ date + "일 " + hour + ":" + minute + ":" + second);
		
		System.out.printf("현재시간 - %d년 %d월 %d일 %d:%d:%d\n",
				year, month, date, hour, minute, second); // 순서에 맞춰 변수 입력, 앞에 %d의 갯수와 뒤에 변수 갯수가 동일해야한다.
		
		System.out.printf("333(10): %d\n", 333);
		System.out.printf("333(8): %o\n", 333);
		System.out.printf("333(16): %x\n", 333);
		System.out.printf("333(16): %X\n", 333);
		
		System.out.printf("이름: %s\n", "홍길동");
		System.out.printf("키: %.1f\n", 178.5);
		System.out.printf("등급: %c\n", 'A');
		
		System.out.println("┌──────────┬─────┬───────────────┐");
		System.out.printf("|%-10s|%-5s|%-15s|\n", "name", "age", "phone");
		System.out.println("└──────────┴─────┴───────────────┘");
		
		System.out.printf("%02d층\n", 3);
		System.out.printf("%02d층\n", 7);
		System.out.printf("%02d층\n", 15);
		System.out.printf("%02d층\n", 27);
		
		System.out.printf("오늘의 온도는 %+3d℃입니다.\n", -5); System.out.printf("오늘의 온도는 %+03d℃입니다.\n", -5);
		System.out.printf("오늘의 온도는 %+d℃입니다.\n", 15);
		
		System.out.printf("%.2fkg\n", 53.555);
		System.out.printf("%.2fkg\n", 53.551);
	}
		
}
