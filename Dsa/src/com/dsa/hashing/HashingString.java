package com.dsa.hashing;

import java.util.Scanner;

public class HashingString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	
	
	//precompute
	int[] hash = new int[256];
	for(int i=0 ; i<=s.length()-1;i++) {
		hash[s.charAt(i)]++;
	}
	
	int q = sc.nextInt();
	while(q-- > 0) {
		char character =  sc.next().charAt(0);  
		//fetching
		System.out.println(hash[character]);	
	}
	sc.close();
}
}
