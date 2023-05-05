package org.snakcs;

import java.util.Scanner;

public class Snack11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci numero per vedere quali sono i numeri interi per il quale è divisibile");
		
		int val = sc.nextInt();
		System.out.println("i numeri interi per i quali e divisibile sono:");
		for(int i = 1; i <= val; i++) {
			if(val % i == 0) {
				System.out.println(i + " ");
			}
		}
		
		sc.close();
	}
}
