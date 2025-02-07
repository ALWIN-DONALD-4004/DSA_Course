package com.dsa.arrays.easy;

public class Maximum_consigutive_1s {
  public static void main(String[] args) {
	
	  int[] arr = {1,1,0,1,1,1,0,1,1};
	  int max1 = 0;
	  int count = 0;
	  for(int i=0 ;i<arr.length;i++) {
		  if(arr[i] == 1) {
			  count++;
			  max1 = Math.max(max1,count);
		  }
		  else {
			  count=0;
		  }
	  }
	  
	  System.out.println(max1);
	  
}
}
