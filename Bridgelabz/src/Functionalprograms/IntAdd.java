package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class IntAdd {
public static void main(String[] args)
{
	boolean flag;
	
	Utility utility = new Utility();
	System.out.println("Enter limit of array");
	int n = utility.InputInteger();
	
	int[] a=new int[n];
	System.out.println("Enter array elements");
	for(int i=0; i<n; i++)
	{
		a[i]=utility.InputInteger();
	}
	
     int m = utility.triplets(a);
    System.out.println(m);
}
}
