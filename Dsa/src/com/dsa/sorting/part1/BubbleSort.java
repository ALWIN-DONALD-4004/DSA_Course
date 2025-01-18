
package com.dsa.sorting.part1;

import java.util.Arrays;

public class BubbleSort {
	
	public void bubbleSort(int[] arr,int n) {
		for(int i=n-1;i>=0;i--) {
			int didswap = 0;
			for(int j=0 ; j<=i-1 ;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					didswap = 1;
				}						
			}	
			if(didswap==0) {
				break;
			}
			System.out.println("runs");
		}
		System.out.println(Arrays.toString(arr));
	}
}
