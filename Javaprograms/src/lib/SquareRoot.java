package lib;
import functionsandlibraries.MathFunction;
import utility.Utility;
public class SquareRoot {
public static void main(String[] args)
{
	 int num5;
     System.out.println("Enter the number you want square root of: ");
     num5 = Utility.inputInteger();
     MathFunction.sqroot(num5);
    
}
}
