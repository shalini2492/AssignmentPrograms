/* purpose: To compute the sine value of given angle 
 * author: Shalini
 * date: 28/11/2018
 * version: 1.0
 */
package functionalprograms;

//import Utility.Utility;


import utility.Utility;
public class Sin {
public static void main(String[] args) throws Exception
{
	int x;   //check output..........
	double radians=0.0, theta;
	System.out.println("Enter the number of terms..");
	x=Utility.inputInteger();
	System.out.println("Enter the value of theta in degrees..");
	theta = Utility.inputInteger();
	
   double sinVal=Utility.sine(theta, radians, x);
   System.out.println("Sine value of angle: "+theta+ " is "+sinVal);
	
	
	//convert to degrees and then display output....
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	double x = Double.parseDouble(args[0]);

    // convert x to an angle between -2 PI and 2 PI
    x = x % (2 * Math.PI);

    // compute the Taylor series approximation
    double term = 1.0;      // ith term = x^i / i!
    double sum  = 0.0;      // sum of first i terms in taylor series

    for (int i = 1; term != 0.0; i++) {
        term *= (x / i);
        if (i % 4 == 1) sum += term;
        if (i % 4 == 3) sum -= term;
    }
    System.out.println(sum);*/
	
	//double Pi=3.14519;
/*	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number of terms you wish");
	int n = Integer.parseInt(read.readLine());
	System.out.println("Enter the value of theta");
	int theta = Integer.parseInt(read.readLine());
	double radians=theta*Math.PI/180;
	System.out.println("Converted to radians: "+radians);
    Utility.sine(theta, radians, n);*/
 
}
}
