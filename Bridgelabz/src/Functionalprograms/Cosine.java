package Functionalprograms;

import static java.lang.Math.cos;
import java.lang.Math;
//import Utility.Utility;
public class Cosine {
public static void main(String[] args)
{
	double n=30;
	n = n % (2 * Math.PI);
	double accuracy = (double) 0.0001, x1, denominator, cosx, cosval;
	n = n * (double) (3.142/180.0);
	x1 = 1;
	cosx = x1;
	cosval = (double) cos(n);
	int i=1;
	do
	{
		denominator = 2 * n * (2 * n - 1);
		x1 = -x1 * n * n/denominator;
		cosx = cosx + x1;
		i = i + 1;
		
	}while(accuracy <= cosx - cosval);
	System.out.println("Cosine value of angle: " +n+ " is: " +cosx);
	//utility.cosine(n);
}
}
