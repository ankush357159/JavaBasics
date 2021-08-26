package javaBasics;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		
				
		//Using Scanner for getting Input from user		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter any string: ");
		String s = in.nextLine();		
		System.out.println("You entered string: "+s);
		
		System.out.print("Enter any integer: ");
		int a = in.nextInt();
		System.out.println("You entered integer: "+a);
		
		System.out.println("Enter any float: ");
		float b = in.nextFloat();
		System.out.println("You entered float: "+b);
		
		in.close();
		
		//Using user's input by System.console class
		//This method is helpful for reading password without echoing it
		//System.out.println("Enter a string (console): ");
		//String name = System.console().readLine();//		
		//System.out.println("You entered string: "+name);

	}

}
