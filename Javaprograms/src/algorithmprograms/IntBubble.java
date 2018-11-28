package algorithmprograms;

import java.util.*;

import utility.Utility;

public class IntBubble {
public static void main(String[] args)
{
	Utility utility=new Utility();
	int[] num =new int[5];
	System.out.println("Enter the numbers:");
	for(int i=0;i<5;i++)
	{
		num[i]=utility.inputInteger();
	}
	System.out.println("The sorted list using Bubble sort is:");
	for(int i=0;i<5;i++)
	{
		utility.bubSort(num);
		System.out.println(num[i]);
	}
}
}
