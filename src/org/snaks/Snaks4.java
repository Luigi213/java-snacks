package org.snaks;

import java.util.Scanner;

public class Snaks4 {
	public static void main(String[] args) {
		String original, reverse = "";
		
		Scanner in = new Scanner(System.in);
		
	    System.out.println("Inserire una parola"); 
	    
	    original = in.nextLine();   
	    int length = original.length();   	
	    for ( int i = length - 1; i >= 0; i-- )  {
	    	reverse += original.charAt(i);  	    	
	    }
	    if (original.equals(reverse))  {
	    	System.out.println("E' palindroma");  	    	
	    }
	    else  {
	    	System.out.println("None e' palindroma");   	    	
	    }
	    
	    in.close();
	}
}
