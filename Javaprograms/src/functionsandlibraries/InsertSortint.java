package functionsandlibraries;

import java.util.*;

import utility.Utility;
public class InsertSortint {
public static void main(String[] args)
{
	int s;
	
	
	System.out.println("Enter the range for elements in an array");
	Scanner sc = new Scanner(System.in);
	s = Utility.inputInteger();
	int[] arr = new int[s];
	System.out.println("Enter the elements");
	for(int i=0; i<s; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Elements in array:");
	for(int i=0; i<s; i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("Array after sorting:");
	int sorted[]=Utility.insertionSort(arr);
	for(int i=0; i<s; i++)
	{
    System.out.println(sorted);
	}
    sc.close();
}
}
