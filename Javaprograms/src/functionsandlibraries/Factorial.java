/**purpose: To print factorial of given number
 * author: Shalini
 * date: 5/12/2018
 * version: 1.0
 */
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
     
 
    	 

     MathFunction.fact(num7);
    }
}
