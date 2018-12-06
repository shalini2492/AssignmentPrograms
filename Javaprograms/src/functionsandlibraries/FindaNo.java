package functionsandlibraries;

import utility.Utility;

public class FindaNo {
public static void main(String[] args)
{
	int n=Integer.parseInt(args[0]);
	System.out.println("is ");
	int low=0;
	int high=n-1;
	int item=Utility.guessNo(low,high);
	System.out.println("the number is "+item);
}
}
