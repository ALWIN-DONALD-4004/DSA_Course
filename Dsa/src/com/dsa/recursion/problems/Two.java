
// to print linearly from 1 to N.

package com.dsa.recursion.problems;

import java.util.Scanner;

public class Two {
	
	void numbers(int i, int n) {
		if(i>n) {
			return;
		}
		System.out.print(i + " ");
		numbers(i+1,n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Two t1 = new Two();
		
		int num = sc.nextInt();
		
		t1.numbers(1,num);
		
		sc.close();
	}

}
