package javaBasics;

public class ComplexNumber {
	int real, imaginary;
	
	//Constructor
	public ComplexNumber (int r, int i) {
		this.real = r;
		this.imaginary = i;
	}
	
	public void showC() {
		System.out.println(this.real + "+i" + this.imaginary);
	}
	
	public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		ComplexNumber res = new ComplexNumber (0, 0);
		
		//add real parts of both complex numbers
		res.real = n1.real + n2.real;
		
		//add imaginary parts of both complex numbers
		res.imaginary = n1.imaginary + n2.imaginary;
		
		return res;
	}

	public static void main(String[] args) {
		
		ComplexNumber c1 = new ComplexNumber (4,5);
		ComplexNumber c2 = new ComplexNumber (10,5);
		
		System.out.print("First complex number: ");
		c1.showC();
		
		System.out.print("\nSecond complex number: ");
		c2.showC();
		
		//calling add() to perform addition
		ComplexNumber res = add(c1,c2);
		
		//display addition
		System.out.print("\nAddition is: ");
		res.showC();
		

	}

}
