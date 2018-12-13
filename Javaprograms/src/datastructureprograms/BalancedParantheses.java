package datastructureprograms;

import utility.Utility;
public class BalancedParantheses {
public static void main(String[] args)
{
	
	System.out.println("Enter an expression: ");
	String expression=Utility.inputString();
	
	if(Utility.isBalanced(expression) == true)
	{
		System.out.println("The given expression has balanced parantheses");
	}
	else
	{
		System.out.println("The given expression does not have balanced parantheses");
	}
	
}

}
