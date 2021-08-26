package javaBasics;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		int intNum;
		float floatNum;
		String str;
		
		Scanner input = new Scanner(System.in);
		
		//Get input String
		System.out.println("Enter a string: ");
		str = input.nextLine();
		System.out.println("Input string is : "+str);
		
		//Get input Integer
		System.out.println("Enter an integer: ");
		intNum = input.nextInt();
		System.out.println("Integer input is: " +intNum);
		
		//get input Float
		System.out.println("Enter a float number: ");
		floatNum = input.nextFloat();
		System.out.println("Float input is: "+floatNum);
		
		input.close();
		


	}

}
