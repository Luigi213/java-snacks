package org.snaks;

import java.util.Random;

public class Snaks2 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		String[] name = {"Giovanni", "Michele", "Leonardo"};
		String[] surname = {"Pisa", "Esposito", "Tatti"};
		
		int x = 0;
		
		while(name.length > x) {			
			int rdmN = rand.nextInt(name.length);
			int rdmS = rand.nextInt(surname.length);
			System.out.println(name[rdmN] + " " + surname[rdmS]);
			x++;
		}
		
	}
}
