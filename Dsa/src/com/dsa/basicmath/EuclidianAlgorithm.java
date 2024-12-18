package com.dsa.basicmath;

import java.util.Scanner;

public class EuclidianAlgorithm {
	public static void main(String[] args) {
		
		//this algorithm is used to find GCD by gcd(a,b)--->gcd(a-b,b)----->gcd(0,b)
        //#b is gcd // if(a!=0) gcd is a
		//a>b
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		while(num1>0 && num2>0) {
			if(num1>num2) {
				num1 = num1%num2;
			}
			else {
				num2 = num2%num1;
			}

		}
		
		if(num1 == 0) {
			System.out.println("the GCD is " + num2);
		}
		else {
			System.out.println("the GCD is "+ num1);
		}
		
		sc.close();
	}
}
