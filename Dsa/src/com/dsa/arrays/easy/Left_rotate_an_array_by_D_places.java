package com.dsa.arrays.easy;

import java.util.Arrays;

public class Left_rotate_an_array_by_D_places {
	
	public static int[] reverse(int[] arr , int start , int end) {
		while(start<=end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}
	
	
 public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7};
	int d = 2;
	System.out.println("Orginal array : " + Arrays.toString(arr));
	
	
	// Brute Force        T.C = o(d)+o(n-d)+o(d) = O(n+d)   extra space = o(d) 
 	int n = arr.length;
	d = d%n;
//	int[] temp = new int[d];
//	for(int i=0;i<d;i++) {
//		temp[i] = arr[i];
//	}	
//	for(int i=d;i<n;i++) {
//		arr[i-d] = arr[i];
//	}
//	for(int i = n-d ; i<n;i++) {
//		arr[i] = temp[i-(n-d)];
//	}
//	System.out.println(Arrays.toString(arr));
	
	
	
	reverse(arr, 0, d-1);
	reverse(arr,d,n-1);
	reverse(arr,0,n-1);
	System.out.println(Arrays.toString(arr));
	
}
}
