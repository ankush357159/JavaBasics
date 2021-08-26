package javaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestGFG {
	public static void main(String[] args) throws IOException {		
		
		System.out.print("Enter any number or string: ");
			
		//Enter data using BufferReader
		BufferedReader reader = new BufferedReader(
		new InputStreamReader(System.in));
		
		
		//Reading data using readLine
		String name = reader.readLine();
		
		//Printing the read line
		System.out.println(name);	

	}

}
