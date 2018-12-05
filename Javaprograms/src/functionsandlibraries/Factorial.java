package functionsandlibraries;

import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
import utility.Utility;
public class Factorial {
public static void main(String[] args)
{
	 int num7;
     BLStdOut.println("Enter the number you want factorial of: ");
     num7 = Utility.inputInteger();
     if(num7<0)
     {
    	 System.out.println("Please enter a valid number");
     }
 
    	 

     MathFunction.factorial(num7);
    }
}
