package Functionalprograms;

import Utility.Utility;
public class IntOpt {
public static void main(String[] args)
{
	int a, b, c;
	int result=0;
	Utility utility = new Utility();
	System.out.println("Enter value of a,b and c");
	a = utility.inputInteger();
	b=utility.inputInteger();
	c = utility.inputInteger();
	
	//System.out.println("First operation result: " +(a+(b*c)));
	int g = utility.intOpt(a,b,c);
	System.out.println(g);
}
}