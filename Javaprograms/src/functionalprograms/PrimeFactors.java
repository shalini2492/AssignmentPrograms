package functionalprograms;

import utility.Utility;

public class PrimeFactors {
public static void main(String[] args)
{
int n;

System.out.println("Enter the number for factorization");
n= Utility.inputInteger();
System.out.println("The factors of " +n+ " are: ");
Integer i = Utility.factors(n);
System.out.println(i);
}
}
