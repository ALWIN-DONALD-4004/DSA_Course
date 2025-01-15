package com.dsa.recursion.functionalproblems;

public class Fibonacci {
	public int fibonacciNum(int n) {
		if(n<=1) {
			return n;
		}
		int last = fibonacciNum(n-1);
		int secondlast = fibonacciNum(n-2);
		return last+secondlast;
		
	}
public static void main(String[] args) {
	Fibonacci f1 = new Fibonacci();
	int result = f1.fibonacciNum(8);
	System.out.println(result);
}
}
