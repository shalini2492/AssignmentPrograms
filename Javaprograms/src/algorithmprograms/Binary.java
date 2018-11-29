package algorithmprograms;
import utility.Utility;
public class Binary {
public static void main(String[] args)
{
	Utility utility=new Utility();        //command line arguments
	String swapedBinary;
	//Initlizing varblies
	System.out.println("enter a decimal number");
	int decimal=utility.inputInteger();
	//Convert decimal to binary
	String binary=Utility.decimalToBinary(decimal);
	System.out.println("binary :"+binary);
	//Swapped two nibbles
	swapedBinary=binary.substring(4, 8)+binary.substring(0,4);
	System.out.println("swapped:"+swapedBinary);
	//Convert binary to decimal
	int swapedDecimal=Utility.binaryToDecimal(swapedBinary);
	System.out.println("Decimal value after swapping :"+decimal+" is "+swapedDecimal);
	for(int i=1;i<Math.sqrt(swapedDecimal);i++)
	{
		if(swapedDecimal%Math.pow(2, i)==0)
		{
			System.out.println("The swapped number :"+swapedDecimal+
					" is divisble by "+i+"th power of 2");
			return;
		}
	}
	System.out.println("the swapped number "+swapedDecimal+
			" is divisble by any power of 2");
	
}
}
