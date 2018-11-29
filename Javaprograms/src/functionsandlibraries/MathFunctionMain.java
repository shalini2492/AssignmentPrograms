package functionsandlibraries;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import utility.Utility;

public class MathFunctionMain {
public static void main(String[] args) throws Exception
{
    int choice;
	Scanner sc = new Scanner(System.in);
	System.out.println("1. Harmonic value of number\n2. Sin of angle\n3.Cosine of angle\n4.Binary value of number\n5.Square root of number\n6.isPrime\n7.Factorial of number\n8.Future Value\n9.Present value\n10.Min and Max value of integers\n11.Min and Max value of strings\n12.Check collinear using slope and area");
	System.out.println("Enter your choice");
	choice = Utility.inputInteger();
	  switch(choice)
	      {
	        case 1: 
		               int num1;
		               System.out.println("Enter any number");
		               num1 = Utility.inputInteger();
		               MathFunction.harmonicNo(num1);
	                   break;
	        case 2: 
		               double Pi=3.14519;
		               BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		               System.out.println("Enter number of terms you wish");
		               int n = Integer.parseInt(read.readLine());
		               System.out.println("Enter the value of theta");
		               int theta = Integer.parseInt(read.readLine());
		               double radians=theta*Pi/180;
		               System.out.println(radians);
		               MathFunction.sine(n);
		               break;
	        case 3: 
		               double PI=3.14519;
		               BufferedReader read1 = new BufferedReader(new InputStreamReader(System.in));
		               System.out.println("Enter number of terms you wish");
		               int num = Integer.parseInt(read1.readLine());
		               System.out.println("Enter the value of theta");
		               int thita = Integer.parseInt(read1.readLine());
		               double radian=thita*PI/180;
		               System.out.println(radian);
		               MathFunction.cosine(num);
	                   break;
	        case 4: 
		               int num4;
		               System.out.println("Enter any number");
		               num4 = Utility.inputInteger();
		               String bin = MathFunction.decimalToBinary(num4);
		               System.out.println(bin);
		               System.out.println("After swapping...");
		               MathFunction.swapNibbles(num4);
		               String dec = MathFunction.decimalToBinary(num4);
		               System.out.println("Binary representation: " +dec);
	                   break;
	        case 5:    int num5;
	                   System.out.println("Enter the number you want square root of: ");
	                   num5 = Utility.inputInteger();
	                   MathFunction.sqroot(num5);
	                   break;
	        case 6:    
	        	       int num6;
	        		   System.out.println("Enter any number");
	        	       num6 = Utility.inputInteger();
	                   boolean isPrime = MathFunction.isPrime(num6);
	        	       MathFunction.isPrime(num6);
	        	       if(isPrime)
	        	       {
	        	    	   System.out.println("Given number is prime");
	        	       }
	        	       else
	        	    	   System.out.println("Given number is not prime");
	                   break;
	        case 7:    int num7;
 	                   System.out.println("Enter the number you want factorial of: ");
	                   num7 = Utility.inputInteger();
	                   MathFunction.factorial(num7);
	                   break;
	        case 8:    int cash;
	                   double period, roi;
	                   System.out.println("Enter the cash to compute compound interest: ");
	                   cash = Utility.inputInteger();
 	                   System.out.println("Enter the rate of interest: ");
	                   roi = Utility.InputDouble();
	                   System.out.println("Enter the time period: ");
	                   period = Utility.InputDouble();
	                   MathFunction.futureValue(cash, roi, period);
	                   break;
	        case 9:    int money;
	                   double rateOfinterest, duration;
	                   System.out.println("Enter the money you want to invest: ");
	                   money = Utility.inputInteger();
	                   System.out.println("Enter the rate of interest: ");
	                   rateOfinterest = Utility.InputDouble();
	                   System.out.println("Enter the duration: ");
	                   duration = Utility.InputDouble();
	                   MathFunction.presentValue(money, rateOfinterest, duration);
	        case 10:   int size;
	                   System.out.println("Enter the size of array: ");
	                   size = Utility.inputInteger();
	                   int[] a = new int[size];
	                   System.out.println("Enter the integer elements: ");
	                   for(int i=0; i<size; i++)
	                   {
	                	   a[i] = sc.nextInt();
	                   }
	                   MathFunction.minInt(a);
	                   MathFunction.maxInt(a);
	}
}
}
