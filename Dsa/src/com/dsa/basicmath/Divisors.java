package com.dsa.basicmath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// print all divisours of num 

public class Divisors {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// normal method with time complexity O(N)
 		int num = sc.nextInt();
//		
//		for(int i = 1 ; i<=num;i++) {
//			if(num%i == 0) System.out.print(i + " ");
//		}
		
 		ArrayList<Integer> a = new ArrayList<Integer>();
		
 		for(int i=1 ; i<=Math.sqrt(num);i++) { // i*i<=num
 			if(num%i == 0) {
 				a.add(i);
 				if(num/i != i) {
 					a.add(num/i);
 				}
 			}
 		}
 		Collections.sort(a);
 		
 		for(int var : a) {
 			System.out.print(var+" ");
 		}
 		
 		
 		sc.close();
	}
}
