/**purpose: To return a sorted string array using merge sort
 * author: Shalini
 * date: 24/11/2018
 * version: 1.0
 */
package functionsandlibraries;

import utility.Utility;

public class MergeSortString {
public static void main(String[] args) 
{
	int size;

	System.out.println("Enter the size of array of strings");
	size = Utility.inputInteger();
	String[] str = new String[size];
	System.out.println("Enter the strings");
	for(int i=0; i<size; i++)
	{
		str[i] = Utility.inputString();
	}
	
	System.out.println("After merge sort...strings are:");
	for(int i=0; i<size; i++)
	{
	Utility.mergeSort(str);
	
	System.out.println(str[i]);
	}
}
}
