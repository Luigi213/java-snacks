package org.snaks;

import java.util.Scanner;

public class Snaks10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserire il raggio");
		int r = in.nextInt();
		
		double area = r*r*3.14d;
		System.out.println("Area circonferenza: " + area);
		
		double per = r*2*3.14d;
		System.out.println("Perimetro della circonferenza: " + per);
		
		in.close();		
	}
}
