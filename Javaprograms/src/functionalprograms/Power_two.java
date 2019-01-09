/*purpose: To compute the power of 2 of given number till that number.
 * author: Shalini
 * date: 18/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class Power_two {
	interface MyFunctionalInterface
	{
		public double power(int no);
	}
public static void main(String[] args)
{
	
    int num = Integer.parseInt(args[0]);
   
    //System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
    MyFunctionalInterface f=no->Utility.powertwo(num);
    System.out.println(f.power(num));
}
}
