package Algorithmprograms;

import Utility.Utility;

public class BubSortInt {
public static void main(String[] args)
{
	int n=10;
	int[] arr1 = new int[n];
	Utility utility = new Utility();
	System.out.println("Enter no. of elements you want in an array");
	n = utility.inputInteger();
	System.out.println("Enter the elements");
	//arr1 = utility.inputInteger();
	int t = utility.bubsortint(n);
	System.out.println(t);
}
}