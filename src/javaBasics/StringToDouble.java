package javaBasics;

public class StringToDouble {

	public static void main(String[] args) {
		// Create String
		String str = "12345.020304";

		// Convert string into double with Double.parseDouble() method
 		double str1 = Double.parseDouble(str);
		System.out.println(str1);
		
		// Convert string into double with Double.valueOf() method
		double str2 = Double.valueOf(str1);
		System.out.println(str2);
		
		
 		

	}

}
