package functionalprograms;

import java.util.Scanner;

import utility.Utility;
public class SecondLargestElement {
public static void main(String[] args)
{
	int i, n;
	System.out.println("Enter the limit of array");
	Scanner sc = new Scanner(System.in);
	n = Utility.inputInteger();
	int[] arr = new int[n];
	System.out.println("Enter the elements");
	for(i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Elements in array are: ");
	for(i=0; i<n; i++)
	{
		System.out.println(arr[i]);
	}
	Utility.findSecondLarge(arr);
	
/*	Utility.findSecondLarge(new int[] {45, 51, 28, 75, 49, 42});
	 
    Utility.findSecondLarge(new int[] {985, 521, 975, 831, 479, 861});

    Utility.findSecondLarge(new int[] {9459, 9575, 5692, 1305, 1942, 9012});

    Utility.findSecondLarge(new int[] {47498, 14526, 74562, 42681, 75283, 45796});
*/
	
}
	/*int n;
	System.out.println("Enter the limit of array");
	Scanner sc=new Scanner(System.in);
	n=Utility.inputInteger();
	int[] arr = new int[n];
	System.out.println("Enter the elements in array");
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Given array is: ");
	for(int i=0; i<n; i++)
	{
		System.out.println(arr[i]);
	}
	Utility.findSecondLarge(arr, n);*/
	
	
	 


}
