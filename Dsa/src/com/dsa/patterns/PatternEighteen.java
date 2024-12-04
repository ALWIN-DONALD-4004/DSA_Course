package com.dsa.patterns;

public class PatternEighteen {
	
	public PatternEighteen(int n) {
		
		for(int i=0;i<n;i++) {
		
			for(char ch=(char) ('E'-i);ch<='E';ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
