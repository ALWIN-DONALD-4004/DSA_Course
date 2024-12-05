package com.dsa.patterns;

public class PatternNineteen {
	
	public PatternNineteen(int n) {
		
		int initialSpace=0;
		for(int i=0;i<n;i++) {
		
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("*");
			}
			
			for(int j=0 ; j<initialSpace ; j++) {
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=n-i ; j++) {
				System.out.print("*");
			}
			
			initialSpace+=2;
			System.out.println();
		}
		
		int initialSpace2=8;
		for(int i=1;i<=n;i++) {
		
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			
			for(int j=0 ; j<initialSpace2 ; j++) {
				System.out.print(" ");
			}
			
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			
			initialSpace2-=2;
			System.out.println();
		}
		
	}

}
