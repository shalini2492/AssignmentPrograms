/*purpose: To compute roots using given formula
 * author: Shalini
 * date: 17/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;
public class Quadratic {
public static void main(String[] args)
{
	System.out.println("Enter the The values of a,b and c");
	int x=Utility.inputInteger();
	int y=Utility.inputInteger();
	int z=Utility.inputInteger();
	
	Utility.quad(x, y, z);
	}
}
