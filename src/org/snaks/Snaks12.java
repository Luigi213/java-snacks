package org.snaks;

import java.util.Arrays;

public class Snaks12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		Integer arr1len = arr1.length;
		Integer arr2len = arr2.length;
		Integer[] result = new Integer[arr1len + arr2len];

        System.arraycopy(arr1, 0, result, 0, arr1len);
        System.arraycopy(arr2, 0, result, arr1len, arr2len);

        System.out.println(Arrays.toString(result));
	}
}
