package org.snaks;

public class Snaks3 {
	public static void main(String[] args) {
		int[] arrNum = {5, 3, 4, 5};
		int sum = 0;
		for (int i=0;i<arrNum.length; i+=2) {
			sum += arrNum[i];
		}
		System.out.println(sum);
	}
}
