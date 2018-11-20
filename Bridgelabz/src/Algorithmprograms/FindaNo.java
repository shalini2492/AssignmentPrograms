package Algorithmprograms;

import Utility.Utility;

public class FindaNo {
public static void main(String[] args)
{
	int x, N;
	System.out.println("Enter range");
    Utility utility = new Utility();
    N = utility.inputInteger();
    System.out.println("Enter any number from 0 to " +N);
    x = utility.inputInteger();
    int h = utility.guessNo(x);
    System.out.println(x);
}
}
