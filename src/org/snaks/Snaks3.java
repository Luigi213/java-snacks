package org.snaks;

public class Snaks3 {
	public static void main(String[] args) {
		int[] arrNum = {5, 3, 4, 5};
		int sum = 0;
		for (int i=0;i<arrNum.length; i++) {
			if(!(i % 2 == 0)) {
				sum += arrNum[i - 1];
			}
		}
		System.out.println(sum);
	}
}
