package quiz;

public class A04_PrintCalendar {
	
	public static void main(String[] args) {
		
		System.out.printf(" %s %s %s %s %s %s %s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.printf(" %11d %3d %3d %3d %3d \n", 1, 2, 3, 4, 5);
		System.out.printf(" %3d %3d %3d %3d %3d %3d %3d\n", 6, 7, 8, 9, 10, 11, 12);
		System.out.printf(" %3d %3d %3d %3d %3d %3d %3d\n", 13, 14, 15, 16, 17, 18, 19);
		System.out.printf(" %3d %3d %3d %3d %3d %3d %3d\n", 20, 21, 22, 23, 24, 25, 26);
		System.out.printf(" %3d %3d %3d %3d %3d \n", 27, 28, 29, 30, 31);
		
		System.out.println();
		
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "", "", "1", "2", "3", "4", "5");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "6", "7", "8", "9", "10", "11", "12");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "13", "14", "15", "16", "17", "18", "19");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "20", "21", "22", "23", "24", "25", "26");
		System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "27", "28", "29", "30", "31", "", "");
	}

}
