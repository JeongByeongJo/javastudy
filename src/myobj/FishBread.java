package myobj;

import java.util.Arrays;
import java.util.Random;

public class FishBread {
	Random ran = new Random();
	
	static String name = "붕어빵";
	public int flavor;
	public int ranTaste = ran.nextInt(3);
	public int ranQlty = ran.nextInt(3);
	public String[] taste = {"팥", "슈크림", "딸기"};
	public String[] quality = {"상", "중", "하"};
	public int[] price = {800, 1000, 1200};
	public int[] qltyPrice = {100, 0, -100};
	
	public void fishbreadArr(FishBread[] fb) {
		int[] tasteArr = new int[fb.length];
		int[] priceArr = new int[fb.length];
		String[] nameArr = new String[fb.length]; 
		for (int j = 0; j < fb.length; ++j) {
			ranTaste = ran.nextInt(3);
			ranQlty = ran.nextInt(3);
			int qlty = qltyPrice[ranQlty];
			String name = taste[ranTaste] + " " + this.name + "(" + quality[ranQlty]+ ")";
			int eachPrice = price[ranTaste] + qlty;
			priceArr[j] = eachPrice;
			nameArr[j] = name;
			tasteArr[j] = ranTaste;
		}
		System.out.println(Arrays.toString(nameArr));
		System.out.println(Arrays.toString(priceArr));
		int pat = 0;
		int cream = 0;
		int strawberry = 0;
		for (int j= 0; j < fb.length; ++j) {
			if (tasteArr[j] == 0) {
				pat++;
			} else if (tasteArr[j] == 1) {
				cream++;
			} else if (tasteArr[j] == 2) {
				strawberry++;
			}
		}
		System.out.printf("팥붕어빵: %d개, 슈크림붕어빵: %d개, 딸기붕어빵: %d개\n", pat, cream, strawberry);
		int totalPrice = 0;
		for (int j= 0; j < fb.length; ++j) {
			totalPrice += priceArr[j];
		}
		System.out.printf("모든 붕어빵 가격: %d원\n", totalPrice);
	}
	
	public void makeNcount(int i) {
		int[] tasteArr = new int[i];
		int[] priceArr = new int[i];
		String[] nameArr = new String[i]; 
		for (int j = 0; j < i; ++j) {
			ranTaste = ran.nextInt(3);
			ranQlty = ran.nextInt(3);
			int qlty = qltyPrice[ranQlty];
			String name = taste[ranTaste] + " " + this.name + "(" + quality[ranQlty]+ ")";
			int eachPrice = price[ranTaste] + qlty;
			priceArr[j] = eachPrice;
			nameArr[j] = name;
			tasteArr[j] = ranTaste;
		}
//		System.out.println(Arrays.toString(priceArr));
//		System.out.println(Arrays.toString(nameArr));
		int pat = 0;
		int cream = 0;
		int strawberry = 0;
		for (int j= 0; j < i; ++j) {
			if (tasteArr[j] == 0) {
				pat++;
			} else if (tasteArr[j] == 1) {
				cream++;
			} else if (tasteArr[j] == 2) {
				strawberry++;
			}
		}
		System.out.printf("팥붕어빵: %d개, 슈크림붕어빵: %d개, 딸기붕어빵: %d개\n", pat, cream, strawberry);
	}
	
	
	

//	public void makes(int i) {
//		int qty = i;
//		int[] priceArr = new int[i];
//		String[] nameArr = new String[i]; 
//		for (int j = 0; j < i; ++j) {
//			ranTaste = ran.nextInt(3);
//			ranQlty = ran.nextInt(3);
	////			int ranQ = ranQlty;
	////			int ranT = ranTaste;
//			int qlty = qltyPrice[ranQlty];
//			String name = taste[ranTaste] + " " + this.name + "(" + quality[ranQlty]+ ")";
//			int eachPrice = price[ranTaste] + qlty;
//			priceArr[j] = eachPrice;
//			nameArr[j] = name;
//		}
//		System.out.println(Arrays.toString(priceArr));
//		System.out.println(Arrays.toString(nameArr));
//	}	
}
