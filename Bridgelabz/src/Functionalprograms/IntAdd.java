package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class IntAdd {
public static void main(String[] args)
{
	int n;
	int[] a;
	boolean flag;
	
	Utility utility = new Utility();
	n = utility.InputInteger();
	System.out.println("Enter array elements");
	for(int i=0; i<n; i++)
	{
		a[i]=utility.InputInteger();
	}
	
     int m = utility.triplets(a);
    System.out.println(m);
}
}
