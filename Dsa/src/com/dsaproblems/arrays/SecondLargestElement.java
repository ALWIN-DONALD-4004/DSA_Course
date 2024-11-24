package com.dsaproblems.arrays;

public class SecondLargestElement {
	
	static int findSecond(int[] arr) {
		int firstlargest = -1;
		int secondlargest= -1;
		int length = arr.length;
		if(length<2) {
			return -1;
		}
		for(int i = 0 ; i<length;i++) {
			if(arr[i]>firstlargest) {
				secondlargest=firstlargest;
				firstlargest = arr[i];
			}
			else if(arr[i]<firstlargest && arr[i]>secondlargest) {
				secondlargest = arr[i];
			}
		}
		return secondlargest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {12,35,1,10,34,1};
		int[] arr1 = {10,5,10};
		int[] arr2 = {10,10,10};
		
		System.out.println(findSecond(arr));
		System.out.println(findSecond(arr1));
		System.out.println(findSecond(arr2));
	}
}