package Algorithmprograms;

import Utility.Utility;
public class ReturnChange {
public static void main(String[] args)
{
	int valofnote=0, noofnote=0;
	int x, a[] = {1, 2, 5, 10, 50, 100, 500, 1000};
	System.out.println("Enter no of change you want");
	Utility utility = new Utility();
	x = utility.inputInteger();
	//System.out.println("Change of " +x+ " is " +valofnote);
	int i= utility.changeReturn(valofnote, noofnote);
	System.out.println(i);
}
}
