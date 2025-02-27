package quiz;

import myobj.GenerateReport;
import myobj.Students;

public class C07_School {
	/*
	1. 이과 학생들은 국어, 영어, 수1, 수2, 과학 점수가 있다.
	
	2. 문과 학생들은 국, 영어, 수1, 국사, 윤리, 세계사 점수가 있다.
	
	3. 학생 인스턴스를 생성할 때
	   해당 학생의 과, 점수, 학번, 이름 등
	   모든 내용이 랜덤으로 생성되게 만들어주세요.
	
	4. 문/이과 관계 없이 학생을 전달했을때 해당 학생의
	   성적표를 출력해주는 메서드를 정의해보세요.(메서드 하나로)
	   (성적표에는 학번/이름/과목별점수/총점/평균/등급이 출력됨)
	   
	5. 100명의 학생들을 랜덤으로 생성한 후 학번순으로 정렬하여
	   출력한 뒤, 성적순으로 정렬하여 다시 한 번 출력해보세요.
	*/
	public static void main(String[] args) {
		Students[] students = new Students[3];
		GenerateReport gr = new GenerateReport();
		Students stu = new Students();
		
		for (int i = 0; i < students.length; ++i) {
			students[i] = Students.getRandomStudent();
			gr.generateReport(students[i]);
		}
	}
}
