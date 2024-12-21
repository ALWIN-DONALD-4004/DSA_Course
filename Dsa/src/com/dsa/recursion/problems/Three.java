// print from N to 1 , using recursion.

package com.dsa.recursion.problems;

import java.util.Scanner;

public class Three {
	
	void nto1(int n) {
		if(n<1) {
			return;
		}
		System.out.println(n);
		nto1(n-1);
	}
	
public static void main(String[] args) {
	Three t1= new Three();
	Scanner sc = new Scanner(System.in);
	t1.nto1(sc.nextInt());
}
}
