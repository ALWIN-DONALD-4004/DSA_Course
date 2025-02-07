package com.dsa.arrays.easy;

//import java.util.ArrayList;
import java.util.HashSet;

public class union_of_sorted_Arrays {	
	public static void main(String[] args) {
		
		//bruteforce
		HashSet<Integer> union = new HashSet<>();
		
		int[] arr1 = {1,1,2,3,4,5};
		int[] arr2 = {2,3,4,5,4,6};
		
		for(int i=0;i<arr1.length;i++) {
			union.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			union.add(arr2[i]);
		}
		
		System.out.println(union);
		
			  
	}
}
		

