package quiz;

public class A02_SwapValue {

	public static void main(String[] args) {

		int a = 17;
		int b = 105;

		System.out.println("a에 원래 보관된 값: " + a);
		System.out.println("b에 원래 보관된 값: " + b);

		// 이곳에 코드를 추가하여 두 변수의 값을 서로 교환하여 출력해보세요
		// (다른 곳에 코드는 변경 불가능, 나중에 숫자를 바꾸더라도 올바르게 동작해야 함)

		// a의 값이 사라지느 ㄴ것을 대비해 새로운 변수를 선언하고 담아놓는다
		int backup = a;

		// a에는 b에 들어있던 값을 넣는다
		a = b;
		// b에는 backup에 들어있던 값을 넣는다
		b = backup;

		////////////////////////////////////////////////////

		System.out.println("교환 후 a에 보관된 값: " + a);
		System.out.println("교환 후 b에 보관된 값: " + b);

	}

}
