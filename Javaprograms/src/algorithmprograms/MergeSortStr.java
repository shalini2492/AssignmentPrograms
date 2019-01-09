package algorithmprograms;

import utility.Utility;
public class MergeSortStr {
public static void main(String[] args)
{
	System.out.println("Enter the size of string array");
	int size=Utility.inputInteger();
	String[] arr=new String[size];
//	int First=0;
//	int last=size-1;
//	int mid=(First+last)/2;
	System.out.println("Enter elements..");
	for(int i=0; i<size; i++)
	{
		
		arr[i]=Utility.inputString();
	}
	System.out.println("String array: ");
	for(int i=0; i<size; i++)
	{
		System.out.println(arr[i]);
	}
	String[] array=Utility.mergeSort(arr);
	for(int i=0; i<size; i++)
	{
		System.out.println(array[i]); 
	}
}
}
