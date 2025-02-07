package com.dsa.arrays.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_From_Array {
	
	//better(using set)
	public static String better(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0 ;i<arr.length-1;i++) {
			set.add(arr[i]);
		}
		
		int index = 0;
		for(int var:set) {
			arr[index] = var;
			index++;
		}
		
		return Arrays.toString(Arrays.copyOf(arr, set.size()));
	}
	
	//optimal (two pointers Approach)


	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,3,5,6,6};
		System.out.println(better(arr));
		

	}

}
