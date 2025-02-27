package myobj.school;

public class LiberalArtsStudent extends Student{
	int kor;
	int eng;
	int math1;
	int korHistory;
	int ethic;
	int worldHistory;
	
	public LiberalArtsStudent() {
		super();
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math1 = (int)(Math.random() * 101);
		korHistory = (int)(Math.random() * 101);
		ethic = (int)(Math.random() * 101);
		worldHistory = (int)(Math.random() * 101);		
	}
	
	@Override
	public String getScores() {
		// TODO Auto-generated method stub
		return String.format("[%d/%d/%d/%d/%d/%d]", kor, eng, math1, korHistory, ethic,	worldHistory);
	}
	
	@Override
	public int getTotal() {
		
		return kor + eng + math1 + korHistory + ethic +	worldHistory;
	}
	
	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		return getTotal() / 6.0;
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
