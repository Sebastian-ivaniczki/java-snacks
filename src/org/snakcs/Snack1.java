package org.snakcs;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int val = sc.nextInt();
		
		if(val % 2 == 0) {
			System.out.println(val);
		}else {
			System.out.println(val + 1);
		}
		sc.close();
	}
}
