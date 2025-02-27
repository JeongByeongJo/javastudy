package myobj;

import java.util.Random;

public class NaturalSciencesMajor extends Students{
	
	public NaturalSciencesMajor() {
		super();		
	}

	Random ran = new Random();
	
	//public String major = "이과";
	public int kor_score;
	public int eng_score;
	public int math1_score;
	public int math2_score;
	public int sci_score;
	public int total_score = kor_score + eng_score + math1_score + math2_score + sci_score;
	public double avg_score = total_score / (double) 5; 
	public char grade;
	
	public void generateNS() {
		this.name = super.name;
		this.major = "이과";
		this.studentNum = super.studentNum;
				
		kor_score = ran.nextInt(101);
		eng_score = ran.nextInt(101);
		math1_score = ran.nextInt(101);
		math2_score = ran.nextInt(101);
		sci_score = ran.nextInt(101);
		total_score = kor_score + eng_score + math1_score + math2_score + sci_score;
		avg_score = total_score / (double) 5;
	}
	
	public void generateNSReport(Students student) {
		generateNS();		
		
		if (avg_score >= 90) {
			grade = 'A';
		} else if (avg_score >= 80) {
			grade = 'B';
		} else if (avg_score >= 70) {
			grade = 'C';
		} else if (avg_score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}		
		
		System.out.printf("학번: %d/이름: %s/국어: %d/영어: %d/수1: %d/수2: %d/과학: %d/총점: %d/평균: %.2f/등급: %c\n",
				studentNum, name, kor_score, eng_score, math1_score, math2_score, sci_score, total_score, avg_score, grade);
	}
	
	
	

}
