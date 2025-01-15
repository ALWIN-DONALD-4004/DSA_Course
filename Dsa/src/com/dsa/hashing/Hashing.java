package com.dsa.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Hashing {
	public static int hash[] = new int[10000000];

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String[] input = sc.nextLine().split(" ");

        
        
        for (int i = 0; i < n; i++) {
        	 arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(Arrays.toString(arr));
        
        //precompute
        for (int i = 0; i < n; i++) {
          hash[arr[i]]++;
        }

 
        int q = sc.nextInt();

        while(q-- >0) {
        	int number = sc.nextInt();
        	System.out.println(number +"------>"+hash[number]);

        }
        sc.close(); // Close the scanner
	}

}
