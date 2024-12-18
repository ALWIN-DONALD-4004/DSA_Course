package com.dsa.basicmath;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=1 ; i*i<=num ; i++) {
			if(num%i == 0) {
				count++;
				if(num/i != 0 ) {
					count++;
				}
			}
		}
		
		if(count == 2) System.out.println("Prime number");
		else System.out.println("not Prime");
		
		sc.close();
	}

}
