package org.snaks;

import java.util.Arrays;

public class Snaks13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer[] newArr1 = new Integer[arr1.length];
		System.arraycopy(arr1, 0, newArr1, 0, arr1.length);
		newArr1[0] = arr2[0];

		Integer[] newArr2 = new Integer[arr1.length];
		System.arraycopy(arr2, 0, newArr2, 0, arr2.length);
		newArr2[0] = arr1[0];
		
	    System.out.println(Arrays.toString(newArr1));
	    System.out.println(Arrays.toString(newArr2));
	}
}
