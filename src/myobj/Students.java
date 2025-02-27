package myobj;

import java.util.Random;

public class Students {
	Random ran = new Random();	
	
	public String[] majorArr = {"이과", "문과"};
	public String[] familyName = {"김", "이", "박", "최", "정"};
	public String[] middleName = {"성", "은", "상", "희", "현"};
	public String[] lastName = {"영", "아", "수", "지", "준"};
	
	public String major;
	public int studentNum;
	public String name;
//	public String major = majorArr[ran.nextInt(2)];
//	public int studentNum = ran.nextInt(1000);
//	public String name = familyName[(int)(Math.random()*5)]
//			+ middleName[(int)(Math.random()*5)]
//			+ lastName[(int)(Math.random()*5)];
		
	
//	public Students(String major,int studentNum, String name) {
//		this.major = major;
//		this.studentNum = studentNum;
//		this.name = name;	
//	}
	
	
	
	public Students() {
		//major = majorArr[ran.nextInt(2)];
		studentNum = ran.nextInt(1000);
		name = familyName[(int)(Math.random()*5)]
				+ middleName[(int)(Math.random()*5)]
						+ lastName[(int)(Math.random()*5)];	
	}
	
	public static Students getRandomStudent() {
		return (int)(Math.random() * 2) == 0 ?
				new LiberalArtsMajor() : new NaturalSciencesMajor();
	}
	
//	public static Students getRandomStudent() {
//		return new LiberalArtsMajor();
//	}

}
