package quiz;

public class A03_TypeQuiz {

	public static void main(String args[]) {

		String category1 = "이름";
		String category2 = "나이";
		String category3 = "Tel";
		String category4 = "키";
		String category5 = "몸무게";
		String category6 = "혈액형";

		String str = "\t: ";

		String name1 = "홍길동";
		int age1 = 20;
		String phone1 = "010-1234-1234";
		double height1 = 178.5;
		double weight1 = 75.0;
		String bldtype1 = "O"; // AB형은 char타입에 저장할 수 없으므로 String을 써야 한다.

		System.out.println(category1 + str + name1);
		System.out.println(category2 + str + age1);
		System.out.println(category3 + str + phone1);
		System.out.println(category4 + str + height1);
		System.out.println(category5 + str + weight1);
		System.out.println(category6 + str + bldtype1);
	}

}
