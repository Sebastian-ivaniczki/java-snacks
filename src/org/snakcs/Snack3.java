package org.snakcs;

public class Snack3 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		System.out.println(sum);
	}
}
