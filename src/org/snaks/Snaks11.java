package org.snaks;

import java.util.Scanner;

public class Snaks11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire un valore numerico");
		int num = in.nextInt();
		
		in.close();
		
		for(int i=1 ; i<=num; i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
