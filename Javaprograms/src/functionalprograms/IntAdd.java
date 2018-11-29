/*purpose: To add three numbers in such a way that the result should come 0.
 * author: Shalini
 * date: 20/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class IntAdd {
public static void main(String[] args)
{
	
	System.out.println("Enter limit of array");
	int n = Utility.inputInteger();
	
	int[] a=new int[n];
	System.out.println("Enter array elements");
	for(int i=0; i<n; i++)
	{
		a[i]=Utility.inputInteger();
	}
	
     int[] m = Utility.triplets(a);
    System.out.println(m);
}
}
