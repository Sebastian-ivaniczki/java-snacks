package org.snakcs;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		Integer[] evenArr = new Integer[10];
		Integer[] oddArr = new Integer[10];
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 0; i<10;i++) {
			int randNum = rnd.nextInt(101);
			
			if(randNum % 2 == 0) {
				evenArr[evenCount++] = randNum;
			}else {
				oddArr[oddCount++] = randNum;
			}
			
		}
		
		System.out.println(Arrays.asList(evenArr));
		System.out.println(Arrays.asList(oddArr));
	}
}
