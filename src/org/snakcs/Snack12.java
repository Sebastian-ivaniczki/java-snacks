package org.snakcs;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int lngarr1 = arr1.length;
		int lngarr2 = arr2.length;
		int index = 0;
		Integer[] arr3 = new Integer[lngarr1+lngarr2];
		
		for(int i = 0; i < lngarr1; i++) {
			arr3[index] = arr1[i];
			index++;
		}
		
		for(int i = 0; i < lngarr2; i++) {
			arr3[index] = arr2[i];
			index++;
		}
		
		System.out.println(Arrays.asList(arr3));
	}
}
