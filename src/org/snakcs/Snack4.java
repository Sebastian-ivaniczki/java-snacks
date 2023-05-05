package org.snakcs;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci una parola per vedere se è palindroma");
		String word = sc.nextLine();
		
		word.toLowerCase();
		int startIndex = 0;
		int endIndex = word.length() -1;
		
		while (startIndex < endIndex) {
			if(word.charAt(startIndex) != word.charAt(endIndex)) {
				System.out.println("la parola non è un palindromo");
				break;
			}else {
				System.out.println("la parola è un palindromo");
				break;
			}
		
		}
		sc.close();
	}
}
