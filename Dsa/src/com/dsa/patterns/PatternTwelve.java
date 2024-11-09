package com.dsa.patterns;

public class PatternTwelve {
	
	PatternTwelve(int n) {
		 
		  int space = 2 *(n-1);
	        for(int i = 1 ; i<=n ;i++){
	            //number
	            for(int j = 1 ; j<=i; j++){
	                System.out.print(j );
	            }
	            //space
	          
	            for(int j=1 ; j<=space ; j++){
	                System.out.print(" ");
	                
	            }
	             for(int j = i ; j>=1; j--){
	                System.out.print(j);
	            }
	            System.out.println();
	            space -=2 ;
	        }
	}
}


