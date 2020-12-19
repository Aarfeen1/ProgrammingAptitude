package com.xworkz.StarPatterns;

public class Shape {
	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if( i+j==4 || i==j)
				System.out.print("*");
				else if(i==0 || j==0 || i==num-1 || j==num-1)
					System.out.print("@");
				else
					System.out.print("-");
				
			}
			System.out.println();
			}
		
			}

}
