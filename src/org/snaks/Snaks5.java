package org.snaks;

import java.util.Random;
import java.util.Scanner;

public class Snaks5 {
	public static void main(String[] args) {
		Random rand = new Random(); 
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire un numero");
		int guestNum = in.nextInt();
		
		int sum = 0;
		int sumP = 0;
		int sumD = 0;
		for (int i=0; i<guestNum; i++) {
			
			int rdm = rand.nextInt(100);
			
			sum += rdm;

			if(rdm % 2 == 0) {
				sumP += rdm;
			} else {
				sumD += rdm;
			}
		}
		
		System.out.println("Sommatoria tutti valori:" + sum);
		System.out.println("Sommatoria tutti i numeri pari:" + sumP);
		
		double media = sum / guestNum;
		System.out.println("Media di tutti i valori:" + media);
		
		double mediaD = sumD / guestNum;
		System.out.println("Media di tutti i valori dispari:" + mediaD);
		System.out.println("Minimo di valori: " + 0);
		System.out.println("Massimo di valori: " + guestNum);
		in.close();
	}
}
