package org.snaks;

import java.util.Scanner;

public class Snaks9 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire base");
		int b = in.nextInt();
		
		System.out.println("Inserire altezza");
		int h = in.nextInt();
		
		int area = b * h;
		System.out.println("Area del triangolo: " + area);
		
		int per = (2 * b) + (2 * h);
		System.out.println("Perimetro triangolo: " + per);
		
		in.close();
	}
}
