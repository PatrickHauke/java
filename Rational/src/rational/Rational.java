
package rational;

import java.util.Scanner;


public class Rational {
	private int numerator;
	private int denominator;
	
	public int getGCD(int num1,int num2){
		if(num2 == 0)
			return num1;
		return getGCD(num2,num1%num2);
                //Sets to smallest valid value
	}
	
	public Rational(int numerator, int denominator) {
		boolean sign = false;
		if((numerator < 0 && denominator >= 0) || (numerator >= 0 && denominator < 0))
			sign = true;
		numerator = Math.abs(numerator); //returns absolute value of input.
		denominator = Math.abs(denominator);
		
		int gcd = getGCD(numerator, denominator);
		this.numerator = numerator / gcd; //passes new value into private class
		this.denominator = denominator / gcd;
		if(sign)
			this.numerator *= -1;
	}
	
	public Rational(){
		//Just so Java has something to build off of
                // Rational() acts as a container for all methods held in it.
	}
	
        //Add two rational numbers
	public static Rational add(Rational num1, Rational num2){
		int num = (num1.numerator * num2.denominator) + (num2.numerator * num1.denominator);
		int den = num1.denominator * num2.denominator;
		return new Rational(num, den);
	}
	//Subtract two rational numbers
	public static Rational subtract(Rational num1, Rational num2){
		int num = (num1.numerator * num2.denominator)-(num2.numerator * num1.denominator);
		int den = num1.denominator * num2.denominator;
		return new Rational(num, den);
	}
	//Multiply two rational numbers
	public static Rational multiply(Rational num1, Rational num2){
		int num = num1.numerator * num2.numerator;
		int den = num1.denominator * num2.denominator;
		return new Rational(num, den);
	}
	//Divide two rational numbers
	public static Rational divide(Rational num1, Rational num2){
		int num = num1.numerator * num2.denominator;
		int den = num1.denominator * num2.numerator;
		return new Rational(num, den);
	}
	
	public String inRationalForm(){
		return "Number in Rational Number : " + numerator + "/" + denominator;
                //sets form for final output
	}
	
	public String inFloating(int digit){
		double res = (double)numerator/denominator;
		double num = 1.0;
		for(int i = 0;i < digit;i++)
			num *= 10; //determines value in decimal format. So ((num/den) * 10) / 10
		res = Math.round(res * num) / num; // Rounds to nearest value if available (cuts out 0's)
		return "Number in floating point format: " + res;
	}
	
	public static void main(String[] args) { // Required to run the code.
		int num1,den1,num2,den2,d;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the numerator of first number: ");
		num1 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter the denominator of first number: ");
		den1 = scan.nextInt();
		scan.nextLine();
		
		Rational R1 = new Rational(num1,den1);
		// Above is initial input for first rational number
		System.out.print("Enter the numerator of second number: ");
		num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Enter the denominator of second number: ");
		den2 = scan.nextInt();
		scan.nextLine();
		
		Rational R2 = new Rational(num2,den2);
		// Above is initial input for second rational number
		System.out.print("Enter the number of decimal places to include: ");
		d = scan.nextInt();
		scan.nextLine();
		
                scan.close();
                
		Rational R; //Call an object to allow of operations to occur
		
		System.out.println("\n\nRational Number 1:");
		System.out.println(R1.inRationalForm());
		System.out.println(R1.inFloating(d));
		
		System.out.println("\nRational Number 2:");
		System.out.println(R2.inRationalForm());
		System.out.println(R2.inFloating(d));
		
		System.out.println("\nAddition:");
		R = add(R1, R2);
		System.out.println(R.inRationalForm());
		System.out.println(R.inFloating(d));
		
		System.out.println("\nSubtraction:");
		R = subtract(R1, R2);
		System.out.println(R.inRationalForm());
		System.out.println(R.inFloating(d));
		
		System.out.println("\nMultiplication:");
		R = multiply(R1, R2);
		System.out.println(R.inRationalForm());
		System.out.println(R.inFloating(d));
		
		System.out.println("\nDivision:");
		R = divide(R1, R2);
		System.out.println(R.inRationalForm());
		System.out.println(R.inFloating(d));
		
	}
}
/* 
The constructor is what is used to build an arguement
The class acts as the blueprint for 
The method is the way of going about doing a particular task

*/