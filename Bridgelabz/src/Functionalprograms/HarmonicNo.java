package Functionalprograms;

import Utility.Utility;

public class HarmonicNo {
public static void main(String[] args)
{
//int x=10;
Utility utility = new Utility();
System.out.println("Enter the number for harmonic number");
int n = utility.inputInteger();
int sd = utility.harmonicNo(n);
System.out.println("Harmonic no is :"+sd);

}

}
