package functionsandlibraries;

import utility.Utility;

public class FindaNo {
public static void main(String[] args)
{
	int n=Integer.parseInt(args[0]);
	int num=(int) Math.pow(2, n);
	System.out.println("is "+num);
	int low=0;
	int high=num-1;
	int item=Utility.guessNo(low,high);
	System.out.println("the number is "+item);
}
}
