/**purpose: To find whether the given expression has balanced parentheses
 * author: Shalini
 * date: 13/12/2018
 * version: 1.0
 */

package datastructureprograms;

import utility.Utility;
public class BalancedParentheses {
public static void main(String[] args)
{
	
	System.out.println("Enter an expression: ");
	String expression=Utility.inputString();
	
	if(Utility.isBalanced(expression) == true)
	{
		System.out.println("The given expression has balanced parentheses");
	}
	else
	{
		System.out.println("The given expression does not have balanced parentheses");
	}
	
}

}
