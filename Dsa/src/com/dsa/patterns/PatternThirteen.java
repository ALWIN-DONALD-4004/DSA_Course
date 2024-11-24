package com.dsa.patterns;

public class PatternThirteen {
	int num = 1;
	PatternThirteen(int n){
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=i;j++) {
				System.out.print(num+" ");
				num+=1;
			}
		System.out.println();
		}
	}
}
