package org.snakcs;

import java.util.Random;
import java.util.Scanner;

public class snack6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci un valore minimo");
		int lim = sc.nextInt();
		
		int sum = 0;
		
		Random random = new Random();
		
		while(sum < lim) {
			int randNum = random.nextInt(101);
			if(sum<lim) {
				
				sum += randNum;
		}
		
	
			
		}
		System.out.println(sum);
		sc.close();
	}
}
