/**purpose: to find square root of user given input.
 * author: Shalini
 * date: 23/11/2018
 * version: 1.0
 */
package functionsandlibraries;
import standardlibrary.BLStdOut;
import standardlibrary.MathFunction;
import utility.Utility;
public class SquareRoot {
public static void main(String[] args)
{
	 int num5;
     BLStdOut.println("Enter the number you want square root of: ");
     num5 = Utility.inputInteger();
     MathFunction.sqroot(num5);
    
}
}
