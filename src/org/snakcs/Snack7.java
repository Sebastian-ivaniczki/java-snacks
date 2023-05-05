package org.snakcs;

import java.util.Random;

public class Snack7 {
	public static void main(String[] args) {
		Random rnd = new Random();
		boolean flag = true;
		do {
			int randNum = rnd.nextInt(101);
			if(randNum % 3 == 0 && randNum % 5 == 0) {
				//System.out.println(randNum);
				flag = false;
			}
			System.out.println(randNum);
		}while(flag);
	}
}
