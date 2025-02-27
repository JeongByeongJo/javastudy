
public class B06_Operator3 {
	
	/*
	 	# 대입 연산자
	 	
	 	= : 왼쪽의 변수에 오른쪽의 값을 넣는다. 원래 들어있던 값은 덮어쓴다.
	 	
	 	# 복합 대입 연산자
	 	
	 	+= : 왼쪽 변수에 들어있던 값에 오른쪽의 값을 더해 누적시킨다.
	 	-= : 왼쪽 변수에 들어있던 값에서 오른쪽의 값을 빼 누적시킨다.
	 	*= : 왼쪽 변수에 들어있던 값에 오른쪽의 값을 곱해 누적시킨다.
	 	/= : 왼쪽 변수에 들어있던 값을 오른쪽의 값으로 나누어 누적시킨다.
	 	%= : 왼쪽 변수에 들어있던 값을 오른쪽의 값으로 나눈 나머지를 저장한다.
	 	
	 	# booleanㅌ 타입의 복합 대입 연산
	 	
	 	  &= : && 연산을 누적시킨다.
	 	  |= : || 연산을 누적시킨다.
	 	  ^= : XOR 연산을 누적시킨다. (두 값이 서로 달라야 true)
	 	  
	 	# 단항 연산자(앞 뒤 모두 위치가능)
	 	  ++ : 1씩 누적
	 	  -- : 1씩 마이너스
	 	  
	 	# 단항 연산자의 위치에 따른 차이
	 	
	 	- 단항 연산자가 변수 뒤에 붙어있는 경우 해당 물에 있는 모든 명령을 수행한 후에 값을 변화시킨다.
	 	  ex> a++, a--
	 	  
	 	- 단항 연산자가 변수 앞에 붙어있는 경우 해당 줄의 명령을 실행하기 전에 값을 변화시킨다.
	 	  ex> a++, a--
	 */
	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		
		num = 5;
		System.out.println(num);
		
		int num2 = 20;
		
		System.out.println("num2: " + num2);
		num2 += 3;
		System.out.println("num2: " + num2);
		num2 = num2 + 3;
		System.out.println("num2: " + num2);
		num2 -= 8;
		System.out.println("num2: " + num2);
		num2 /= 3;
		System.out.println("num2: " + num2);
		num2 *= 11;
		System.out.println("num2: "+ num2);
		num2 %= 14;
		System.out.println("num2: "+ num2);
		
		boolean allStudentAppeared = true;
		
		boolean chulsuAppeared = true;
		boolean sujiAppeared = false;
		boolean minsikAppeared = true;
		boolean juhwanAppeared = true;
		
		allStudentAppeared &= chulsuAppeared;
		allStudentAppeared &= sujiAppeared;
		allStudentAppeared &= minsikAppeared;
		allStudentAppeared &= juhwanAppeared;
		
		System.out.println("모든 학생이 출석했니? " + allStudentAppeared);
		
		boolean b1 = true;
		boolean b2 = true;
		b1 ^= b2;		
		System.out.println(b1);
		b1 ^= b2;		
		System.out.println(b1);
		b1 ^= b2;		
		System.out.println(b1);
		
		int num3 = 8;
		
		num3++;
		System.out.println(num3);
		++num3;
		System.out.println(num3);
		num3++;
		System.out.println(num3);
		++num3;
		System.out.println(num3);
		
		num3--;
		System.out.println(num3);
		--num3;
		System.out.println(num3);
		num3--;
		System.out.println(num3);
		--num3;
		System.out.println(num3);
		
		
		int num4 = 30;
		
		System.out.println("-----------------------");
		System.out.println(++num4); // 1 증가후 출력
		System.out.println(num4++); // 출력 후 1 증가
	}

}
