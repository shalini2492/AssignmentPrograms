/*purpose: To compute all the permutations of given string using recursive method
 * author: Shalini
 * date: 25/11/2018
 * version: 1.0
 */

package functionalprograms;

import utility.Utility;

public class Permutation {
	interface MyFunctionalInterface
	{
		public String permute(String s);
	}
static int count=0;
	public static void main(String[] args)
 {
	
		System.out.println("Enter the string: ");
		String inputString = Utility.inputString();
		MyFunctionalInterface f=s->Utility.permutation(inputString);
		System.out.println("Permutations: ");
		System.out.println(f.permute(inputString));
 }
}
