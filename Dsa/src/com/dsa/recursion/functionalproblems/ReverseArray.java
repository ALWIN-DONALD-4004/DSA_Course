package com.dsa.recursion.functionalproblems;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArray {
	
	public ArrayList<Integer> reverseArr(int i, ArrayList<Integer> arr) {
		int n = arr.size();
		if(i>=n/2) {
			return arr;
		}
		Collections.swap(arr,i,n-i-1); 
		return reverseArr(i+1, arr);
	}
	
  public static void main(String[] args) {
	
	  ReverseArray ra = new ReverseArray();
	  ArrayList<Integer>  arr = new ArrayList<Integer>();
	  Collections.addAll(arr, 1, 2, 3, 4, 5);

	  ArrayList<Integer> result = ra.reverseArr(0,arr);
	  System.out.println(result);
	  
}
}
