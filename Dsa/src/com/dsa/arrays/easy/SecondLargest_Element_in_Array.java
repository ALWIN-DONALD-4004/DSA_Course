package com.dsa.arrays.easy;

public class SecondLargest_Element_in_Array {
	
	

	public static void main(String[] args) {
		int[] arr = {1,2,4,7,7,5,8};
		
		int largest = arr[0];
		int SecondLargest = -1;
		
		for(int i=1 ;i<arr.length;i++) {
			if(arr[i]>largest) {
				SecondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>SecondLargest && arr[i]<largest) {
				SecondLargest = arr[i];
			}	
		}
		System.out.println(SecondLargest);
	}		

	}

