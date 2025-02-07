package com.dsa.arrays.easy;

public class CheckThe_Array_is_Sorted {
	
	public static String checkSorted(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] >= arr[i+1]) {
				return "not sorted";
			}
		}
		return "sorted";
	}

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
		System.out.println(checkSorted(array));
	}

}
