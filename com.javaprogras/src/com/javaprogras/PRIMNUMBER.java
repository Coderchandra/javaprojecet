package com.javaprogras;

import java.util.Scanner;

public class PRIMNUMBER
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number:");
	int number=	sc.nextInt();
	if(isprime(number)) {
		System.out.println(number+"the number is prime");
	}else {
		System.out.println(number+"the number not a primenumber");
	}

	}

	private static boolean isprime(int number) {
		if(number<=1) {
			
		
		return false;
		}
		
		for(int i=2;i<=Math.sqrt(number);i++) {
			if( number%2==0) {
	
			}
		}
		return false;
		
	}
	

}
