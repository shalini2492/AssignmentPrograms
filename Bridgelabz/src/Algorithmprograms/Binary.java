package Algorithmprograms;
import Utility.Utility;
public class Binary {
public static void main(String[] args)
{
	int input;
	System.out.println("Enter a decimal number");
	Utility utility= new Utility();
	input = utility.inputInteger();
	
    utility.toBinary(input);
  // System.out.println(y);
	
}
}
