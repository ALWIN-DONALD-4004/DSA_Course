package com.dsa.arrays.easy;

public class Linear_search {
	
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int target = 4;
	int n = arr.length;
	for(int i=0 ; i<n ;i++) {
		if(arr[i] == target) {
			System.out.println(i);
		}
	}
  }
}
