package com.dsa.patterns;

public class PatternTwenty {

		public PatternTwenty(int n) {
			
			int inistate = 2*n-2;
			for(int i=1;i<=2*n-1;i++) {
				
				int star = i;
				if(i>n) {
					star=2*n-i;
				}
				
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				
				
				for(int j=1;j<=inistate;j++) {
					System.out.print(" ");
				}
				
				
				for(int j=1;j<=star;j++) {
					System.out.print("*");
				}
				System.out.println();
				if(i<n) {
					inistate-=2;
				}
				else {
					inistate+=2;
				}
			}
			
		}
}
