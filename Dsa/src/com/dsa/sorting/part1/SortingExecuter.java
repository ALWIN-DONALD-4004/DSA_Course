package com.dsa.sorting.part1;
import java.util.Scanner;

public class SortingExecuter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many elements in array");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	
	//selection Sort
//	SelectionSort s1 = new SelectionSort();
//	s1.selectionsort(arr,n);
	
	
	System.out.println();
	
	//bubble Sort
//	BubbleSort b1 = new BubbleSort();
//	b1.bubbleSort(arr, n);
	
	//InsersionSort
	InsersionSort i1 = new InsersionSort();
	i1.insersionSort(arr, n);
}
}

