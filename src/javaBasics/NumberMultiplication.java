package javaBasics;

import java.util.Scanner;

public class NumberMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter any floating point number: ");		
		float f1 = sc.nextFloat();
		
		//System.out.println("");
		
		System.out.println("Enter other floating point number: ");
		float f2 = sc.nextFloat();
		
		// to store multiplied values
		float p = f1 * f2;
		
		sc.close();
		
		System.out.println("The product is: "+p);

	}

}
