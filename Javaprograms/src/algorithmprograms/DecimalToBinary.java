package algorithmprograms;

import utility.Utility;
public class DecimalToBinary {
	interface MyFunctionalInterface
	{
		public String binaryNumber(int dec);
	}
public static void main(String[] args)
{
	int in;
	
	System.out.println("Enter a decimal number");
	in = Utility.inputInteger();
	MyFunctionalInterface f = dec-> Utility.binary(in);
	System.out.println("Decimal to binary: "+f.binaryNumber(in));
}
}
