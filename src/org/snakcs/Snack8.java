package org.snakcs;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		Integer[] evenArr = new Integer[10];
		Integer[] oddArr = new Integer[10];
		for(int i = 0; i<10;i++) {
			int randNum = rnd.nextInt(101);
			
			if(randNum % 2 == 0) {
				evenArr[i] = randNum;
			}else {
				oddArr[i] = randNum;
			}
			
		}
		
		System.out.println(Arrays.asList(evenArr));
		System.out.println(Arrays.asList(oddArr));
	}
}
