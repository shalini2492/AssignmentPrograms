package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class IntAdd {
public static void main(String[] args)
{
	boolean flag=true;
	
	Utility utility = new Utility();
	System.out.println("Enter limit of array");
	int n = utility.inputInteger();
	
	int[] a=new int[n];
	System.out.println("Enter array elements");
	for(int i=0; i<n; i++)
	{
		a[i]=utility.inputInteger();
	}
	
     int[] m = utility.triplets(a);
    System.out.println(m);
}
}
