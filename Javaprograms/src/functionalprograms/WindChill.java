/*purpose: To calculate value of windchill using formula.
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class WindChill {
	interface MyFunctionalInterface
	{
		public double windChill(double n);
	}
public static void main(String[] args)
{
	double t, v;
	
	System.out.println("Enter the valid temperature less than 50 in Fahrenheit");
	t = Utility.InputDouble();
	System.out.println("Enter the valid speed in miles per hour, should be between 3 and 120");
	v = Utility.InputDouble();
	
	MyFunctionalInterface f=n->Utility.calTemp(t, v);
	System.out.println(f.windChill(v));
}
}
