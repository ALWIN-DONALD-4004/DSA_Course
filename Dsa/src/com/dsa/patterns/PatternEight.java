package com.dsa.patterns;

public class PatternEight {
	
	PatternEight(int n){
		for(int i = 0 ; i<n ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j< 2*n -(2*i+1) ; j++) {
				System.out.print("*");
			}
			for(int j=0 ; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
