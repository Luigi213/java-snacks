package org.snaks;

import java.util.Random;

public class Snaks7 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int i = 1;
		while(i % 3 != 0 || i % 5 != 0) {	
			i = rand.nextInt(101);
		}
		System.out.println(i);
		
	}
}
