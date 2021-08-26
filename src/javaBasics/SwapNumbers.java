package javaBasics;

public class SwapNumbers {
	
	static void swapNumbersUsingThirdVariables( int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		
		System.out.println("Value of m is "+m+ " and value of n is "+n);
		
		
	}

	public static void main(String[] args) {
		int m = 9, n=7;
		
		swapNumbersUsingThirdVariables(m, n);

	}

}
