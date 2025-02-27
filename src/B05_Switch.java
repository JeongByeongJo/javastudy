
public class B05_Switch {
	
	/*
	 	# switch-case문
	 	
	 	- ()안의 값에 따라 실행할 코드를 결정하는 문법	 	(괄호안에 boolean은 못들어간다.:true, false 두가지밖에 없어서)
	 	- ()안의 값과 정확하게 일치하는 case에 적힌 코드를 실행하게 된다
	 	- 해당하는 case가 없는 경우 default에 적힌 코드를 실행한다.
	 	- if문으로 완벽하게 대체가 가능한 문법이기에 자주 사용되지는 않는다.
	 	- break를 적지 않으면 break를 만날때까지 밑에 있는 모든 코드를 전부 실행한다.
	 	
	 */
	public static void main(String[] args) {
		int num = 0;
		
		switch (num) {
			case 0:
				System.out.println("Hello!");
				break;
			case 1:
				System.out.println("안녕하세요.");
				break;
			case 2:
				System.out.println("니하오~!");
			case 3:
				System.out.println("곤니찌와~!!");
			default:
				System.out.println("잘못된 설정입니다.");
				break;
		}
		
		int a = 20, b = 17;
		char cmd = '*';
		
		switch (cmd) {
			case '+':
				System.out.println("a + b = " + (a + b));
				break;
			case '-':
				System.out.println("a - b = " + (a - b));
				break;
			case 'x', '*': // 쉼표로 케이스 여러개 적는 기능은 근래에 생겼다.
				System.out.println("a x b = " + (a * b));
				break;			
		}
		
		String cmd2 = "exit";
		
		switch (cmd2) {
		case "quit": case "exit": case "q": case "Q":
			System.out.println("종료 명령어를 받았습니다.");
			break;
		}	
		
		
	}

}
