package org.snakcs;

import java.util.Random;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("inserisci un numero");
		
		int num = sc.nextInt();
		int sum = 0;
		int evenSum = 0;
		int oddMedia = 0;
		int oddNum = 0;
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		Random random = new Random();
		for (int i = 0; i < num; i++) {
			int randNum = random.nextInt(101);
		//	System.out.println(randNum);
			
			sum += randNum;
			
			if(randNum % 2 ==0) {
				evenSum += randNum;
				//System.out.println(randNum);
			}
			
			if(randNum % 2 != 0) {
				
				oddMedia += randNum;
				oddNum ++;
				//System.out.println(randNum);
			}
			if(randNum<min) {
				min =randNum;
			}
			
			if(randNum>max) {
				max =randNum;
			}
		}
		
		//System.out.println(oddNum);
		System.out.println("somma"+ sum);
		System.out.println("somma numeri pari " + evenSum);
		System.out.println( "media "+sum / num);
		System.out.println("media numeri dispari "+ oddMedia /oddNum );
		System.out.println("min: " +min);
		System.out.println("max: " +max);
		
		sc.close();
	}
}
