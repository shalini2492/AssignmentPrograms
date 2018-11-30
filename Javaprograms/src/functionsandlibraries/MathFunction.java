/*purpose: To add logical part of the program under the class MathFunction and creating different static methods for each program
 * author: Shalini
 * created on: 29/11/2018
 * version: 1.0
 */
package functionsandlibraries;


import java.util.Scanner;

public class MathFunction {
	
	
     static Scanner sc = new Scanner(System.in);
	/**************************Harmonic Number**************************/
     /**This method will return the harmonic series of a given integer number and print the sum of the series
      * 
      * @param number user input integer number
      */
	
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
	 * 
	 */
	
	public static void sine(double n)
	{
		int theta=sc.nextInt();
		double radians=Math.toRadians(theta);
		int pow=1;
		double sinx=0.0;
		for(int i=1; i<=n; i+=2)
		{
			double current_term=0.0;
			if(i%2 > 0)
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
	
	/*This method will calculate the cosine value of user input angle and will return cosine value
	 * 
	 */

	public static void cosine(double x)
	{
		int theta=sc.nextInt();
		double radians=Math.toRadians(theta);
		int pow=2;
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
		String binaryNo="";
		String temporary="";
		int num=decimal;
		while(num>=1)
		{
			binaryNo=binaryNo+num%2;
			num=num/2;
		}
		if(binaryNo.length()>0 && binaryNo.length()<8)
		{
			binaryNo+=appendZero(8-binaryNo.length());
		}
		for(int i=binaryNo.length()-1;i>=0;i--)
		{
			temporary+=binaryNo.charAt(i);
		}
		binaryNo=temporary;
		return binaryNo;
	}

	/**
	* @param numberofzeroRequired the number of zero the user needs
	* @return the string value 
	*/
	public static String appendZero(int addZero) {
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

	/*****This method will return the binary representation of decimal number.
	 * 
	 * @param input user input integer number
	 */

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
	
/***This method will compute the square root of given number using Newton's method
 * 
 * @param c user input
 */
	
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
	
/*****This method will return true if given number is prime nu,ber else will return false if the number is not prime
 * 
 * @param number user input
 * @return boolean result
 */
	
public static boolean isPrime(int number)
{
	//boolean isPrime=true;
	if(number%2 == 0)
	{
		return false;
	}
	return true;
}

/****This method will return factorial of long type variable.
 * 
 * @param input user input long number
 * @return factorial
 */

public static long factorial(int input)
{
	long fact=1;
    while(fact>input)
      {
	     fact = fact * input;
      }

return fact;
}

/**This method is used to swap the 4 byte nibbles i.e. binary representation of a decimal number
 * 
 * @param x input binary number
 */
public static void swapNibbles(int x)
{
	int h=((x & 0x0F) << 4 | (x & 0xF0) >> 4); //Bitwise operators are used to shift 
    //bits of nibbles
System.out.println(h);
}

/*******This method is used to calculate compound interest 
 * 
 * @param principal principal amount to invest
 * @param rate rate of interest 
 * @param time duration 
 */

public static void futureValue(int principal, double rate, double time)
{
	double compoundInterest = principal * Math.pow((1+rate), time);
	System.out.println("Compound interest: "+compoundInterest);
}

/****This method will return the present value of the amount of money that would have to be invested now, at the compound interest
rate r per period, to obtain a cash flow of C in T periods.
*/


public static void presentValue(int p, double r, double t)
{
	double present = p / Math.pow((1 + r), t);
	System.out.println("Present Value: "+present);
}

/****This method will return the minimum element in the array of integers
 * 
 * @param arr array of type integer
 * @param size size of array
 */

public static void minInt(int[] arr, int size)
{
    int i; 
    
    // Initialize maximum element 
    int min = arr[0]; 
   
    // Traverse array elements from second and 
    // compare every element with current max   
    for (i = 1; i < arr.length; i++) 
        if (arr[i] < min) 
            min = arr[i]; 
   System.out.println("Minimum element: "+min);

}

/**This method will return maximum element in the array of integers
 * 
 * @param arr input array of type integer
 * @param size size of array
 */

public static void maxInt(int[] arr, int size)
{
	int i; 
    
    // Initialize maximum element 
    int max = arr[0]; 
   
    // Traverse array elements from second and 
    // compare every element with current max   
    for (i = 1; i < arr.length; i++) 
        if (arr[i] > max) 
            max = arr[i]; 
   System.out.println("Maximum element: "+max);
}

/**This method returns the minimum string from the array of string
 * 
 * @param str for array of string
 * @param n size of string array
 */

public static void minStrArray(String[] str, int n)
{
	int i=0;
	String min = str[0];
	int j = i+1;
	for(i=0; i<n; i++)
	{
		
		if(str[i].length() < str[j].length())
		{
			min = str[i];
		}
	}
	System.out.println("Minimum length of string: "+min);
}

/**This method returns the maximum string from the string array
 * 
 */

public static void maxStrArray(String[] s, int no)
{
	int i=0;
	String max  =s[0];
	int j=i+1;
	for(i=0; i<no; i++)
	{
		if(s[i].length() > s[j].length())
		{
			max = s[i];
		}
	}
	System.out.println("Maximum length of string: "+max);
}

/****This method will check if the given points A, B and C are collinear or not by computing slope formula
 * 
 * @param x1 x coordinate of point A
 * @param y1 y coordinate of point A
 * @param x2 x coordinate of point B
 * @param y2 y coordinate of point B
 * @param x3 x coordinate of point C
 * @param y3 y coordinate of point C
 * @return boolean result
 */
 public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3)
 {
	 double slopeAB, slopeBC, slopeAC;
	 slopeAB = (x2-x1)/(y2-y1);
	 slopeBC = (x3-x2)/(y3-y2);
	 slopeAC = (x3-x1)/(y3-y1);
	 if(slopeAB == slopeBC && slopeAB ==slopeAC && slopeBC == slopeAC)
	 {
		 return true;
	 }
	 return false;
 }
 
 public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3)
 {
	 int xi, xj, yi, yj;
	 xi = x1-x2;
	 xj = x2-x3;
	 yi = y1-y2;
	 yj = y2-y3;
	 double areaOftriangle = ((xi*xj)-(yi*yj))/2;
     System.out.println("Area of triangle: "+areaOftriangle);
     if(areaOftriangle == 0)
     {
    	 return true;
     }
     return false;
 }
}