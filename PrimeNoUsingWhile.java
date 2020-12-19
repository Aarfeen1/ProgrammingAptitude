package com.xworkz.numbers;

public class PrimeNoUsingWhile {
	public static void main(String[] args) {
		int number=16;
		int i=2;
		int count=0;
		
		
		while(i<number) {
			if(number%i==0) {
				//System.out.println("not prime");
				count++;
				break;
				
			}
			i++;
		} 
		if(count==0)
				System.out.println("its prime ");
		else
			System.out.println("not prime");
		}
	}


