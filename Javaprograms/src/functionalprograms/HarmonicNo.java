/*purpose: To compute harmonic number of given number
 * author: Shalini
 * date: 16/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class HarmonicNo {
public static void main(String[] args)
{
	
	System.out.println("Enter the Number :");
	Integer number = Utility.inputInteger();

	System.out.println("The Harmonic series is :");
	double result =0.0;
	while(number > 0)
	{
		result = result + (double) 1/number;
		number--;
		System.out.println(result+ " ");
	}
	System.out.println(" ");
	System.out.println("The result of harmonic number: "+number+ " is " +result);
	//Integer output = utility.harmonicNo(number);
	//System.out.println(output);

}

}
