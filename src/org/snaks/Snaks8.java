package org.snaks;

import java.util.Arrays;
import java.util.Random;

public class Snaks8 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		Integer[] arrP = new Integer[10];
		Integer[] arrD = new Integer[10];
		
		for(int i=0;i<10; i++) {
			int rdm = rand.nextInt(100);
			if(rdm % 2 == 0) {
				arrP[i] = rdm;
			} else {
				arrD[i] = rdm;
			}
		}
		
		System.out.println("Pari: " + Arrays.asList(arrP));
		System.out.println("Pari: " + Arrays.asList(arrD));
		
	}
}
