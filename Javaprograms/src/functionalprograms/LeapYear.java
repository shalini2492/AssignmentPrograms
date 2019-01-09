/*purpose: To check whether the given 4-digit year is a leap year or not.
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class LeapYear 
{
	interface MyFunctionalInterface
	{
		public String checkLeap(int y);
	}
	public static void main(String[] args)
		{

		
		// Initializing variables
		System.out.println("Enter a leap year:");
		int year=Utility.inputInteger();
		MyFunctionalInterface f = y->Utility.checkLeapYear(year);
		System.out.println(f.checkLeap(year));
//		if(result)
//		{
//			System.out.println(year + " is a leap year");
//		}
//		else
//		{
//			System.out.println(year + " is not a leap year or year should be more than 1582");
//		}
	    	
	}
}
