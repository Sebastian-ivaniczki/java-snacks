package org.snakcs;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci la base del rettangolo:");
		
		int width = sc.nextInt();
		
		System.out.println("inserisci altezza:");
		
		int heigth = sc.nextInt();
		
		int area = width * heigth;
		
		int perimeter = (2 * width) + (2 * heigth);
		System.out.println("l'area è: "+ area);
		
		System.out.println("il perimetro è: "+perimeter);
		sc.close();
	}
}
