package org.snakcs;



public class Snack2 {
public static void main(String[] args) {
	String[] names = { "name1", "name2", "name3", "name4", "name5" };
	String[] surname = { "surname1", "surname2", "surname3", "surname4", "surname5" };
	
	String[] random = new String[names.length + surname.length];
	
	for (int i = 0; i < random.length; i++) {
		int nameIndex = (int) (Math.random()* names.length);
		int surnameIndex = (int) (Math.random()* surname.length);
		random[i] = names[nameIndex]+ " " + surname[surnameIndex];
		System.out.println(random[i]);
	} 
		
}
}
