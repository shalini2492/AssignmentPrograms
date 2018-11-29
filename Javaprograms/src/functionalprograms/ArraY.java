/* purpose: To find thhe repeated element in an array
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;
 import java.util.Scanner;

import utility.Utility;
public class ArraY {
public static void main(String[] args)
{
	int size;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements you want in array");
	size = Utility.inputInteger();
	int[] arr = new int[size];
	System.out.println("Enter the elements:");
	for(int i=0; i<size; i++)
	{
		arr[i] = sc.nextInt();
	}
	Utility.findRepeatedNo(arr, size);
	//System.out.println(x);
}
}
