/*purpose: To perform different mathematical operations on input of double type from 0 10 1
 * author: Shalini
 * date: 26/11/2018
 * version: 1.0
 */
package functionalprograms;
import utility.Utility;
public class DoubleOpt {
public static void main(String[] args)
{
	double a, b, c;
	
	System.out.println("Enter the values of a, b and c");
	a = Utility.InputDouble();
	b = Utility.InputDouble();
	c = Utility.InputDouble();
    Utility.doubleOpt(a, b, c);
    
}
}
