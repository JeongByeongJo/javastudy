package myobj.pirate;

import java.util.Random;

public class Barrel {
	Random ran = new Random();
	
	int size;
	int numOfLaunch;
	char[] holes;
	
	/**
	 * 
	 * 통이 기본 크기로 생성됨(기본 20)
	 */
	public Barrel() {
		this(20); // 이 클래스의 다른 생성자 이용
	}
	
	public Barrel(int size) {
		this.size = size;
		numOfLaunch = size / 5;
		holes = new char[size];
		reset();
	}
	
	// 통을 초기 상태로 되돌리는 메서드
	public void reset() {
		for(int i = 0; i < size; ++i) {
			if (i < numOfLaunch) {
				holes[i] = 'X'; // 'X' 발사				
			} else {
				holes[i] = 'O'; // 'O' 생존
			}
		}
		
		for(int i = 0; i < 100; ++i) {
			int ranIndex = ran.nextInt(size);
			int ranIndex2 = ran.nextInt(size);
			
			char temp = holes[ranIndex2];
			holes[ranIndex2] = holes[ranIndex];
			holes[ranIndex] = temp;
		}
	}
	
	//테스트용 출력
	public void testPrint() {
		System.out.println("------------------");
		for (int i = 0; i < size; ++i) {
			System.out.printf("%-2c", holes[i]);
			
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}
	
	public void print() {
		for (int i = 0; i < size; ++i) {
			char h = holes[i];
			if(h == 'O' || h == 'X') {
				System.out.printf("%-2c", '|');
			} else if (h == 'S') {
				System.out.printf("%-2c", ' ');				
			}
			
			if (i % 10 == 9) {
				System.out.println();
			}
		}
	}
	
	
	// 통에 해당 위치를 찔렀을때 찌르고 뭐였는지 알려주는 메서드
	char stab(int index) {
		if (holes[index] == 'S') {
			return 'S';
		} else {
			char value = holes[index];
			holes[index] = 'S';
			return value;
		}		
	}
	
	public static void main(String[] args) {
		Barrel b = new Barrel();
		
		b.stab(0);
		b.stab(3);
		b.stab(15);
		b.stab(15);
		b.testPrint();
	}

}
