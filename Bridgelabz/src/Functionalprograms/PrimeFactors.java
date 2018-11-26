package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class PrimeFactors {
public static void main(String[] args)
{
int n;

Utility utility = new Utility();
System.out.println("Enter the number for factorization");
n= utility.inputInteger();
System.out.println("The factors of " +n+ " are: ");
Integer i = utility.factors(n);
System.out.println(i);
}
}
