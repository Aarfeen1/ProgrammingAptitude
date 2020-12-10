package com.xworkz.StarPatterns;

public class Pattern {
public static void main(String[] args) {
	int num=6;
	for (int i = 0; i < num; i++) {
		for (int j = 0; j < num-i; j++) {
		
			System.out.print("*");
			
			
			
		}
		System.out.println();
	}
	
	
	System.out.println("===================================================");
	
	for (int i = 0; i < num; i++) {
	for (int j = 0; j < i+1; j++) {
		
		System.out.print("*");
		
		
		
	}
	System.out.println();
}
	for (int i = 0; i < num; i++) {
	for (int j = 0; j < num-i; j++) {
		
		System.out.print("*");
		
		
		
	}
	System.out.println();
}
	
	
	for (int i = 0; i < num; i++) {
	for (int j = 0; j < num; j++) {
		if(j<num-i)
		
		System.out.print(" ");
		else 
			System.out.print("*");
		
		
		
	}
	System.out.println();
}
	for (int i = 0; i < num; i++) {
	for (int j = 0; j < num-i; j++) {
		
		
		System.out.print("*");
		
		
		
		
	}
	System.out.println();
}
}
}
