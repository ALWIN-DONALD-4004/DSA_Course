package com.dsa.sorting.part1;

import java.util.Arrays;

public class InsersionSort {
	
	public void insersionSort(int[] arr,int n) {
		for(int i=0;i<=n-1;i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] =arr[j];
				arr[j] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
