package com.dsa.patterns;

public class PatternFour {
	
	PatternFour(int n){
		for(int i=1 ; i<=n; i++) {
			for(int j = 1;j<=i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
