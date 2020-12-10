package com.xworkz.StarPatterns;

public class StarPattern1 {

	public static void main(String[] args) {
		int num=6;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
			
				System.out.print("*");
				
				
				
			}
			System.out.println();
		}
		System.out.println("=================================================");
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
	           if(j<i+1)		
				System.out.print(" ");
	           else 
	        	   System.out.print("*");
				
				
			}
			System.out.println();
		}
	}

}
