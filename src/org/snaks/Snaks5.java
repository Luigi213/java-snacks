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
		int countD = 0;
		int sumD = 0;
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i=0; i<guestNum; i++) {
			
			int rdm = rand.nextInt(101);
			
			System.out.println(rdm);
			
			sum += rdm;

			if(rdm % 2 == 0) {
				sumP += rdm;
			} else {
				countD++;
				sumD += rdm;
			}
			
			if(rdm < min) {
				min = rdm;
			}
			
			if(rdm > max) {
				max = rdm;
			}
		}
		
		
		System.out.println("Sommatoria tutti valori:" + sum);
		System.out.println("Sommatoria tutti i numeri pari:" + sumP);
		
		double media = sum / guestNum;
		System.out.println("Media di tutti i valori:" + media);
		
		if(countD > 0) {
			double mediaD = sumD / countD;
			System.out.println("Media di tutti i valori dispari:" + mediaD);
			
		}
		System.out.println("Minimo di valori: " + min);
		System.out.println("Massimo di valori: " + max);
		in.close();
	}
}
