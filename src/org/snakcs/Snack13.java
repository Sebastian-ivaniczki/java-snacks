package org.snakcs;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int lngarr1 = arr1.length;
		int lngarr2 = arr2.length;
		
		Integer[] newArr1 = new Integer[lngarr1];
		Integer[] newArr2 = new Integer[lngarr2];
		
		for( int i = 1; i<lngarr1; i++) {
			newArr1[0] = arr2[0];
			newArr1[i] = arr1[i];
		}
		for( int i = 1; i<lngarr2; i++) {
			newArr2[0] = arr1[0];
			newArr2[i] = arr2[i];
		}
		
		System.out.println(Arrays.asList(newArr1));
		System.out.println(Arrays.asList(newArr2));
		
	}
}
