package myobj;

import java.util.Random;

public class FishBreadT {
	static Random ran = new Random();
	
	final public static int REDBEAN = 0; // 매직 넘버라고 부른데
	final public static int CREAM = 1;
	final public static int STRAWBERRY = 2;
	
	final public static String[] flavorNames = {"팥", "슈크림", "딸기"};
	final public static int[] flavorsPrices = {800, 1000, 1200};
	
	final public static int LOW_QUALITY = 0; // 매직 넘버라고 부른데
	final public static int MIDDLE_QUALITY = 1;
	final public static int HIGH_QUALITY = 2;
	
	final public static char[] qualityNames = {'하', '중', '상'};
	final public static int[] qualityPrices = {-100, 0, 100};
	
	public String flavorName;
	public int flavor;
	
	public char qualityName;
	public int quality;
	public int price;
	
	/**
		붕어빵의 맛, 품질, 가격을 랜덤으로 결정하여 생성한다.
	*/	
	public FishBreadT() {
		flavor = ran.nextInt(flavorNames.length);
		flavorName = flavorNames[flavor];
		quality = ran.nextInt(qualityNames.length);
		qualityName = qualityNames[quality];
		updatePrice();
	}
	
	/**
	  원하는 맛과 품질의 붕어빵을 설정하여 생성한다.
	  
	  @param flavor - 맛 번호 (0: 팥, 1: 슈크림, 2: 딸기)
	  @param quality - 품질 번호 (0:하, 1: 중, 2: 상)	  
	*/
	public FishBreadT(int flavor, int quality) {
		this.flavor = flavor;
		this.quality = quality;
		updatePrice();
	}
	
	void updatePrice() {
		this.price = flavorsPrices[flavor] + qualityPrices[quality];
	}
	
	public void print() {
		System.out.printf("[%s/%c/%d원]\n", flavorNames[flavor], qualityNames[quality], price);
		
	}
	
	public static int sumPrices(FishBreadT[] fishes) {
		int sum = 0;
		for (int i = 0; i <fishes.length; ++i) {
			sum += fishes[i].price;
		}
		return sum;
	}
}
