package myobj;

public class GenerateReport {
	NaturalSciencesMajor ns = new NaturalSciencesMajor();
	LiberalArtsMajor la = new LiberalArtsMajor();
	
//	public void generateReport(Students students) {
//		if(students.major.equals("문과")) {
//			la.generateLAScore(students);
//		} 
//		if(students.major.equals("이과")) {
//			ns.generateNSReport(students);
//		}
//	}
	
	public void generateReport(Students students) {
		la.generateLAScore(students);	
		ns.generateNSReport(students);
	}

}
