package com.dsa.basicmath;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 0 ;
		
		while(num>0){
			
//			if(num%10 != 0) {
//				count+=1;
//			}
//			num/=10;
			
			count+=1;
			num/=10;
		}
	
		System.out.println(count);
		
		sc.close();
	}

}
