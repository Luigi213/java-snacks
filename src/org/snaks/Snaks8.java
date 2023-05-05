package org.snaks;

import java.util.Arrays;
import java.util.Random;

public class Snaks8 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int countP = 0;
		int countD = 0;
		
		Integer[] arrP = new Integer[10];
		Integer[] arrD = new Integer[10];
		
		for(int i=0;i<10; i++) {
			int rdm = rand.nextInt(100);
			if(rdm % 2 == 0) {
				arrP[countP++] = rdm;
			} else {
				arrD[countD++] = rdm;
			}
		}
		
		System.out.println("Pari: " + Arrays.asList(arrP));
		System.out.println("Dispari: " + Arrays.asList(arrD));
		
	}
}
