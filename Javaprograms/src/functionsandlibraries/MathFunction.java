package functionsandlibraries;

import java.util.Scanner;

public class MathFunction {
	
	
     static Scanner sc = new Scanner(System.in);
	/**************************Harmonic Number**************************/
	
	public static void harmonicNo(int number)
	{
		System.out.println("The Harmonic series is :");
		double result =0.0;
		while(number > 0)
		{
			result = result + (double) 1/number;
			number--;
			System.out.println(result+ " ");
		}
		System.out.println(" ");
	}
	
	/*************************************Sine of angle*********************************/
	
	/*This method will compute the sine value of given input angle and will convert it to radians and then return take sine value and return.
	*/
	public static void sine(double n)
	{
		int theta=sc.nextInt();
		double radians=Math.toRadians(theta);
		int pow=1;
		double sinx=0.0;
		for(int i=1; i<=n; i++)
		{
			double current_term=0.0;
			if(i%2 == 0)
			{
		        current_term = -Math.pow(radians, pow)/ fact(pow);
			}
			else
			{
				current_term = Math.pow(radians, pow)/ fact(pow);
			}
			sinx = sinx + current_term;
		     pow = pow + 2;
		}
		System.out.println(sinx);
		
	/*	double acc= (double) 0.0001, denominator, sinx, sinval;
		 n = n * (double) (3.142 / 180.0);
		 double x1 = n;
		 sinx = n;
		 sinval = (double) sin(n);
		 int i=1;
		 do
		 {
			 denominator = 2 * n * (2 * n + 1);
			 x1 = -x1 * n * n/ denominator;
			 sinx = sinx + x1;
			 i = i + 1;
		 }while(acc <= sinx - sinval);
		 System.out.println(sinx);*/
	}

	public static int fact(int no)
	{
		int fact=1;
		for(int i=0; i<no; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	/******************************Cosine of angle****************************/
	
	/*This method will calculate the cosine value of user input angle and will return cosine value*/

	public static void cosine(double x)
	{
		int theta=sc.nextInt();
		double radians=Math.toRadians(theta);
		int pow=1;
		double cosx=0.0;
		for(int i=1; i<=x; i++)
		{
			double current_term=0.0;
			if(i%2 == 0)
			{
		        current_term = Math.pow(radians, pow)/ fact(pow);
			}
			else
			{
				current_term = -Math.pow(radians, pow)/ fact(pow);
			}
			cosx = cosx + current_term;
		     pow = pow + 2;
		}
		System.out.println(cosx);
	}
	
	/************************************Binary value of integer******************************/
	
	/**
	 * Function is used to convert decimal to binary
	 * 
	 * @param decimal the decimal number which is converted into binary
	 * @return the binary number which is type of string
	 */
	public static String decimalToBinary(int decimal) 
	{
		String binaryNoInString="";
		String temporary="";
		int number=decimal;
		while(number>=1)
		{
			binaryNoInString=binaryNoInString+number%2;
			number=number/2;
		}
		if(binaryNoInString.length()>0 && binaryNoInString.length()<8)
		{
			binaryNoInString+=giveZero(8-binaryNoInString.length());
		}
		for(int i=binaryNoInString.length()-1;i>=0;i--)
		{
			temporary+=binaryNoInString.charAt(i);
		}
		binaryNoInString=temporary;
		return binaryNoInString;
	}

	/**
	* @param numberofzeroRequired the number of zero the user needs
	* @return the string value 
	*/
	public static String giveZero(int addZero) {
		String s ="";
		for(int i=0;i<addZero;i++)
		{
			s=s+0;
		}
		return s;
	}
	/**
	 * @param binary the binary number which is in string type, and will converted in decimal value
	 * @return returns decimal value of the given binary
	 */
	public static int binaryToDecimal(String binary)
	{
		int decimal=0;
		int index=0;
		for(int i=binary.length()-1;i>=0;i--)
		{
			if(binary.charAt(i)=='1')
			{
				decimal=decimal+(int)Math.pow(2, index);
			}
			index++;
		}
		return decimal;
	}

	/***************Conversion of decimal to binary********************/

	public static void toBinry(int input)
	{
		int[] bin = new int[100];
		int i=0;
		while(input > 0)
		{
			bin[i] = input%2; //remainder is determined as binary value.
			input = input/2;  //divisor is set as next input.
			i++;
		}
		for(int j=i-1; j>=0; j--)
		{
			System.out.print(bin[j]); //displaying binary representation of no.
		
		//System.out.println(bin[i]);
	    }
	}
	
/***************************Square root of number using Newton's method***************************/
	
	public static void sqroot(int c)
	{
		double epsilon = 1e-15;  //relative error tolerance
		double t=c;  //assume square root of c
		while(Math.abs(t-c/t) > epsilon*t)
	//repeatedly apply newton's method till the desired accuracy is not achieved.		
		{
			t = (t+ (c/t))/2.0;
		}
		System.out.println("Sqaure root of " +c+ " is:" +t);
			
	}
	
/******************************Number is prime or not***********************/
	
public static boolean isPrime(int number)
{
	//boolean isPrime=true;
	if(number%2 == 0)
	{
		return false;
	}
	return true;
}

/**************************Factorial of long type variable***************************/

public static long factorial(int input)
{
	long fact=1;
    while(fact>input)
      {
	     fact = fact * input;
      }

return fact;
}

public static void swapNibbles(int x)
{
	int h=((x & 0x0F) << 4 | (x & 0xF0) >> 4); //Bitwise operators are used to shift 
    //bits of nibbles
System.out.println(h);
}

/*********************Compute compound interest**************************/

public static void futureValue(int principal, double rate, double time)
{
	double compoundInterest = principal * Math.pow((1/rate), time);
	System.out.println("Compound interest: "+compoundInterest);
}

/**************************compute present value**********************/

public static void presentValue(int p, double r, double t)
{
	double present = p / Math.pow((1 + r), t);
	System.out.println("Present Value: "+present);
}

/********************Minimum and maximum value of integer array*************************/

public static void minInt(int[] arr)
{
	int i, j;
	int flag=0;
	for(i=0; i<10; i++)
	{
		for(j=1; j<10; j++)
		{
			if(arr[i] < arr[j])
			{
				flag=1;
			}
			else
				flag=0;
		}
		
	}
	System.out.println("Minimum value in array: "+arr[i]);
}

public static void maxInt(int[] ar)
{
	int i, j;
	for(i=0; i<10; i++)
	{
		for(j=1; j<10; j++)
		{
			if(ar[i] > ar[j])
			{
				System.out.println();
			}
		}
		
	}
	System.out.println("Maximum value in array: " +ar[i]);
}

}
