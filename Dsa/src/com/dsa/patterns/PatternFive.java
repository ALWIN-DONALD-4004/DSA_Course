package com.dsa.patterns;

public class PatternFive {
	
//	PatternFive(int n){
//		for(int i = 0 ; i<n ; i++) {
//			for(int j = n ; j>i ; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
	PatternFive(int n){
		for(int i = 1 ; i<=n ; i++) {
			for(int j = 0 ; j<n-i+1 ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
