package com.dsa.hashing;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // Pre-compute frequencies using java.util.HashMap
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // Input number of queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            // Fetch frequency, default to 0 if the number is not in the map
            System.out.println(hash.getOrDefault(number, 0));
        }

        sc.close();
    }
}
