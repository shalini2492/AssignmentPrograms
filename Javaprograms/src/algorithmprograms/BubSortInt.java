package algorithmprograms;

import java.util.Scanner;

import utility.Utility;

public class BubSortInt {
public static void main(String[] args)
{
	int no=10;
	
	
	System.out.println("Enter no. of elements you want in an array");
	no = Utility.inputInteger();
	System.out.println("Enter the elements");
	Scanner sc = new Scanner(System.in);
	//arr1 = sc.nextInt();
	int[] arr1 = new int[no];
	
	
	for(int i=0; i<no; i++)
	{
		arr1[i] = sc.nextInt();
	}
	
	Utility.bubsortint(no, arr1);
	
	for(int i=0; i<no; i++)
	{
		System.out.println(arr1[i]);
	}
	sc.close();
}
}
