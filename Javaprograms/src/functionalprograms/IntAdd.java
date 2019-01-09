/*purpose: To add three numbers in such a way that the result should come 0.
 * author: Shalini
 * date: 20/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class IntAdd {
	interface MyFunctionalInterface
	{
		public int numTriplets(int[] array);
	}

public static void main(String[] args)
{
	
	System.out.println("Enter limit of array");
	int n = Utility.inputInteger();
	
	int[] array=new int[n];
	System.out.println("Enter array elements");
	for(int i=0; i<n; i++)
	{
		array[i]=Utility.inputInteger();
	}
	
     MyFunctionalInterface f=a->Utility.triplets(array, n);
     System.out.println(f.numTriplets(array));
    //System.out.println(m);
}
}
