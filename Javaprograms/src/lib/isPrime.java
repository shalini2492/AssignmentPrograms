package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import functionsandlibraries.BLStdOut;
public class isPrime {
public static void main(String[] args)
{
	int num6;
	   BLStdOut.println("Enter any number");
    num6 = Utility.inputInteger();
    boolean isPrime = MathFunction.isPrime(num6);
    MathFunction.isPrime(num6);
    if(isPrime)
    {
 	   BLStdOut.println("Given number is prime");
    }
    else
 	   BLStdOut.println("Given number is not prime");
}
}
