package com.dsa.basicmath;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		final int temp = num;

		int amsnum = 0;
		
		int count = String.valueOf(num).length();
		
		while(num>0) {
			int ld = num%10;
			amsnum = (int) (amsnum + Math.pow(ld,count));
			num/=10;			
		}
		
		if(temp == amsnum) System.out.println("Armstrong number");
		else System.out.println("not Amstrong number");
		
		sc.close();
	}

}
