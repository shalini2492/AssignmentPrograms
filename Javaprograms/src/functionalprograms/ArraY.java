package functionalprograms;
 import java.util.Scanner;

import utility.Utility;
public class ArraY {
public static void main(String[] args)
{
	int size;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of elements you want in array");
	size = Utility.inputInteger();
	int[] arr = new int[size];
	System.out.println("Enter the elements:");
	for(int i=0; i<size; i++)
	{
		arr[i] = sc.nextInt();
	}
	Utility.findRepeatedNo(arr, size);
}
}
