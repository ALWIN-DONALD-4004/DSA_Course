package com.dsa.sorting.part2;

public class MergeSort {
	
	public static void mergeSort(int[] arr,int left, int right) {
		if(left < right) {
			int mid = (left+right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			merge(arr,left,mid,right);
		}
	}
	
	
	  private static void merge(int[] array, int left, int middle, int right) {
	        // Sizes of the two subarrays
	        int n1 = middle - left + 1;
	        int n2 = right - middle;

	        // Temporary arrays
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        // Merge the temporary arrays

	        int i = 0, j = 0;
	        int k = left; // Initial index of the merged subarray

	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                array[k] = leftArray[i];
	                i++;
	            } else {
	                array[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements of leftArray[]
	        while (i < n1) {
	            array[k] = leftArray[i];
	            i++;
	            k++;
	        }

	        // Copy remaining elements of rightArray[]
	        while (j < n2) {
	            array[k] = rightArray[j];
	            j++;
	            k++;
	        }
	        
	     // Copy data to temporary arrays
	        for (int i1 = 0; i1 < n1; i1++)
	            leftArray[i] = array[left + i1];
	        for (int j1 = 0; j1 < n2; j1++)
	            rightArray[j1] = array[middle + 1 + j1];
	    }

	

	public static void main(String[] args) {
		int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        for (int num : array) {
            System.out.print(num + " ");
        }

        mergeSort(array, 0, array.length - 1);

        System.out.println("\n\nSorted Array");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}


