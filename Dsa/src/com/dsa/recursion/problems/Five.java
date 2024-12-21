package com.dsa.recursion.problems;

public class Five {
	
	void Nto1(int i , int n) {
		if(i>n) {
			return;
		}
		Nto1(i+1,n);
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		Five f2 = new Five();
		
		f2.Nto1(1, 5);

	}

}
