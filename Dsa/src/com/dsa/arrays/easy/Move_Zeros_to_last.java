package com.dsa.arrays.easy;

import java.util.Arrays;

public class Move_Zeros_to_last {
public static void main(String[] args) {
	int[] arr = {1,2,0,3,4,0,3,0};
	int n = arr.length;
	int j = -1;
	for(int i=0;i<n;i++) {
		if(arr[i]==0) {
			j=i;
			break;
		}
	}
	
	for(int i = j+1;i<n;i++) {
		if(arr[i]!=0) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
	}
	
	System.out.println(Arrays.toString(arr));
 }
}
