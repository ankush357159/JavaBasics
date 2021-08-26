package javaBasics;

import java.util.Scanner;
public class GFG {

	public static void main(String[] args) {
		int num;
		
		System.out.print("Enter an integer: ");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		System.out.println("Entered integer is: "+num);
		
		sc.close();

	}

}
