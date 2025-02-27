
public class B09_BreakContinue {
	/*
	 	# break
	 	
	 	- switch-case문 내부에서 해당 case를 탈출하기 위해 사용
	 	- 반복문 내부에서 해당 반복문을 탈출하기 위해 사용	
	 	
	 	# continue
	 	
	 	- 반복문 내부에서 continue를 만나면
	 	  아래에 남은 코드를 실행하지 않고 즉시 다음번 반복으로 넘어간다.
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 100; ++i) {
			System.out.println(i);
			
			if (i == 50) {
				break;				
			}
		}
		
		System.out.println("-----------------------------");
		
		for (int i = 0; i <100; ++i) {
			if(i % 2 == 0 ) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}
