package com.dsaproblems.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	static void moveZero(int[] arr) {
	  int count = 0;

      for (int i = 0; i < arr.length; i++) {

          // If the current element is non-zero
          if (arr[i] != 0) {

              // Swap the current element with the 0 at index 'count'
              int temp = arr[i];
              arr[i] = arr[count];
              arr[count] = temp;

              // Move 'count' pointer to the next position
              count++;
          } 
      }
      System.out.println(Arrays.toString(arr));
      
      }
	
	public static void main(String[] args) {
		 int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		 
		 moveZero(arr);
	}
}
