package myobj.school;

public class Student {
	int id;
	String name;
	
	static int sid = 0;
	static String[] lastNames = {"김", "이", "박", "최", "권", "강", "남궁", "제갈", "정"};
	static String[] firstNames = {"종훈", "샛별", "민희", "민수", "민식", "영희", "춘자"};
	
	
	public Student() {
		id = sid++;
		name = lastNames[(int)(Math.random()*lastNames.length)]
				+ firstNames[(int)(Math.random()*firstNames.length)];
	}
	
	public int getId() {
		return id;		
	}	
	
	public String getName() {
		return name;
	}
	
	public String getScores() {
		return "";		
	}
	
	public int getTotal() {
		return -1;
	}
	
	public double getAvg() {
		return -1;
	}
	
	public char getGrade() {
		return 'F';
	}
	
	public void printReportCard() {
		System.out.printf("%d/%s/%s/%d/%.1f/%c\n", getId(), getName(), getScores(), getTotal(), getAvg(), getGrade());
	}
	
	public void PrintInfo() {
		System.out.printf("%d/%s", id, name);
	}
	
	public static Student getRandomStudent() {
		return (int)(Math.random() * 2) == 0 ?
				new ScienceStudent() : new LiberalArtsStudent();
	}
	
	public static void printStudent(Student stu) {
		stu.printReportCard();
	}

}
