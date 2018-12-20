/* purpose : To compute cosine value of given angle
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;

import static java.lang.Math.cos;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;
//import Utility.Utility;
public class Cosine {
public static void main(String[] args) throws Exception
{
	double Pi=3.14519;
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of terms you wish");
	int n = Integer.parseInt(read.readLine());
	System.out.println("Enter the value of theta");
	int theta = Integer.parseInt(read.readLine());
	double radians=theta*Pi/180;
	System.out.println(radians);
	
	
	/*double n=30;
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
	//utility.cosine(n);*/
}
}
