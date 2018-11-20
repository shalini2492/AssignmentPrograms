package Algorithmprograms;

import java.util.*;
import Utility.Utility;

public class IntBubble {
public static void main(String[] args)
{
	int range, n;
	System.out.println("Enter the range of array");
	Utility utility = new Utility();
	Scanner sc = new Scanner(System.in);
	range = utility.inputInteger();
	int[] sort= new int[range];
	System.out.println("Enter the elements for sorting");
	for(int i=0; i<range; i++)
	{
		sort[i] = sc.nextInt();
	}
	System.out.println("Elements are:");
	for(int i=0; i<range; i++)
	{
		System.out.println(sort[i]);
	}
	System.out.println("Elements after sorting:");
    int[] d = utility.bubSort(sort);
    System.out.println(d);
}
}
