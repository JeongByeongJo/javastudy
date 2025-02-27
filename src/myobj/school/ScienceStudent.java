package myobj.school;

public class ScienceStudent extends Student{
	int kor;
	int eng;
	int math1;
	int math2;
	int science;
	
	public ScienceStudent() {
		super();
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math1 = (int)(Math.random() * 101);
		math2 = (int)(Math.random() * 101);
		science = (int)(Math.random() * 101);		
	}
	
	
	@Override
	public String getScores() {
//		return "[" + kor + "/" + eng + "/" + math1 + "/"
//				+ math2 + "/" + science + "]";
		
		// String.format() : printf처럼 원하는 문자열을 생성하는 함수
		return String.format("[%d/%d/%d/%d/%d]", kor, eng, math1, math2, science);
	}
	@Override
	public int getTotal() {
		return kor + eng + math1 + math2 + science;
	}
	
	@Override
	public double getAvg() {
		return getTotal() / 5.0;		
	}
	
	@Override
	public char getGrade() {		
		double avg = getAvg();
		
		if (avg < 0 || avg > 100) {
			return 'F';
		} else if (avg >= 90) {
			return 'A';
		} else if (avg >= 80) {
			return 'B';
		} else if (avg >= 70) {
			return 'C';
		} else if (avg >= 60) {
			return 'D';
		} else {
			return 'F';
		}	
	}
}
