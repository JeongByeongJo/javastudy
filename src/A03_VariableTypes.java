
public class A03_VariableTypes {

	/*
	 * # 정수 타입
	 * 
	 * - byte (1byte, 8bit)
	 * 
	 * 2^8(256)가지의 값을 표현할 수 있다. byte타입 변수의 정수는 -128 ~ 127(256가지) (양수는 0이 포함되어있으므로
	 * 하나가 적다)
	 * 
	 * - short (2byte, 16bit)
	 * 
	 * 2^16(65536)가지의 값을 표현할 수 있다. short타입 변수의 정수는 -32768 ~ 32767(65536가지)
	 * 
	 * - char (unsigned 2byte, 16bit) (부호가 없는 2바이트)
	 * 
	 * 2^16(65536)가지의 값을 표현할 수 있다. char타입은 첫 번째 비트를 부호 비트로 사용하지 않기 때문에 0~65535까지의
	 * 정수를 표현할 수 있다.(65536가지)
	 * 
	 * - int (4byte, 32bit)
	 * 
	 * 2^32(4294967296)가지의 값을 표현할 수 있다. int타입 변수의 정수는 -2147483648 ~
	 * 2147483647(4294967296가지)
	 * 
	 * - long (8byte, 64bit)
	 * 
	 * 2^64(18446744073709551616)가지의 값을 표현할 수 있다. long타입 변수의 정수는
	 * -9223372036854775808 ~ 9223372036854775807(18446744073709551616가지)
	 * 
	 * # 실수 타입
	 * 
	 * - float (4byte) - double (8byte)
	 * 
	 * # 참/거짓 타입
	 * 
	 * - boolean : true 또는 false를 저장할 수 있는 변수 타입
	 * 
	 * # 참조형 타입
	 * 
	 * - String 문자열 - 그 외 모든 타입(모든 클래스, 객체지향 관련 내용)
	 */

	public static void main(String[] args) {
		byte b1 = -128, b2 = 127;

		System.out.println("byte타입 변수에 담을 수 있는 가장 작은 값은 " + b1 + "이고, 가장 큰 값은 " + b2 + "입니다.");

		short s1 = -32768;
		short s2 = 32767;

		System.out.println("short타입 변수에 담을 수 있는 가장 작은 값은 " + s1 + "이고, 가장 큰 값은 " + s2 + "입니다.");

		// 숫자가 너무 길면 쉼표 대신 _를 사용해 자릿수를 쉽게 파악할 수 있다.
		int i1 = -2_147_483_648;
		int i2 = 2_147_483_647;

		System.out.println("int타입 변수에 담을 수 있는 가장 작은 값은 " + i1 + "이고, 가장 큰 값은 " + i2 + "입니다.");

		// int의 범위를 벗어나는 숫자값을 적을 땐 뒤에 L을 붙여야 한다.
		long l1 = -9223372036854775808L;
		long l2 = 9223372036854775807L;

		System.out.println("long타입 변수에 담을 수 있는 가장 작은 값은 " + l1 + "이고, 가장 큰 값은 " + l2 + "입니다.");

		// char타입에는 단순 숫자를 보관하는 것이 아니라
		// 0 ~ 65535의 문자 코드를 정수 타입으로 보관사는 것이다.
		// 이 때 0 ~ 127번 까지의 문자 코드를 아스키(ascii)코드라고 부른다.
		char ch1 = 65;
		char ch2 = 66;
		char ch3 = 67;
		char ch4 = 45000;

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);

		// c1 ~ c6번에 알맞은 값을 넣어 Hello!라고 출력되게 만들어보세요

		char c1 = 72;
		char c2 = 'e'; // 문자 타입값은 사실 정수값이었다.
		char c3 = 'l';
		char c4 = 'l';
		char c5 = 'o';
		char c6 = '!';

		System.out.println("" + c1 + c2 + c3 + c4 + c5 + c6);

		double b = 123.123456789123456789123456789;

		// float 타입에 값을 넣을 때는 뒤에 F를 붙여야 한다
		float f = 123.1234F;

		System.out.println(b);
		System.out.println(f);

		boolean wearGlasses = false;
		boolean ateLunch = true;
		boolean boostOn = true;

		System.out.println("안경유무: " + wearGlasses);
		System.out.println("점심식사여부: " + ateLunch);
		System.out.println("달리기중인가? " + boostOn);

		String msg = "안녕하세요";

		System.out.println(msg);
	}

}
