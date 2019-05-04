package recursion;

import java.util.Scanner;

public class Recursion {

	public static void main (String [] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a positive integar: ");
		int n = reader.nextInt();
		
	System.out.print(factorial (n));
	
	}
	
	public static long factorial(int n) {
		 if (n==0)
			 return 1;
		 else 
			 return n* factorial (n-1);
	}
	
}

