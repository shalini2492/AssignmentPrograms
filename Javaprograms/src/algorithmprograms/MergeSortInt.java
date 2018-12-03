package algorithmprograms;

import utility.Utility;
public class MergeSortInt {
public static void main(String[] args)
{
	int size;
	System.out.println("Enter the range of array..");
	size = Utility.inputInteger();
	int[] num =new int[size];
	System.out.println("Enter the numbers:");
	for(int i=0;i<size;i++)
	{
		num[i]=Utility.inputInteger();
	}
	System.out.println("The Given array is :");
	Utility.printArray(num);
	Utility.sortInteger(num, 0, num.length-1);
	System.out.println("\nThe Sorted array is :");
	for(int i=0; i<size; i++)
	{
    Utility.printArray(num);
    System.out.println(num[i]);
	}
}
}
