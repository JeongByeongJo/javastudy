package quiz;

import myobj.FishBread;
import myobj.FishBreadT;

public class C04_FishBread {
	/*
		1. myobj 패키지에 붕어빵 클래스를 만들어보세요.
		
		- 붕어빵의 속성으로는 맛, 가격, 품질이 있다.
		- 맛과 품질은 인스턴스 생성시 랜덤으로 결정되어야 한다.
		- 가격은 맛과 품질에 따라 결정되어야 한다.
		  팥 800원, 슈크림 1000원, 딸기 1200원이고
		  품질에 따라 +-100원이 된다. (품질은 상/중0/하로 나뉜다.) 
		 
		2. 설계한 클래스를 활용하여 붕어빵을 100개 생성하고
		   어떤 맛 붕어빵이 몇개 생성되었는지 세어보세요.		   
		  
		3. 붕어빵 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는
		   메서드를 만들고 테스트해보세요.
	*/
	public static void main(String[] args) {		
		int makeqty = 100;
		int[] fbQltyArr = new int[makeqty];
		int[] fbTasteArr = new int[makeqty];
		
		for (int i = 0; i < makeqty; ++i) {
			FishBread fishBread = new FishBread();
			fbQltyArr[i] = fishBread.ranQlty;
			fbTasteArr[i] =	fishBread.ranTaste;
		}
		
		int countP = 0;
		int countC = 0;
		int countS = 0;
		for (int i = 0; i < makeqty; ++i) {
			if (fbTasteArr[i] == 0) {
				++countP;
			} else if (fbTasteArr[i] == 1) {
				++countC;			
			} else if (fbTasteArr[i] == 2) {
				++countS;
			}
		}
		System.out.printf("팥붕어빵: %d개, 슈크림붕어빵: %d개, 딸기붕어빵: %d개\n", countP, countC, countS);
		
		
		FishBread fishBread1 = new FishBread();
		fishBread1.makeNcount(100);
		
		
		FishBread[] fishBread = new FishBread[100];
		
		fishBread1.fishbreadArr(fishBread);
		
		
		
		System.out.println();
		//System.out.println(Arrays.toString(fbQltyArr));
		//System.out.println(Arrays.toString(fbTasteArr));
		
		System.out.println();
		System.out.println("#### 선생님 풀이 ####");
		//FishBread.flavorNames = new String[] {"김치", "단무지", "물"};
		//를 방지하기 위해 final을 붙여두어야 한다.
		
		//FishBreadT f = new FishBreadT(FishBreadT.REDBEAN, FishBreadT.HIGH_QUALITY); 
		
		FishBreadT f = new FishBreadT();
		
		FishBreadT[] fishes = new FishBreadT[100];
		
		for (int i = 0; i < fishes.length; ++i) {
			fishes[i] = new FishBreadT();
		}
		
		// 붕어빵 맛 개수 세기
		int redbeanCount = 0;
		int creamCount = 0;
		int strawCount = 0;
		
		for (int i = 0; i < fishes.length; ++i) {
			fishes[i].print();
			
			if (fishes[i].flavor == FishBreadT.REDBEAN) {
				++redbeanCount;
			} else if (fishes[i].flavor == FishBreadT.CREAM) {
				++creamCount;
			} else if (fishes[i].flavor == FishBreadT.STRAWBERRY) {
				++strawCount;
			}
		}
		
		System.out.printf("팥: %d, 슈크림: %d, 딸기: %d\n", redbeanCount, creamCount, strawCount);
		
		
		
		System.out.println("배열에 있는 모든 붕어빵의 가격: " + FishBreadT.sumPrices(fishes) + "원");
	}// MAIN

}
