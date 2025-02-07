package com.dsa.arrays.easy;

import java.util.ArrayList;

public class Intersection_of_two_sorted_Array {
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,6,7};
		
		ArrayList<Integer> inter = new ArrayList<>();
		
		int i=0;
		int j=0;
		
		int n = arr1.length;
		int m = arr2.length;
		
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]){
				j++;
			}
			else {
				inter.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		System.out.println(inter);
		
 		
	}
}
