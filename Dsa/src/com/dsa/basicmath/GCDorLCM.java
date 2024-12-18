package com.dsa.basicmath;

import java.util.Scanner;

public class GCDorLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int GCD = 1;
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		for (int i=1 ; i<=(int)Math.min(num1, num2);i++) {
			if(num1%i == 0 && num2%i == 0) {
				GCD = i;
			}
		}
		System.out.println("GCD of "+ num1 +" and " + num2 + " is " + GCD );
		
		sc.close();
	}

}
