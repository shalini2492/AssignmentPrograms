package Algorithmprograms;

import Utility.Utility;
import java.util.*;
public class InsertSortint {
public static void main(String[] args)
{
	int s;
	
	 Utility utility = new Utility();
	System.out.println("Enter the range for elements in an array");
	Scanner sc = new Scanner(System.in);
	s = utility.inputInteger();
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
    int[] d = utility.insertionSort(arr);
    System.out.println(d);
}
}
