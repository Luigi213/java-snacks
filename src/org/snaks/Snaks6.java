package org.snaks;

import java.util.Random;
import java.util.Scanner;

public class Snaks6 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserire il limite");
		int limit = in.nextInt();
		
		Random rand = new Random(); 
		
		int sum = 0;
		while(limit > sum) {
			int rdm = rand.nextInt(100);
			sum += rdm;
		}
		System.out.println("Numero che ha superato il limite: " + sum);
		in.close();		
	}
}
