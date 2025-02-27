package myobj;

public class TrumphCard {
	char shape;
	int num;
	
	// 모든 인스턴스에서 참조해야하는 역할을 지닌 경우 static이 어울린다.
	static String[] displayNum = 
		{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	// 카드의 너비와 높이는 모든 카드에서 같은 값을 지녀야 하므로
	// 인스턴스 영역으로 선언하면 용량이 아깝다.
	public static int width = 80;		// 너비
	public static int height = 200;	// 높이
	
	public TrumphCard(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	// static 메서드에서는 인스턴스값을 사용할 수 없다.
	public static void printCardSize() {
		System.out.printf("카드의 너비/높이: %d/%d\n", width, height);
		//System.out.printf("카드의 모양: %c\n", shape);			// 안되
		//System.out.printf("카드의 모양: %c\n", this.shape);	// 안되
	}
	
	public void print() {
		System.out.printf("[%c%s]\n", shape, displayNum[num]);
	}
}
