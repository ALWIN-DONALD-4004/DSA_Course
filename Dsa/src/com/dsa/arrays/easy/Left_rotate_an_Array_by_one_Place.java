package com.dsa.arrays.easy;

import java.util.Arrays;

public class Left_rotate_an_Array_by_one_Place {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		System.out.println("Orginal array : " + Arrays.toString(arr));
		
		int n = arr.length;
		int temp = arr[0];
		for(int i=1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
		
		System.out.println(Arrays.toString(arr));
	}
}
