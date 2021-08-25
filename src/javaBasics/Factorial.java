package javaBasics;

import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		
		int number = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("Factors of " + number + " are: ");
		findFactor(number, 1);

	}
	
	public static void findFactor(int n, int i) {
		
		if (i <= n) {
			
			// check divisible or not
			
			if (n % i == 0)
				System.out.print(i + " ");
			
			findFactor(n, i+1);
		} // else return
	}

}
