package algorithmprograms;

import utility.Utility;
public class SquareRoot {
public static void main(String[] args)
{
	int c;
	Utility utility = new Utility();
	System.out.println("Enter a number you want square root of: ");
	c= utility.inputInteger();
	double epsilon = 1e-15;
	double t=c;
	
	utility.sqroot(c);
	
}
}
