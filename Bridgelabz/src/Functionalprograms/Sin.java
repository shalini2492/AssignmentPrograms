package Functionalprograms;

//import Utility.Utility;

import static java.lang.Math.sin;

import java.lang.Math;
public class Sin {
public static void main(String[] args)
{
	double n = 30;
	//Utility utility = new Utility();
	n = n % (2 * Math.PI);
	double acc= (double) 0.0001, denominator, sinx, sinval;
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
	 System.out.println("Sine value: " +sinx);
//	utility.sine(angle);
	
}
}
