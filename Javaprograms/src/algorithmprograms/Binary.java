package algorithmprograms;
import utility.Utility;
public class Binary {
public static void main(String[] args)
{
	        
	String swappedBinary;
	
	//System.out.println("enter a decimal number");
	int decimal=Integer.parseInt(args[0]);
	//Convert decimal to binary
	String binary=Utility.decimalToBinary(decimal);
	System.out.println("binary :"+binary);
	//Swapped two nibbles
	swappedBinary=binary.substring(4, 8)+binary.substring(0,4);
	System.out.println("swapped:"+swappedBinary);
	//Convert binary to decimal
	int swappedDec=Utility.binaryToDecimal(swappedBinary);
	System.out.println("Decimal value after swapping :"+decimal+" is "+swappedDec);
	for(int i=1;i<Math.sqrt(swappedDec);i++)
	{
		if(swappedDec%Math.pow(2, i)==0)
		{
			System.out.println("The swapped number :"+swappedDec+
					" is divisble by "+i+"th power of 2");
			return;
		}
	}
	System.out.println("the swapped number "+swappedDec+
			" is divisble by any power of 2");
	
}
}
