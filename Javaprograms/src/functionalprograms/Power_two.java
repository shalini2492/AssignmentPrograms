package functionalprograms;

import utility.Utility;

public class Power_two {
public static void main(String[] args)
{
	
	System.out.println("Enter a number:");
    int num=Utility.inputInteger();
    System.out.println("Power of 2^"+num+" is: "+(Math.pow(2, num)));
    System.out.println();
    System.out.println("Printing all till Power Value "+num);
    
    for(int i=1;i<=num;i++)
    {
     	System.out.println("Power of 2^"+i+" is: "+(Math.pow(2, i)));	
    }
}
}
