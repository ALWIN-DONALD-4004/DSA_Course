package com.dsa.recursion.functionalproblems;

public class StringPalindrome {
	
	public Boolean palindrome(int i , String S) {
		int n = S.length();
		if(i>=n/2) return true;
		if(S.charAt(i)!=S.charAt(n-i-1)) return false;
		return palindrome(i+1, S);
	}
	
  public static void main(String[] args) {
	StringPalindrome sp = new StringPalindrome();
	Boolean result = sp.palindrome(0,"MADAM");
	System.out.println(result);
}
}
