/**purpose: To return true or false if the given number is prime
 * author: Shalini
 * date: 3/12/2018
 * version: 1.0
 */
package functionsandlibraries;

import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
import utility.Utility;
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
