// print 1 to N , using backtracking


package com.dsa.recursion.problems;

import java.util.Scanner;

public class Four {
	
	void OnetoN(int i,int n) {
		if(i<1) {
			return;
		}
		OnetoN(i-1,n);
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Four f1 = new Four();
		
		int n = sc.nextInt();
		
		f1.OnetoN(n,n);
		
		sc.close();

	}

}
