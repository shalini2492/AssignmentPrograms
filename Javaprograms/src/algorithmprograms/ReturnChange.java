package algorithmprograms;

import utility.Utility;
public class ReturnChange {
	interface MyFunctionalInterface 
	{
		public int returnChange(int a);
	}
public static void main(String[] args)
{
	
	System.out.println("Enter no of change you want");
	int x = Utility.inputInteger();
	MyFunctionalInterface f=a->Utility.changeReturn(x);
	System.out.println(f.returnChange(x));
	//System.out.println("Change of " +x+ " is " +valofnote);
	//int i= utility.changeReturn(valofnote, noofnote);
	//System.out.println(i);
}
}
