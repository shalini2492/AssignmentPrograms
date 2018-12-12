package functionsandlibraries;



import utility.Utility;

public class IntBubble {
public static void main(String[] args)
{
	int size;
	System.out.println("Enter the size of array");
	size=Utility.inputInteger();
	int[] num =new int[size];
	System.out.println("Enter the numbers:");
	for(int i=0;i<size;i++)
	{
		num[i]=Utility.inputInteger();
	}
	System.out.println("The sorted list using Bubble sort is:");
	int sorted[]=Utility.bubSort(num);
	for(int i=0;i<size; i++)
	{
		System.out.println(sorted[i]);
	}
}
}
