package myobj;

import java.util.Random;

public class LiberalArtsMajor extends Students{
	Random ran = new Random();
	public int kor_score;
	public int eng_score;
	public int math1_score;
	public int kor_his_score;
	public int ethic_score;
	public int world_his_score;
	
	public LiberalArtsMajor() {
		super();
		kor_score = ran.nextInt(101);
		eng_score = ran.nextInt(101);
		math1_score = ran.nextInt(101);
		kor_his_score = ran.nextInt(101);
		ethic_score = ran.nextInt(101);
		world_his_score = ran.nextInt(101);
		total_score = kor_score + eng_score + math1_score + kor_his_score + ethic_score + world_his_score;
		avg_score = total_score / (double) 6;
	}
	
	public String major = "문과";
	public int total_score = kor_score + eng_score + math1_score + kor_his_score + ethic_score + world_his_score;
	public double avg_score = total_score / (double) 6; 
	public char grade;
	
//	public String major = "문과";
//	public int kor_score = ran.nextInt(101);
//	public int eng_score = ran.nextInt(101);
//	public int math1_score = ran.nextInt(101);
//	public int kor_his_score = ran.nextInt(101);
//	public int ethic_score = ran.nextInt(101);
//	public int world_his_score = ran.nextInt(101);
//	public int total_score = kor_score + eng_score + math1_score + kor_his_score + ethic_score + world_his_score;
//	public double avg_score = total_score / (double) 6; 
//	public char grade;	
	
	public void generateLAScore(Students student) {
		
		
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
		
		System.out.printf("학번: %d/이름: %s/국어: %d/영어: %d/수1: %d/국사: %d/윤리: %d/세계사: %d/총점: %d/평균: %.2f/등급: %c\n", studentNum,
				name, kor_score, eng_score, math1_score, kor_his_score, ethic_score, world_his_score, total_score, avg_score, grade);
	}

}
