package org.snakcs;

import java.util.Scanner;

public class Snack10 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("inserisci il raggio del cerchio: ");
	 
	 int radius = sc.nextInt();
	 
	 float area = radius * radius * 3.14f;
	 
	 float circumference = 2 * radius * 3.14f;
	 
	 System.out.println("l'area del cerchio è: "+area);
	 System.out.println("la circonferenza è: "+ circumference);
	 sc.close();
}
}
