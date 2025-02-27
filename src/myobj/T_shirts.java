package myobj;

public class T_shirts {
	int modelNum;
	String[] size = {"M", "L"};
	String[] measure = 
		{"A-Chest", "B-Front length", "C-Sleeve length", "D-Back width", "E-Arm width"};
	int price;
	double discount;
	static double[][] measureManTop = {
			{53, 67, 22.5, 44, 17.5},
			{55.5, 69, 23.5, 46, 18.5}
	};
	static double[][] measureWomanTop = {
			{47, 67, 57, 44.5, 17},
			{48, 68, 57.5, 46.5, 17.5}
	};
	
	void discounts() {
		price = (int)(price * discount);		
	}
	
	void manSize(String manSize) {
		int j = 0;
		for (; j < size.length; ++j) {			
			if (manSize == size[j]) {
				System.out.printf("사이즈: %s\n", size[j]);				
			}
		}
		for (int i = 0; i < measure.length; ++i) {
			System.out.printf("%s: %.1f\n", measure[i], measureManTop[j-1][i]);
		}
	}

}