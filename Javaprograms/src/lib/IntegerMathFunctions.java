package lib;

import java.io.BufferedReader;

import java.lang.Exception;
import java.io.InputStreamReader;


import functionsandlibraries.MathFunction;
import utility.Utility;

public class IntegerMathFunctions {
public static void main(String[] args) throws Exception
{
    int choice;
	
	System.out.println("1. Harmonic value of number\n2. Sin of angle\n3.Cosine of angle\n4.Binary value of number");
	System.out.println("Enter your choice");
	choice = Utility.inputInteger();
	do{
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
	        
	        default: System.out.println("You have entered invalid input...");
	                 System.out.println("Please enter valid input..");
	                 int validNo = Utility.inputInteger();
	                 choice = validNo;
	                 
	                 
	          }
	}while(choice< 0 && choice > 12);
}
}

