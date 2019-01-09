package algorithmprograms;

import java.util.*;

import utility.Utility;
public class BubSortString {
	interface MyFunctionalInterface
	{
		public String[] sortBubble(String[] arr);
	}
public static void main(String[] args)
{
	int range=0;
	Scanner sc=new Scanner(System.in);
	
     System.out.println("Enter the range for string array");
    range = Utility.inputInteger();
	String[] s1 = new String[range];
	System.out.println("Enter elements: ");
	for(int i=0; i<range; i++)
	{
		s1[i] = sc.nextLine();
	}
	System.out.println("Array is: ");
	for(int i=0; i<range; i++)
	{
		System.out.println(s1[i]);
	}
	
	System.out.println("String after bubble sort");
	//MyFunctionalInterface f=a->Utility.bubsortString(s1, range);
	//System.out.println(f.sortBubble(s1));
	for(int i=0; i<range; i++)
	{
		Utility.bubsortString(s1, range);
		System.out.println(s1[i]);
	}
	sc.close();
}
}
