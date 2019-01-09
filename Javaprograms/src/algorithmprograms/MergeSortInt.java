package algorithmprograms;

import utility.Utility;
public class MergeSortInt {
	interface MyFunctionalInterface
	{
		public int[] sortArray(int a);
	}
public static void main(String[] args)
{
	
	int[] num =new int[5];
	System.out.println("Enter the numbers:");
	for(int i=0;i<5;i++)
	{
		num[i]=Utility.inputInteger();
	}
	System.out.println("The Given array is :");
	Utility.printArray(num);
	MyFunctionalInterface f=arr->Utility.sortInteger(num, 0, num.length-1);
	System.out.println("\nThe Sorted array is :"); 
	for(int i=0; i<num.length; i++)
	{
	System.out.println(f.sortArray(num[i]));
	}
   // Utility.printArray(num); 
}
}
