/*purpose: To return all prime factors of the given number
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;

import utility.Utility;

public class PrimeFactors {
	interface MyFunctionalInterface
	{
		public int factors(int a);
	}
public static void main(String[] args)
{
int n; 

System.out.println("Enter the number for factorization");
n= Utility.inputInteger();
System.out.println("The factors of " +n+ " are: ");
MyFunctionalInterface f=a-> Utility.factors(n);
System.out.println(f.factors(n));
}
}
