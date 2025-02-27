
public class A05_TypeCasting {
	/*
	 * # 변수 타입들의 크기 순서
	 * 
	 * - byte < short,char < int < long - float < double - 실수는 크기와 상관없이 정수보다 크다고
	 * 간주한다. (*소수점이 있어서)
	 * 
	 * # 타입 캐스팅
	 * 
	 * - 크기가 더 큰 변수 타입에 더 작은 크기의 값을 넣을 때는 아무런 조치 없이 타입이 자동으로 변환된다.(자연스러운 타입 캐스팅)
	 * 
	 * - 자연스러운 타입 캐스팅은 타입 캐스팅 명시를 생략할 수 있다.
	 * 
	 * - 크키가 더 작은 변수 타입에 더 큰 크기의 값을 넣을때는 타입을 강제로 변환시켜야 값을 넣을 수 있다(강제적인 타입 캐스팅)
	 * 
	 * - 해당 타입 캐스팅을 명시하는 개발자는 해당 값이 손상될 우려가 있음을 정확하게 인지하고 있어야 한다.
	 */
	public static void main(String[] args) {
		long l1 = 30000000000000L;
		byte b1 = 127;
		char c1 = '꿈';

		double d1 = 123.123456;
		float f1 = 123.1234F;

		l1 = b1; // 자연스러운 타입 캐스팅 발생 (타입캐스팅 명시 생략 가능)
		l1 = c1; // 자연스러운 타입 캐스팅 발생 (타입캐스팅 명시 생략 가능)
		d1 = f1; // 자연스러운 타입 캐스팅 발생 (타입캐스팅 명시 생략 가능)
		f1 = l1; // 자연스러운 타입 캐스팅 발생 (타입캐스팅 명시 생략 가능)

		System.out.println(l1);
		System.out.println(f1);

		byte b2 = 0;
		int i2 = 30000;
		double d2 = 3.33333;

		b2 = (byte) i2; // 강제적인 타입 캐스팅 (30000을 byte 안에 꾸겨넣음)
		i2 = (int) d2; // 강제적인 타입 캐스팅 (3.33333을 int에 넣기 위해 소수점 아래 삭제)

		// 0000 0000 0000 0000 0111 0101 0011 0000 : int 30000

		System.out.println(b2);
		System.out.println(i2);

		// 같은 2byte지만 short와 char는 서로 강제적 타입 캐스팅이 필요하다.
		short s3 = -32000;
		char c3 = '값';

		// -32000은 이진법으로 바꾸면 몇일까요?
		// 1000 0011 0000 0000 -> char 타입으로 해석되면 33536

		c3 = (char) s3;
		System.out.println(c3);
		System.out.println((int) c3);

		// s3 =(short)c3;
		// System.out.println(s3);

		// char타입 값을 정수 타입으로 변환하면 해당 문자의 코드값을 확일할 수 있다.
		char c4 = '꽥';
		int i4 = c4;

		System.out.println("문자 '" + c4 + "'의 문자코드: " + i4);
		System.out.println("문자 '" + c4 + "'의 문자코드: " + (int) c4);

		// 정수값을 char 타입으로 변환하면 해당 정수의 문자 모양을 확인할 수 있다.
		int i5 = 87;
		char c5 = (char) i5;

		System.out.println(c5);
		System.out.println((char) i5);
		System.out.println((char) 45000);

		// 실수값의 소수점 아래를 삭제하고 싶은 경우 정수로 타입캐스팅하는 방식을 자주 사용한다.
		System.out.println((byte) 123.123);
		System.out.println((byte) 2250.123);
		System.out.println((short) 2250.123);
		System.out.println((int) 54546.123);
	}
}
