package com.dsa.arrays.easy;

public class Find_Missing_number_in_Array {
  public static void main(String[] args) {
	int[] arr = {1,2,4,5};
	int N=5;
	int n= arr.length;
	
	
	//brutforce
	
	for(int i=1;i<=N;i++) {
		int flag = 0;
		
		for(int j=0;j<n-1;j++) {
			if(arr[j] == i) {
				flag =1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println(i);
			break;
		}
	}
	
	
	//optimal
	
	int sum = N*(N+1)/2;
	int s2 = 0;
	for(int i=0;i<n;i++) {
		s2+=arr[i];
	}
	System.out.println(sum-s2);
	
	
	//Xor
	
	int xor1 = 0;
//	for(int i=1;i<=N;i++) {
//		xor1= xor1^i;
//	}
//	
	int xor2 = 0;
	for(int i=0;i<N-1;i++) {
		xor2= xor2^arr[i];
		xor1= xor1^(i+1);
	}
	xor1 = xor1^N;
	
	System.out.println(xor1^xor2);
	
	
	
	
	
	
}
}
