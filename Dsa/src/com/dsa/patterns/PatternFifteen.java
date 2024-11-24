package com.dsa.patterns;

public class PatternFifteen {

	public PatternFifteen(int n) {
		for(int i=0;i<=n;i++) {
			for(char ch='A';ch<='A'+(n-i-1);ch++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
	}
}
