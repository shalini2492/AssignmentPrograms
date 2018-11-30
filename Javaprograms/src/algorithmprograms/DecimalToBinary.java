package algorithmprograms;

import utility.Utility;
public class DecimalToBinary {
public static void main(String[] args)
{
	int in;
	
	System.out.println("Enter a decimal number");
	in = Utility.inputInteger();
	String bin = Utility.binary(in);
	System.out.println("Decimal to binary: "+bin);
}
}
