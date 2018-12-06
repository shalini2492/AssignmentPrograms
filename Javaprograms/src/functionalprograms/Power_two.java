/*purpose: To compute the power of 2 of given number till that number.
 * author: Shalini
 * date: 18/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class Power_two {
public static void main(String[] args)
{
	
    int number = Integer.parseInt(args[0]);
    if(number<0)
    {
    	System.out.println("Invalid input....Please enter a valid number");
    	number=Utility.inputInteger();
    }
    System.out.println("Power of 2^"+number+" is: "+(Math.pow(2, number)));
    Utility.powertwo(number);
    
}
}
