package functionalprograms;

import utility.Utility;
public class IntOpt {
public static void main(String[] args)
{
	int a, b, c;
	System.out.println("Enter value of a,b and c");
	a = Utility.inputInteger();
	b = Utility.inputInteger();
	c = Utility.inputInteger();
	
	//System.out.println("First operation result: " +(a+(b*c)));
	int g = Utility.intOpt(a,b,c);
	System.out.println(g);
}
}
