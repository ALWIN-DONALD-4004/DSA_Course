package com.dsa.basicmath;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int revnum = 0;
		
		while(num>0) {
			int lastDigit = num%10;
			revnum = (revnum * 10) + lastDigit;
			num/=10;
		}
		
		System.out.println(revnum);
		
		sc.close();
	}

}
