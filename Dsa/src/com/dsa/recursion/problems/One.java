
//print your name n times using recursion.   T.C == O(N) , S.C = O(N)

package com.dsa.recursion.problems;
import java.util.Scanner;

public class One {

   void name(int i,int n) {
	if(i>n) {
		return;
	}
	System.out.println("Alwin Donald");
	name(i+1,n);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		One o1 = new One();
		int num = sc.nextInt();
		
		o1.name(1,num);
		
		sc.close();

	}

}
