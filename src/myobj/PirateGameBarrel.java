package myobj;

import java.util.Arrays;
import java.util.Random;

public class PirateGameBarrel {	
	Random ran = new Random();
	
	final int HOLE_NUM = 20;
	final int BOOM_HOLE_NUM = 4;
	
	public int[] hole = new int[HOLE_NUM];
	public int[] stabbedHole = new int[HOLE_NUM-BOOM_HOLE_NUM];
	public int[] boomHole = new int[BOOM_HOLE_NUM];
	
	public int[] makeHole() {
		for (int i = 0; i < HOLE_NUM; ++i) {
			hole[i] = i;
		}
		System.out.println(Arrays.toString(hole));
		return hole;
	}
	
	public int[] stabbedHole() {
		for (int i = 0; i < HOLE_NUM-BOOM_HOLE_NUM; ++i) {
			stabbedHole[i] = -1;
		}
		System.out.println(Arrays.toString(stabbedHole));
		return stabbedHole;
	}
	
	public void makeBoomHole() {		
		for (int i = 0; i < BOOM_HOLE_NUM; ++i) {
			boomHole[i] = ran.nextInt(20);			
			for (int j = 0; j < i; ++j) {
				if (boomHole[i] == boomHole[j]) {
					--i;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(boomHole));
		//return boomHole;
	}

}
