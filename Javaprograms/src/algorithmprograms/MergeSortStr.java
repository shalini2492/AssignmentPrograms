package algorithmprograms;

import utility.Utility;
public class MergeSortStr {
public static void main(String[] args)
{
	Utility utility=new Utility();
	int[] num =new int[5];
	System.out.println("Enter the numbers:");
	for(int i=0;i<5;i++)
	{
		num[i]=Utility.inputInteger();
	}
	System.out.println("The Given array is :");
	Utility.printArray(num);
	utility.sortInteger(num, 0, num.length-1);
	System.out.println("\nThe Sorted array is :"); 
    Utility.printArray(num); 
}
}
