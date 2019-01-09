package algorithmprograms;

import utility.Utility;
public class SquareRoot {
	interface MyFunctionalInterface
	{
		public double squareRoot(int number);
	}
public static void main(String[] args)
{
	int c;
	
	System.out.println("Enter a number you want square root of: ");
	c= Utility.inputInteger();
	double epsilon = 1e-15;
	double t=c;
	
	MyFunctionalInterface f=number->Utility.sqroot(c);
	System.out.println(f.squareRoot(c));
}
}
