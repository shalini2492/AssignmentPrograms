package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;

public class isPrime {
public static void main(String[] args)
{
	int num6;
	   System.out.println("Enter any number");
    num6 = Utility.inputInteger();
    boolean isPrime = MathFunction.isPrime(num6);
    MathFunction.isPrime(num6);
    if(isPrime)
    {
 	   System.out.println("Given number is prime");
    }
    else
 	   System.out.println("Given number is not prime");
}
}
