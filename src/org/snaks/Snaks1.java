package org.snaks;

import java.util.Scanner;

public class Snaks1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire il numero");
		int num = in.nextInt();
		
		System.out.println(
					num % 2 == 0
					? num
					: num + 1
				);
		
		in.close();
	}
}
