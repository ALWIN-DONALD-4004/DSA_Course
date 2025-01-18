package com.dsa.sorting.part1;
import java.util.Arrays;

public class SelectionSort {
	
	public  void selectionsort(int[] arr,int n) {
		for(int i=0;i<=n-2;i++) { 
			int min = i;
			for(int j=i;j<=n-1;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}    
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}

