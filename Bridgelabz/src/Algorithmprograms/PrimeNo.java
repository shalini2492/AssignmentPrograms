package Algorithmprograms;

import Utility.Utility;

public class PrimeNo {
public static void main(String[] args)
{
	int range;
	int[] a = new int[1000];
	Utility utility = new Utility();
	System.out.println("Enter the range of no.");
	range = utility.inputInteger();
	int[] c = utility.prime(range);
	System.out.println(c);
	int[] d = utility.primdrome(a);
	System.out.println(d);
}
}
