/*purpose: To compute roots using given formula
 * author: Shalini
 * date: 17/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;
public class Quadratic {
	interface MyFunctionalInterface
	{
		public int root(int a);
	}
public static void main(String[] args)
{
	System.out.println("Enter the The values of a,b and c");
	int x=Utility.inputInteger();
	int y=Utility.inputInteger();
	int z=Utility.inputInteger();
	
	MyFunctionalInterface f=a->Utility.quad(x, y, z);
	System.out.println(f.root(x));
	}
}
