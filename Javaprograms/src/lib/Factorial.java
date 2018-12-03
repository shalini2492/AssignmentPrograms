package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import functionsandlibraries.BLStdOut;
public class Factorial {
public static void main(String[] args)
{
	 int num7;
     BLStdOut.println("Enter the number you want factorial of: ");
     num7 = Utility.inputInteger();
     MathFunction.factorial(num7);
}
}
