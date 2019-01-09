package algorithmprograms;
import utility.Utility;
public class Binary {
	interface MyFunctionalInterface
	{
		public String toBinary(int bin);
		
	}
	interface MyFunction
	{
		public int toDec(String dec);
	}
public static void main(String[] args)
{
	        
	String swappedBinary;
	
	//System.out.println("enter a decimal number");
	int decimal=Integer.parseInt(args[0]);
	//Convert decimal to binary
	MyFunctionalInterface f=bin -> Utility.decimalToBinary(decimal);
	System.out.println("binary :"+f.toBinary(decimal));
	//Swapped two nibbles
	swappedBinary=f.toBinary(decimal).substring(4, 8)+f.toBinary(decimal).substring(0,4);
	System.out.println("swapped:"+swappedBinary);
	//Convert binary to decimal
	MyFunction fun=dec -> Utility.binaryToDecimal(swappedBinary);
	System.out.println("Decimal value after swapping :"+decimal+" is "+fun.toDec(f.toBinary(decimal)));
	for(int i=1;i<Math.sqrt(fun.toDec(swappedBinary));i++)
	{
		if(fun.toDec(swappedBinary)%Math.pow(2, i)==0)
		{
			System.out.println("The swapped number :"+f.toBinary(decimal)+
					" is divisible by "+i+"th power of 2");
			return;
		}
	}
	System.out.println("the swapped number "+f.toBinary(decimal)+
			" is divisble by any power of 2");
	
}
}
