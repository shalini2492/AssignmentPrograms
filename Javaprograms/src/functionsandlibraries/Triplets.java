/**purpose: To print sum of triplets.
 * author: Shalini
 * date: 22/11/2018
 * version:1.0
 */
package functionsandlibraries;

import standardlibrary.BLStdOut;
import utility.Utility;

public class Triplets {
public static void main(String[] args)
{
	

	//enter the array size
	System.out.print("Enter limit of array :");
	int size=Utility.inputInteger();
	int arr[]=new int [size];	//create array & read values one by one

	for(int i=0;i<arr.length;i++)
	{
		System.out.print("Enter "+(i+1)+" Value :");
		arr[i]=Utility.inputInteger();
	}

	int sum=Utility.triplets(arr,size);
	BLStdOut.print("No.of Triplets :"+sum);
	BLStdOut.println();
}
}
