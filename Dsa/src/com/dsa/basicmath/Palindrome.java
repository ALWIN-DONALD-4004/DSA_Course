package com.dsa.basicmath;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		final int  a = num;
		int revnum = 0;
		
		while(num>0) {
			int ld = num%10;
			revnum = (revnum*10)+ld;
			num/=10;
		}
		
		if(revnum == a) System.out.println("num is palindrome");
		else System.out.println("not a palindrome");
		
		sc.close();
	}

}
