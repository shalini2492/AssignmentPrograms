package algorithmprograms;

import java.util.*;

import utility.Utility;
public class BubSortString {
public static void main(String[] args)
{
	int range=3;
	
	
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the range for stirng array");
	
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
	String[] s = Utility.bubsortString(s1, range);
	System.out.println("String after bubble sort");
	for(int i=0; i<range; i++)
	{
		System.out.println(s[i]);
	}
	sc.close();
}
}