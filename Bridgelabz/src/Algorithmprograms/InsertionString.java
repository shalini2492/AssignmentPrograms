package Algorithmprograms;

import java.util.Scanner;

import Utility.Utility;

public class InsertionString {
public static void main(String[] args)
{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range of string array");
	Utility utility = new Utility();
	n = utility.inputInteger();
	System.out.println("Enter the elements");
	String[] arr = new String[n];
	for(int i=0; i<n; i++)
	{
		arr[i] = sc.nextLine();
	}
	System.out.println("Elements are:");
	for(int i=0; i<n; i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("Elements afetr sort:");
	String[] er = utility.sortString(arr, n);
	System.out.println(er);
}
}